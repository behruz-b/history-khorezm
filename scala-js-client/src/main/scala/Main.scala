import org.scalajs.dom
import org.scalajs.dom.raw._

import scala.scalajs.js.annotation.JSExportTopLevel


object Main extends App {
  val elements = Map(
    //    TITLE
    "siteTitle" -> Array("History of Khorezm", "История Хорезма", "Xorazm tarixi"),
    //    NAVBAR LG
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
    //    FOOTER
    "footerAboutWebSite" -> Array(
      "This website is owned by the Ministry of Innovation Development of the Republic of Uzbekistan I-FA-2019-25 code “HISTORY, CULTURAL HERITAGE, MONUMENTS OF KHOREZM CITIES AND CREATION OF SMART TECHNOLOGIES ON THE BASIS OF RESEARCH OF WORKS OF ART ” created as part of a project on the subject.",
      "Этот сайт принадлежит Министерству инновационного развития Республики Узбекистан. Код I-FA-2019-25 «ИСТОРИЯ, КУЛЬТУРНОЕ НАСЛЕДИЕ, ПАМЯТНИКИ ГОРОДА ХОРЕЗМА. И СОЗДАНИЕ УМНЫХ ТЕХНОЛОГИЙ НА ОСНОВЕ ИССЛЕДОВАНИЯ ХУДОЖЕСТВЕННЫХ ПРОИЗВОДСТВ » создан как часть проекта по данной теме.",
      "Mazkur web sahifa O‘zbekiston Respublikasi Innovasion rivojlanish vazirligining I-FA-2019-25 shifrli “XORAZM SHAHARLARINING TARIXI, MADANIY MEROSLARI, OBIDALARI VA SAN’AT ASARLARINING TADQIQOTLARI ASOSIDA SMART TEXNOLOGIYALARINI YARATISH” mavzusidagi loyihasi doirasida yaratilgan."),
    "allRightReserved" -> Array("All Rights Reserved", "Все права защищены", "Barcha huquqlar himoyalangan")
  )
  //  TITLE
  dom.document.getElementById("siteTitle").asInstanceOf[HTMLLinkElement].innerText = elements("siteTitle")(0)
  //  HOME
  dom.document.getElementById("menuHome").asInstanceOf[HTMLLinkElement].innerText = elements("menuHome")(0)
  dom.document.getElementById("menuStickyHome").asInstanceOf[HTMLLinkElement].innerText = elements("menuHome")(0)
  //  NEWS
  dom.document.getElementById("menuNews").asInstanceOf[HTMLLinkElement].innerText = elements("menuNews")(0)
  dom.document.getElementById("menuStickyNews").asInstanceOf[HTMLLinkElement].innerText = elements("menuNews")(0)
  //  ABOUT
  dom.document.getElementById("menuAboutKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("menuAboutKhorezm")(0)
  dom.document.getElementById("menuStickyAboutKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("menuAboutKhorezm")(0)
  dom.document.getElementById("subMenuHistoryOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuHistoryOfKhorezm")(0)
  dom.document.getElementById("subMenuStickyHistoryOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuHistoryOfKhorezm")(0)
  dom.document.getElementById("dropMenuAntiquePeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAntiquePeriod")(0)
  dom.document.getElementById("dropMenuStickyAntiquePeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAntiquePeriod")(0)
  dom.document.getElementById("dropMenuAncientPeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAncientPeriod")(0)
  dom.document.getElementById("dropMenuStickyAncientPeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAncientPeriod")(0)
  dom.document.getElementById("dropMenuMiddleAges").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuMiddleAges")(0)
  dom.document.getElementById("dropMenuStickyMiddleAges").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuMiddleAges")(0)
  dom.document.getElementById("dropMenuNinthFifteenth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuNinthFifteenth")(0)
  dom.document.getElementById("dropMenuStickyNinthFifteenth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuNinthFifteenth")(0)
  dom.document.getElementById("dropMenuSixteenthTwentieth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuSixteenthTwentieth")(0)
  dom.document.getElementById("dropMenuStickySixteenthTwentieth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuSixteenthTwentieth")(0)
  dom.document.getElementById("dropMenuIndependenceTime").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuIndependenceTime")(0)
  dom.document.getElementById("dropMenuStickyIndependenceTime").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuIndependenceTime")(0)
  dom.document.getElementById("subMenuKhorezmCities").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCities")(0)
  dom.document.getElementById("subMenuStickyKhorezmCities").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCities")(0)
  dom.document.getElementById("subMenuKhorezmCultures").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCultures")(0)
  dom.document.getElementById("subMenuStickyKhorezmCultures").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCultures")(0)
  dom.document.getElementById("subMenuArtOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuArtOfKhorezm")(0)
  dom.document.getElementById("subMenuStickyArtOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuArtOfKhorezm")(0)
  //  SERVICES
  dom.document.getElementById("menuInteractiveServices").asInstanceOf[HTMLLinkElement].innerText = elements("menuInteractiveServices")(0)
  dom.document.getElementById("menuStickyInteractiveServices").asInstanceOf[HTMLLinkElement].innerText = elements("menuInteractiveServices")(0)
  //  MULTIMEDIA
  dom.document.getElementById("menuMultimedia").asInstanceOf[HTMLLinkElement].innerText = elements("menuMultimedia")(0)
  dom.document.getElementById("menuStickyMultimedia").asInstanceOf[HTMLLinkElement].innerText = elements("menuMultimedia")(0)
  //  OPEN DATA
  dom.document.getElementById("menuOpenData").asInstanceOf[HTMLLinkElement].innerText = elements("menuOpenData")(0)
  dom.document.getElementById("menuStickyOpenData").asInstanceOf[HTMLLinkElement].innerText = elements("menuOpenData")(0)
  //  FORUM
  dom.document.getElementById("menuForum").asInstanceOf[HTMLLinkElement].innerText = elements("menuForum")(0)
  dom.document.getElementById("menuStickyForum").asInstanceOf[HTMLLinkElement].innerText = elements("menuForum")(0)
  //  All Right Reserved
  dom.document.getElementById("allRightReserved").asInstanceOf[HTMLLinkElement].innerText = elements("allRightReserved")(0)
  dom.document.getElementById("footerAboutWebSite").asInstanceOf[HTMLLinkElement].innerText = elements("footerAboutWebSite")(0)

  @JSExportTopLevel("contentTranslate")
  def contentTranslate(languange: String): Unit = {
    val lang = languange match {
      case "en" => 0
      case "ru" => 1
      case "uz" => 2
    }
    //  TITLE
    dom.document.getElementById("siteTitle").asInstanceOf[HTMLLinkElement].innerText = elements("siteTitle")(lang)
    //    HOME
    dom.document.getElementById("menuHome").asInstanceOf[HTMLLinkElement].innerText = elements("menuHome")(lang)
    dom.document.getElementById("menuStickyHome").asInstanceOf[HTMLLinkElement].innerText = elements("menuHome")(lang)
    //    NEWS
    dom.document.getElementById("menuNews").asInstanceOf[HTMLLinkElement].innerText = elements("menuNews")(lang)
    dom.document.getElementById("menuStickyNews").asInstanceOf[HTMLLinkElement].innerText = elements("menuNews")(lang)
    //    ABOUT
    dom.document.getElementById("menuAboutKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("menuAboutKhorezm")(lang)
    dom.document.getElementById("menuStickyAboutKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("menuAboutKhorezm")(lang)
    dom.document.getElementById("subMenuHistoryOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuHistoryOfKhorezm")(lang)
    dom.document.getElementById("subMenuStickyHistoryOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuHistoryOfKhorezm")(lang)
    dom.document.getElementById("dropMenuAntiquePeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAntiquePeriod")(lang)
    dom.document.getElementById("dropMenuStickyAntiquePeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAntiquePeriod")(lang)
    dom.document.getElementById("dropMenuAncientPeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAncientPeriod")(lang)
    dom.document.getElementById("dropMenuStickyAncientPeriod").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuAncientPeriod")(lang)
    dom.document.getElementById("dropMenuMiddleAges").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuMiddleAges")(lang)
    dom.document.getElementById("dropMenuStickyMiddleAges").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuMiddleAges")(lang)
    dom.document.getElementById("dropMenuNinthFifteenth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuNinthFifteenth")(lang)
    dom.document.getElementById("dropMenuStickyNinthFifteenth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuNinthFifteenth")(lang)
    dom.document.getElementById("dropMenuSixteenthTwentieth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuSixteenthTwentieth")(lang)
    dom.document.getElementById("dropMenuStickySixteenthTwentieth").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuSixteenthTwentieth")(lang)
    dom.document.getElementById("dropMenuIndependenceTime").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuIndependenceTime")(lang)
    dom.document.getElementById("dropMenuStickyIndependenceTime").asInstanceOf[HTMLLinkElement].innerText = elements("dropMenuIndependenceTime")(lang)
    dom.document.getElementById("subMenuKhorezmCities").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCities")(lang)
    dom.document.getElementById("subMenuStickyKhorezmCities").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCities")(lang)
    dom.document.getElementById("subMenuKhorezmCultures").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCultures")(lang)
    dom.document.getElementById("subMenuStickyKhorezmCultures").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuKhorezmCultures")(lang)
    dom.document.getElementById("subMenuArtOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuArtOfKhorezm")(lang)
    dom.document.getElementById("subMenuStickyArtOfKhorezm").asInstanceOf[HTMLLinkElement].innerText = elements("subMenuArtOfKhorezm")(lang)
    //    SERVICES
    dom.document.getElementById("menuInteractiveServices").asInstanceOf[HTMLLinkElement].innerText = elements("menuInteractiveServices")(lang)
    dom.document.getElementById("menuStickyInteractiveServices").asInstanceOf[HTMLLinkElement].innerText = elements("menuInteractiveServices")(lang)
    //    MULTIMEDIA
    dom.document.getElementById("menuMultimedia").asInstanceOf[HTMLLinkElement].innerText = elements("menuMultimedia")(lang)
    dom.document.getElementById("menuStickyMultimedia").asInstanceOf[HTMLLinkElement].innerText = elements("menuMultimedia")(lang)
    //    OPEN DATA
    dom.document.getElementById("menuOpenData").asInstanceOf[HTMLLinkElement].innerText = elements("menuOpenData")(lang)
    dom.document.getElementById("menuStickyOpenData").asInstanceOf[HTMLLinkElement].innerText = elements("menuOpenData")(lang)
    //    FORUM
    dom.document.getElementById("menuForum").asInstanceOf[HTMLLinkElement].innerText = elements("menuForum")(lang)
    dom.document.getElementById("menuStickyForum").asInstanceOf[HTMLLinkElement].innerText = elements("menuForum")(lang)
    //  All Right Reserved
    dom.document.getElementById("allRightReserved").asInstanceOf[HTMLLinkElement].innerText = elements("allRightReserved")(lang)
    dom.document.getElementById("footerAboutWebSite").asInstanceOf[HTMLLinkElement].innerText = elements("footerAboutWebSite")(lang)
  }

}
