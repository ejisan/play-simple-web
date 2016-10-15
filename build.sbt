name := """play-simple-web"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

// Resolvers
resolvers += "Ejisan Github" at "https://ejisan.github.io/repo/"

// Dependencies
libraryDependencies ++= Seq(
  "com.ejisan" %% "play-pagemeta" % "2.0.1",
  "com.ejisan" %% "play-form" % "3.0.1",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

// Web Jars Dependencies
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars.bower" % "compass-mixins" % "1.0.2",
  "org.webjars" % "foundation" % "6.2.3",
  "org.webjars" % "jquery" % "2.2.4"
)

dependencyOverrides += "org.webjars" % "jquery" % "2.2.4"

TwirlKeys.templateImports += "ejisan.play.libs.PageMeta"
