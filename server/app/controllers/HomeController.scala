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
  def turtkol(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.turtkol(lang))
  }
  def khanka(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.khanka(lang))
  }
  def shovot(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.shovot(lang))
  }
  def pitnak(lang: String): Action[AnyContent] = Action {
    Ok(html.citiesPage.pitnak(lang))
  }
  /*--------------*/
  def archeology(lang: String): Action[AnyContent] = Action {
    Ok(html.archeologies(lang))
  }
  def architecture(lang: String): Action[AnyContent] = Action {
    Ok(html.architectures(lang))
  }
  def art(lang: String): Action[AnyContent] = Action {
    Ok(html.art(lang))
  }
  def forum(lang: String): Action[AnyContent] = Action {
    Ok(html.forum(lang))
  }
  def dorul(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.dorul_hikmat(lang))
  }
  def qatagon(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.qatagon(lang))
  }
  def khorezm(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.khorezm(lang))
  }
  def music(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.music(lang))
  }
  def tasviriy(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.tasviriy(lang))
  }
  def department(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.department(lang))
  }
  def amaliy(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.amaliy(lang))
  }
  def ichanqala(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.ichanQala(lang))
  }
  def devonov(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.devonov(lang))
  }
  def nurullaboy(lang: String): Action[AnyContent] = Action {
    Ok(html.exhibitions.nurullaboy(lang))
  }
  def qoshaDarvoza(lang: String): Action[AnyContent] = Action {
    Ok(html.mainPageExhibitions.qosha_darvoza(lang))
  }
  def aminxon(lang: String): Action[AnyContent] = Action {
    Ok(html.mainPageExhibitions.aminxon(lang))
  }
  def aminxon2(lang: String): Action[AnyContent] = Action {
    Ok(html.mainPageExhibitions.aminxon2(lang))
  }
  def niqob(lang: String): Action[AnyContent] = Action {
    Ok(html.mainPageExhibitions.niqob(lang))
  }
  def islomxoja(lang: String): Action[AnyContent] = Action {
    Ok(html.mainPageExhibitions.islomxoja(lang))
  }
  def sayyid(lang: String): Action[AnyContent] = Action {
    Ok(html.mainPageExhibitions.sayyid(lang))
  }
  def comingSoon(lang: String): Action[AnyContent] = Action {
    Ok(html.common.comingsoon(lang))
  }
}
