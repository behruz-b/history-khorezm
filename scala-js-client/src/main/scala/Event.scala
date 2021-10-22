import org.scalajs.dom
import org.scalajs.dom.raw.HTMLLinkElement

class Event {

 val eventsPageReadMoreIdsList = List("read-more1", "read-more2", "read-more3", "read-more4", "read-more5", "read-more6",
  "read-more7", "read-more8", "read-more9", "read-more10", "read-more11", "read-more12", "read-more13")
 val eventsLatestNewsIdsList = List("latest-news1", "latest-news2", "latest-news3", "latest-news4", "latest-news5", "latest-news6",
  "latest-news7", "latest-news8", "latest-news9", "latest-news10", "latest-news11", "latest-news12", "latest-news13")
 val eventsSepList = List("sep1", "sep2", "sep3", "sep4", "sep5", "sep6")
 val eventsAugList = List("aug1", "aug2", "aug3")
 val eventsMayList = List("may1", "may2", "may3")
 val eventsWedList = List("wed1", "wed2", "wed3", "wed4", "wed5")
 val eventsTueList = List("tue1", "tue2", "tue3")
 val eventsMonList = List("mon1", "mon2", "mon3", "mon4", "mon5")

 val latestNews = Map(
  "latest-news" -> Array("Latest news", "Последние новости", "So`nggi yangiliklar")
 )
 val sep = Map {
  "sep" -> Array("Sep", "Сен", "Sen")
 }
 val aug = Map {
  "aug" -> Array("Aug", "Авг", "Avg")
 }
 val may = Map {
  "may" -> Array("May", "Май", "May")
 }
 val nov = Map {
  "nov" -> Array("Nov", "Ноя", "Noy")
 }
 val wed = Map {
  "wed" -> Array("Wednesday", "Среда", "Chorshanba")
 }
 val tue = Map {
  "tue" -> Array("Tuesday", "Вторник", "Seshanba")
 }
 val mon = Map {
  "mon" -> Array("Monday", "Понедельник", "Dushanba")
 }

 val events = Map(
  "news-header" -> Array("News", "Новости", "Yangiliklar"),
  "sub-menu-home" -> Array("Home", "Главное", "Bosh sahifa"),
  "sub-menu-news" -> Array("News", "Новости", "Yangiliklar"),
  "news-title1" -> Array("INTERNATIONAL FORUM IN KHIVA", "МЕЖДУНАРОДНЫЙ ФОРУМ В ХИВЕ", "XIVA SHAHRIDA XALQARO FORUM"),
  "news-title2" -> Array("The International Festival \"Dance Magic\" has started in the Ichon-Kala Museum-Reserve", "В музее-заповеднике Ичон-Кала стартовал Международный фестиваль «Магия танца»", "Ichon-Qal’a muzey qo‘riqxonasida - “Raqs sehri” xalqaro festivali boshlandi"),
  "news-title3" -> Array("Photo exhibition dedicated to Uzbekistan in Japan", "Фотовыставка, посвященная Узбекистану в Японии", "O'zbekistonga bag'ishlangan fotoko'rgazma Yaponiyada"),
  "news-title4" -> Array("Lezgi festival in Khorezm", "Лезгинский фестиваль в Хорезме", "Xorazmda lazgi festivali"),
  "news-title5" -> Array("INTERNATIONAL FORUM \"AT THE CROSS OF CENTRAL ASIAN CIVILIZATIONS\" IN KHIVA", "МЕЖДУНАРОДНЫЙ ФОРУМ «НА ПЕРЕКРЕСТЕ ЦЕНТРАЛЬНО-АЗИАТСКИХ ЦИВИЛИЗАЦИЙ» В ХИВЕ", "XIVADA “MARKAZIY OSIYO SIVILIZASIYALARI CHORRAHASIDA” XALQARO FORUMI"),
  "news-title6" -> Array("The international festival \"Magic of Dances\" has started in Khiva", "В Хиве стартовал международный фестиваль «Магия танцев».", "Xiva shahrida \"Raqslar sehrli\" xalqaro festivali boshlandi"),
  "news-title7" -> Array("Khiva is one of the most beautiful cities in the world", "Хива - один из красивейших городов мира.", "Xiva dunyoning eng go‘zal shaharlari ro‘yxatidan joy oldi"),
  "news-title8" -> Array("The international tournament \"Game of Heroes\" has started in Ichon-Kala!", "В Ичон-Кале стартовал международный турнир «Игра героев»!", "Ichon-Qal’ada xalqaro “Bahodirlar o‘yini” turniriga start berildi!"),
  "news-title9" -> Array("REPUBLICAN SCIENTIFIC CONFERENCE ON \"HISTORY OF KHOREZM CITIES IN MODERN RESEARCH\"", "РЕСПУБЛИКАНСКАЯ НАУЧНАЯ КОНФЕРЕНЦИЯ «ИСТОРИЯ ГОРОДА ХОРЕЗМА В СОВРЕМЕННЫХ ИССЛЕДОВАНИЯХ»", "“XORAZM SHAHARLARI TARIXI ZAMONAVIY TADQIQOTLARDA” MAVZUSIDA RESPUBLIKA ILMIY ANJUMANI"),
  "news-title10" -> Array("International conference", "Международная конференция", "Xalqaro konferensiya"),
  "news-title11" -> Array("The International Cultural Forum \"Central Asia at the Crossroads of World Civilizations\" has started in Khiva today", "Сегодня в Хиве стартовал Международный культурный форум «Центральная Азия на перекрестке мировых цивилизаций».", "Bugun Xivada «Markaziy Osiyo dunyo sivilizasiyalari chorrahasida» xalqaro madaniyat forumiga start berildi"),
  "news-title12" -> Array("A railway and a railway station have been opened in Khiva", "В Хиве открыты железная дорога и железнодорожный вокзал.", "Xivada temiryo‘l va vokzal ochildi"),
  "news-title13" -> Array("WITH A NEW LOOK AT THE NEW DISTRICT", "ЯНГИ ТУМАНГА ЯНГИЧА НИГОХ БИЛАН", "YANGI TUMANGA YANGICHA NIGOH BILAN"),
  "news-content1" -> Array("September 14-15, 2021 in the city of Khiva ...", "14-15 сентября 2021 года в городе Хива ...", "2021 yil 14-15 sentyabr kunlari Xiva shahrida ..."),
  "news-content2" -> Array("In cooperation with the State Committee for Tourism Development and other organizations in Khiva ...", "В сотрудничестве с Государственным комитетом по развитию туризма и другими организациями Хивы ...", "Turizmni rivojlantirish davlat qo‘mitasi va boshqa tashkilotlar hamkorligida Xiva shahridagi ..."),
  "news-content3" -> Array("In November 2020 in Japan, boxing for the Olympic and Paralympic Games ...", "В ноябре 2020 года в Японии бокс на Олимпийских и Паралимпийских играх ...", "2020 yil noyabr oyida Yaponiyada, Olimpiya va Paralimpiya o'yinlari uchun boks bo'yicha..."),
  "news-content4" -> Array("Resolution of the President of the Republic of Uzbekistan Shavkat Mirziyoyev \"On the organization and holding of the International Dance Festival\" Lazgi \"...", "Постановление Президента Республики Узбекистан Шавката Мирзиёева «Об организации и проведении Международного фестиваля танца« Лазги »...", "O‘zbekiston Respublikasi Prezidenti Shavkat Mirziyoyevning “Lazgi” xalqaro raqs festivalini tashkil etish va o‘tkazish to‘g‘risida”gi qarorni ..."),
  "news-content5" -> Array("Yesterday, on September 15, in the luxurious complex \"Nurillaboy\" in Khiva ...", "Вчера, 15 сентября, в элитном комплексе «Нуриллабой» в Хиве ...", "Kecha 15-sentyabr kuni Xiva shahridagi hashamatli “Nurillaboy” majmuasida ..."),
  "news-content6" -> Array("The International Dance Festival \"Dance Magic\" will be held in Khiva from 15 to 17 July ...", "Международный танцевальный фестиваль «Магия танца» пройдет в Хиве с 15 по 17 июля ...", "15-iyuldan 17-iyulgacha Xiva shahrida \"Raqs sehrli\" xalqaro raqs festivali bo'lib o'tadi ..."),
  "news-content7" -> Array("In recent days, in various print and electronic publications in Western Europe, our country ...", "В последнее время в различных печатных и электронных изданиях Западной Европы наша страна ...", "So‘nggi kunlarda g‘arbiy Evropaning turli bosma va elektron nashrlarida yurtimiz ..."),
  "news-content8" -> Array("The long-awaited International Game of Brave Tournament has started! ...", "Долгожданный международный турнир Смелая игра стартовал! ...", "Uzoq kutilgan Xalqaro “Bahodirlar o‘yini” turniriga start berildi! ..."),
  "news-content9" -> Array("The Republican scientific conference was held on May 21 ...", "21 мая прошла республиканская научная конференция ...", "21-may kuni Respublika ilmiy anjumani o‘tkazildi ..."),
  "news-content10" -> Array("Translation results\nToday, May 17, 2021, organized by the European Bank for Reconstruction and Development ...", "Сегодня, 17 мая 2021 года, организовано Европейским банком реконструкции и развития ...", "Bugun 17 may 2021 yilda Yevropa tiklanish va taraqqiyot banki  tamonidan tashkillashtirilgan ..."),
  "news-content11" -> Array("The forum was organized by President Shavkat Mirziyoyev together with UNESCO at the UN General Assembly ...", "Форум был организован Президентом Шавкатом Мирзиёевым совместно с ЮНЕСКО на Генассамблее ООН ...", "Forum YUNESKO bilan birgalikda prezident Shavkat Mirziyoyev tomonidan BMT Bosh assambleyasi ..."),
  "news-content12" -> Array("On November 29, President Shavkat Mirziyoyev arrived in Khiva on the Urgench-Khiva train ...", "29 ноября Президент Шавкат Мирзиёев прибыл в Хиву поездом Ургенч-Хива ...", "Prezident Shavkat Mirziyoyev 29 noyabr kuni Urganch - Xiva poyezdida Xiva shahriga ..."),
  "news-content13" -> Array("A group of the Social and Humanitarian Department of the Khorezm Mamun Academy ...", "Группа социально-гуманитарного отделения Хорезмской Академии Мамуна ...", "Xorazm Ma’mun akademiyasi Ijtimoiy-gumanitar bo‘limining bir guruh ..."),
 )
 val readMore = Map {
  "readMore" -> Array("Read More", "Подробнее", "Ko\'proq o\'qish")
 }

 def create(lang: Int): Unit = {
  events.keys.foreach(
   header => dom.document.getElementById(header).asInstanceOf[HTMLLinkElement].innerText = events(header)(lang)
  )
  eventsPageReadMoreIdsList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = readMore("readMore")(lang)
  )
  eventsLatestNewsIdsList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = latestNews("latest-news")(lang)
  )
  eventsSepList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = sep("sep")(lang)
  )
  eventsAugList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = aug("aug")(lang)
  )
  eventsMayList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = may("may")(lang)
  )
  dom.document.getElementById("nov").asInstanceOf[HTMLLinkElement].innerText = nov("nov")(lang)
  eventsWedList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = wed("wed")(lang)
  )
  eventsTueList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = tue("tue")(lang)
  )
  eventsMonList.foreach(
   item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = mon("mon")(lang)
  )
 }
}
