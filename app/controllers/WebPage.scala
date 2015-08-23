package controllers

import ejisan.play.libs.{ PageMetaSupport, PageMetaApi }

import javax.inject.{ Inject, Singleton }
import play.api.i18n.{ I18nSupport, MessagesApi }
import play.api.mvc._

@Singleton
class WebPage @Inject() (
  final val messagesApi: MessagesApi,
  final val pageMetaApi: PageMetaApi
) extends Controller with I18nSupport with PageMetaSupport {
  /** Home page */
  def index = Action { implicit request =>
    Ok(views.html.index())
  }

}
