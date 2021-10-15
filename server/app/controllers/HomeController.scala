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

  def antiquePeriod(): Action[AnyContent] = Action {
    Ok(html.antique_period())
  }

  def ancientPeriod(): Action[AnyContent] = Action {
    Ok(html.ancient_period())
  }

  def earlyMiddleAges(): Action[AnyContent] = Action {
    Ok(html.early_middle_ages())
  }

  def cities(): Action[AnyContent] = Action {
    Ok(html.cities())
  }
}
