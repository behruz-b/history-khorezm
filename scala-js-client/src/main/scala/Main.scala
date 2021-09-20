import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.dom
import org.scalajs.dom.raw._


object Main extends App {
  dom.document.getElementById("menuHome").asInstanceOf[HTMLLinkElement].innerText = "Home"
  @JSExportTopLevel("contentTranslate")
  def contentTranslate(): Unit = {
    dom.document.getElementById("menuHome").asInstanceOf[HTMLLinkElement].innerText = "Bosh"
  }

}
