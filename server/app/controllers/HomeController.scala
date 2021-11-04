package controllers

import javax.inject._
import play.api.mvc._
import views._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(lang: String): Action[AnyContent] = Action {
    Ok(html.index(lang))
  }

  def events(lang: String): Action[AnyContent] = Action {
    Ok(html.events(lang))
  }

  def multimedia(lang: String): Action[AnyContent] = Action {
    Ok(html.multimedia(lang))
  }
  def interactiveServices(lang: String): Action[AnyContent] = Action {
    Ok(html.interactive_services(lang))
  }

  def antiquePeriod(lang: String): Action[AnyContent] = Action {
    Ok(html.antique_period(lang))
  }

  def ancientPeriod(lang: String): Action[AnyContent] = Action {
    Ok(html.ancient_period(lang))
  }

  def earlyMiddleAges(lang: String): Action[AnyContent] = Action {
    Ok(html.early_middle_ages(lang))
  }
  def nineFifteenthCenturies(lang: String): Action[AnyContent] = Action {
    Ok(html.nine_fifteenth_centuries(lang))
  }
  def sixteenTwentiethCenturies(lang: String): Action[AnyContent] = Action {
    Ok(html.sixteen_twentieth_centuries(lang))
  }
  def independencePage(lang: String): Action[AnyContent] = Action {
    Ok(html.independence(lang))
  }
//  CITiES
  def urgench(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.urgench(lang))
  }
  def khiva(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.khiva(lang))
  }
  def khazorasp(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.khazorasp(lang))
  }
  def tashhovuz(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.tashhovuz(lang))
  }
  /*--------------*/
  def monumentsPage(lang: String): Action[AnyContent] = Action {
    Ok(html.monuments(lang))
  }
  def art(lang: String): Action[AnyContent] = Action {
    Ok(html.art(lang))
  }
  def forum(lang: String): Action[AnyContent] = Action {
    Ok(html.forum(lang))
  }
  def comingSoon(lang: String): Action[AnyContent] = Action {
    Ok(html.common.comingsoon(lang))
  }
}
