package controllers

import javax.inject._
import play.api.mvc._
import views._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action {
    Ok(html.index())
  }

  def events(): Action[AnyContent] = Action {
    Ok(html.events())
  }

  def multimedia(): Action[AnyContent] = Action {
    Ok(html.multimedia())
  }
  def interactiveServices(): Action[AnyContent] = Action {
    Ok(html.interactive_services())
  }

  def antiquePeriod(): Action[AnyContent] = Action {
    Ok(html.antique_period())
  }

  def ancientPeriod(): Action[AnyContent] = Action {
    Ok(html.ancient_period())
  }

  def earlyMiddleAges(): Action[AnyContent] = Action {
    Ok(html.early_middle_ages())
  }
  def nineFifteenthCenturies(): Action[AnyContent] = Action {
    Ok(html.nine_fifteenth_centuries())
  }
  def sixteenTwentiethCenturies(): Action[AnyContent] = Action {
    Ok(html.sixteen_twentieth_centuries())
  }
  def independencePage(): Action[AnyContent] = Action {
    Ok(html.independence())
  }
  def cities(): Action[AnyContent] = Action {
    Ok(html.cities())
  }
  def monumentsPage(): Action[AnyContent] = Action {
    Ok(html.monuments())
  }
  def forum(): Action[AnyContent] = Action {
    Ok(html.forum())
  }
  def comingSoon(): Action[AnyContent] = Action {
    Ok(html.common.comingsoon())
  }
}
