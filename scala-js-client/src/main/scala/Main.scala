import org.scalajs.dom
import org.scalajs.dom.raw._

import scala.scalajs.js.annotation.JSExportTopLevel


object Main extends App {
  val elements = Map(
    "siteTitle" -> Array("History of Khorezm", "История Хорезма", "Xorazm tarixi"),
    "menuHome" -> Array("Home", "Главное", "Bosh sahifa"),
    "menuNews" -> Array("News", "Новости", "Yangiliklar"),
    "menuAboutKhorezm" -> Array("About Khorezm", "О Хорезме", "Xorazm haqida"),
    "subMenuHistoryOfKhorezm" -> Array("History of Khorezm", "История Хорезма", "Xorazm tarixi"),
    "dropMenuAntiquePeriod" -> Array("Khorezm in the antique period", "Хорезм в античный периода", "Antik davrda Xorazm"),
    "dropMenuAncientPeriod" -> Array("Khorezm in ancient period", "Хорезм в древний период", "Qadimgi davrda Xorazm"),
    "dropMenuMiddleAges" -> Array("Khorezm in the early Middle Ages", "Хорезм в раннем средневековье", "O\'rta asr boshlarida Xorazm"),
    "dropMenuNinthFifteenth" -> Array("Khorezm in IX-XV centuries", "Хорезм в IX-XV вв", "IX-XV asrlarda Xorazm"),
    "dropMenuSixteenthTwentieth" -> Array("Khorezm in the XVI-XX centuries", "Хорезм в XVI-XX веках", "XVI-XX asrlarda Xorazm"),
    "dropMenuIndependenceTime" -> Array("Khorezm in the independence time", "Хорезм во времена Независимости", "Xorazm Mustaqillik davrida"),
    "subMenuKhorezmCities" -> Array("Khorezm cities", "Города Хорезма", "Xorazm shaharlari"),
    "subMenuKhorezmCultures" -> Array("Khorezm's cultural heritage monuments", "Памятники культурного наследия Хорезма", "Xorazm madaniy merosi yodgorliklari"),
    "subMenuArtOfKhorezm" -> Array("Art works of Khorezm", "Произведения искусства Хорезма", "Xorazm san'at asarlari"),
    "menuInteractiveServices" -> Array("Interactive services", "Интерактивные сервисы", "Interaktiv xizmatlar"),
    "menuMultimedia" -> Array("Multimedia", "Мультимедиа", "Multimediya"),
    "menuOpenData" -> Array("Open Data", "Открытые данные", "Ochiq ma\'lumotlar"),
    "menuForum" -> Array("Forum", "Форум", "Forum"),
    "footerAboutWebSite" -> Array(
      "This website is owned by the Ministry of Innovation Development of the Republic of Uzbekistan I-FA-2019-25 code “HISTORY, CULTURAL HERITAGE, MONUMENTS OF KHOREZM CITIES AND CREATION OF SMART TECHNOLOGIES ON THE BASIS OF RESEARCH OF WORKS OF ART ” created as part of a project on the subject.",
      "Этот сайт принадлежит Министерству инновационного развития Республики Узбекистан. Код I-FA-2019-25 «ИСТОРИЯ, КУЛЬТУРНОЕ НАСЛЕДИЕ, ПАМЯТНИКИ ГОРОДА ХОРЕЗМА. И СОЗДАНИЕ УМНЫХ ТЕХНОЛОГИЙ НА ОСНОВЕ ИССЛЕДОВАНИЯ ХУДОЖЕСТВЕННЫХ ПРОИЗВОДСТВ » создан как часть проекта по данной теме.",
      "Mazkur web sahifa O‘zbekiston Respublikasi Innovasion rivojlanish vazirligining I-FA-2019-25 shifrli “XORAZM SHAHARLARINING TARIXI, MADANIY MEROSLARI, OBIDALARI VA SAN’AT ASARLARINING TADQIQOTLARI ASOSIDA SMART TEXNOLOGIYALARINI YARATISH” mavzusidagi loyihasi doirasida yaratilgan."),
    "allRightReserved" -> Array("All Rights Reserved", "Все права защищены", "Barcha huquqlar himoyalangan")
  )
  elements.keys.foreach(
    menu => {
      dom.document.getElementById(menu).asInstanceOf[HTMLLinkElement].innerText = elements(menu)(0)
    }
  )
  @JSExportTopLevel("contentTranslate")
  def contentTranslate(languange: String): Unit = {
    val lang = languange match {
      case "en" => 0
      case "ru" => 1
      case "uz" => 2
    }
    elements.keys.foreach(
      menu => {
        dom.document.getElementById(menu).asInstanceOf[HTMLLinkElement].innerText = elements(menu)(lang)
      }
    )
  }
}
