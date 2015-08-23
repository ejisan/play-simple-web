name := "play-simple-web"

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

// Dependencies
libraryDependencies ++= Seq(
  "com.ejisan" %% "play-pagemeta" % "1.1.0",
  specs2 % Test
)

// Web Jars Dependencies
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars" % "jquery" % "2.1.4",
  "org.webjars" % "foundation" % "5.5.2"
)
dependencyOverrides += "org.webjars" % "jquery" % "2.1.4"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

// Resolvers
resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Ejisan Github" at "https://ejisan.github.io/repo/"

// Twirl importing classes
TwirlKeys.templateImports += "ejisan.play.libs.PageMeta"

// Sass compiler options
sassOptions in Assets ++= Seq("--compass", "-r", "compass")
sassOptions in Assets ++= Seq("--cache-location", "target/web/sass/.sass-cache")

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// Scala compiler options
scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-optimise",
  "-explaintypes",
  "-encoding", "UTF-8",
  "-Xlint"
)
