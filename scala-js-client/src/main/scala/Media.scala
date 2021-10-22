import org.scalajs.dom
import org.scalajs.dom.raw.HTMLLinkElement

class Media {

 private val multimedia = Map(
  "multimedia-header" -> Array("Multimedia", "Мультимедиа", "Multimediya"),
  "sub-menu-home-for-media" -> Array("Home", "Главное", "Bosh sahifa"),
  "sub-menu-multimedia" -> Array("Multimedia", "Мультимедиа", "Multimediya"),
  "upcomingVideos" -> Array("Multimedia", "Мультимедиа", "Multimediya"),
  "month-for-video1" -> Array("May", "Май", "May"),
  "videoName1" -> Array("Dance Magic 2019", "Магия танца 2019", "Raqs Sehri 2019"),
  "month-for-video2" -> Array("Feb", "Фев", "Fev"),
  "videoName2" -> Array("\"Visit Holy Places of Khorezm\"", "«Посещение святых мест Хорезма»", "\"Xorazmning muqaddas joylariga tashrif buyuring\""),
  "month-for-video3" -> Array("Apr", "Апр", "Apr"),
  "videoName3" -> Array("Tourism Potential of Khorezm in number", "Туристический потенциал Хорезма в цифрах", "Xorazmning sayyohlik sayohati raqamlarda"),
  "month-for-video4" -> Array("Apr", "Апр", "Apr"),
  "videoName4" -> Array("Khiva", "Хива", "Xiva")
 )

 def create(lang: Int): Unit = multimedia.keys.foreach(
  item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = multimedia(item)(lang)
 )
}
