import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.dom
import org.scalajs.dom.raw._


object Main extends App {
  val elements = Map(
    "menuHome" -> Array("Home", "Главное", "Bosh")
  )
  dom.document.getElementById("menuHome").asInstanceOf[HTMLLinkElement].innerText = elements("menuHome")(0)
  @JSExportTopLevel("contentTranslate")
  def contentTranslate(languange: String): Unit = {
    val lang = languange match {
      case "en" => 0
      case "ru" => 1
      case "uz" => 2
    }
    dom.document.getElementById("menuHome").asInstanceOf[HTMLLinkElement].innerText = elements("menuHome")(lang)
  }

}
