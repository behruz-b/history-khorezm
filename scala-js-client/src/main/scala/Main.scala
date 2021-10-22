import org.scalajs.dom
import org.scalajs.dom.raw._

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}


object Main extends App {
  var currentPage = "Home"
  var language = 2

  val navbarAndFooter = Map(
    "siteTitle" -> Array("History of Khorezm", "История Хорезма", "Xorazm tarixi"),
    "menuHome" -> Array("Home", "Главное", "Bosh sahifa"),
    //    "sub-menu-home-for-media" -> Array("Home", "Главное", "Bosh sahifa"),
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
    //    "multimedia-header" -> Array("Multimedia", "Мультимедиа", "Multimediya"),
    //    "sub-menu-multimedia" -> Array("Multimedia", "Мультимедиа", "Multimediya"),
    "menuForum" -> Array("Forum", "Форум", "Forum"),
    //    Sticky nav
    "menuStickyHome" -> Array("Home", "Главное", "Bosh sahifa"),
    "menuStickyNews" -> Array("News", "Новости", "Yangiliklar"),
    "menuStickyAboutKhorezm" -> Array("About Khorezm", "О Хорезме", "Xorazm haqida"),
    "subMenuStickyHistoryOfKhorezm" -> Array("History of Khorezm", "История Хорезма", "Xorazm tarixi"),
    "dropMenuStickyAntiquePeriod" -> Array("Khorezm in the antique period", "Хорезм в античный периода", "Antik davrda Xorazm"),
    "dropMenuStickyAncientPeriod" -> Array("Khorezm in ancient period", "Хорезм в древний период", "Qadimgi davrda Xorazm"),
    "dropMenuStickyMiddleAges" -> Array("Khorezm in the early Middle Ages", "Хорезм в раннем средневековье", "O\'rta asr boshlarida Xorazm"),
    "dropMenuStickyNinthFifteenth" -> Array("Khorezm in IX-XV centuries", "Хорезм в IX-XV вв", "IX-XV asrlarda Xorazm"),
    "dropMenuStickySixteenthTwentieth" -> Array("Khorezm in the XVI-XX centuries", "Хорезм в XVI-XX веках", "XVI-XX asrlarda Xorazm"),
    "dropMenuStickyIndependenceTime" -> Array("Khorezm in the independence time", "Хорезм во времена Независимости", "Xorazm Mustaqillik davrida"),
    "subMenuStickyKhorezmCities" -> Array("Khorezm cities", "Города Хорезма", "Xorazm shaharlari"),
    "subMenuStickyKhorezmCultures" -> Array("Khorezm's cultural heritage monuments", "Памятники культурного наследия Хорезма", "Xorazm madaniy merosi yodgorliklari"),
    "subMenuStickyArtOfKhorezm" -> Array("Art works of Khorezm", "Произведения искусства Хорезма", "Xorazm san'at asarlari"),
    "menuStickyInteractiveServices" -> Array("Interactive services", "Интерактивные сервисы", "Interaktiv xizmatlar"),
    "menuStickyMultimedia" -> Array("Multimedia", "Мультимедиа", "Multimediya"),
    "menuStickyForum" -> Array("Forum", "Форум", "Forum"),
    "extras" -> Array("Extras", "Дополнительно", "Qo\'shimchalar"),
    "contacts" -> Array("Contacts", "Контакты", "Kontaktlar"),
    "openHours" -> Array("Open Hours", "Открытые часы", "Ochilish soatlari"),
    "dateOfOpenHours" -> Array("Daily 9.30 am–6.00 pm Thursday & Holidays: Closed", "Ежедневно с 9:30 до 18:00 \nЧетверг и праздничные дни: выходной.", "Har kuni 9.30 - 18.00 \nPayshanba va dam olish kunlari: yopiq"),
    "quickLink" -> Array("Quick Link", "Прямая ссылка", "Tezkor havola"),
    "homeLink" -> Array("Home", "Главное", "Bosh sahifa"),
    "historyLink" -> Array("History", "История", "Tarix"),
    "eventsLink" -> Array("News", "Новости", "Yangiliklar"),
    "contactLink" -> Array("Contact Us", "Связаться с нами", "Biz bilan bog\'lanish"),
    "footerAboutWebSite" -> Array(
      "This website is owned by the Ministry of Innovation Development of the Republic of Uzbekistan I-FA-2019-25 code “HISTORY, CULTURAL HERITAGE, MONUMENTS OF KHOREZM CITIES AND CREATION OF SMART TECHNOLOGIES ON THE BASIS OF RESEARCH OF WORKS OF ART ” created as part of a project on the subject.",
      "Этот сайт принадлежит Министерству инновационного развития Республики Узбекистан. Код I-FA-2019-25 «ИСТОРИЯ, КУЛЬТУРНОЕ НАСЛЕДИЕ, ПАМЯТНИКИ ГОРОДА ХОРЕЗМА. И СОЗДАНИЕ УМНЫХ ТЕХНОЛОГИЙ НА ОСНОВЕ ИССЛЕДОВАНИЯ ХУДОЖЕСТВЕННЫХ ПРОИЗВОДСТВ » создан как часть проекта по данной теме.",
      "Mazkur web sahifa O‘zbekiston Respublikasi Innovasion rivojlanish vazirligining I-FA-2019-25 shifrli “XORAZM SHAHARLARINING TARIXI, MADANIY MEROSLARI, OBIDALARI VA SAN’AT ASARLARINING TADQIQOTLARI ASOSIDA SMART TEXNOLOGIYALARINI YARATISH” mavzusidagi loyihasi doirasida yaratilgan."),
    "allRightReserved" -> Array("All Rights Reserved", "Все права защищены", "Barcha huquqlar himoyalangan")
  )

  navbarAndFooter.keys.foreach(
    menu => dom.document.getElementById(menu).asInstanceOf[HTMLLinkElement].innerText = navbarAndFooter(menu)(2)
  )

  @JSExportTopLevel("changePage")
  def changePage(page: String): Unit = {
    currentPage = page
    page match {
      case "Home" => new Home().create(language)
      case "Media" => new Media().create(language)
      case "Event" => new Event().create(language)
    }
  }

  @JSExportTopLevel("contentTranslate")
  def contentTranslate(lang: String): Unit = {
    language = lang match {
      case "en" => 0
      case "ru" => 1
      case "uz" => 2
    }
    changePage(currentPage)
    navbarAndFooter.keys.foreach(
      menu => dom.document.getElementById(menu).asInstanceOf[HTMLLinkElement].innerText = navbarAndFooter(menu)(language)
    )
  }
}
