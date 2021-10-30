import org.scalajs.dom
import org.scalajs.dom.raw._

import scala.scalajs.js.annotation.JSExportTopLevel


object Main extends App {
  //  check Pages
  val isIndexPage = dom.document.getElementById("indexPage").asInstanceOf[HTMLLinkElement]
  val isEventsPage = dom.document.getElementById("eventsPage").asInstanceOf[HTMLLinkElement]
  val isMediaPage = dom.document.getElementById("mediaPage").asInstanceOf[HTMLLinkElement]
  val isInteractivePage = dom.document.getElementById("interactivePage").asInstanceOf[HTMLLinkElement]

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
//    "openHours" -> Array("Open Hours", "Открытые часы", "Ochilish soatlari"),
//    "dateOfOpenHours" -> Array("Daily 9.30 am–6.00 pm Thursday & Holidays: Closed", "Ежедневно с 9:30 до 18:00 \nЧетверг и праздничные дни: выходной.", "Har kuni 9.30 - 18.00 \nPayshanba va dam olish kunlari: yopiq"),
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
  val elements = Map(
    //    Index page
    "smallIntro" -> Array("Small Intro", "Небольшое вступление", "Kichik kirish"),
    "smallIntroText" -> Array(
      "The Khorezm region, one of the first centers of world civilization, is distinguished by its unique cultural traditions, which have their ancient roots. The Khorezm oasis, located in the confluence of the Amu Darya and the Aral Sea, one of the lifebloods of Central Asia, has been the cradle of life for our ancestors since ancient times.",
      "Хорезмская область, один из первых центров мировой цивилизации, отличается уникальными культурными традициями, имеющими свои древние корни. Хорезмский оазис, расположенный в месте слияния Амударьи и Аральского моря, одного из источников жизненной силы Центральной Азии, издревле был колыбелью жизни наших предков.",
      "Jahon sivilizatsiyasining birinchi markazlaridan biri bo'lgan Xorazm viloyati o'zining qadimiy ildizlariga ega bo'lgan o'ziga xos madaniy an'analari bilan ajralib turadi. Markaziy Osiyoning qon tomirlaridan biri Amudaryo va Orol dengizining qo'shilish joyida joylashgan Xorazm vohasi qadim zamonlardan buyon ajdodlarimiz uchun hayot beshigi bo'lgan."
    ),
    "moreExplore" -> Array("More Explore", "Больше Исследовать", "Ko'proq o'rganish"),
    "aboutExhibition" -> Array("Double gate. Khiva. Deshan Castle. Early XX century", "Двойные ворота. Хива. Замок Дешан. Начало XX века", "Qo\'sha darvoza. Xiva. Deshan qal'a. XX asr boshi"),
    "display" -> Array("Display", "ДИСПЛЕЙ", "Displey"),
    "displayText" -> Array("General view of Muhammad Aminkhan Madrasah. Khiva. Middle of XIX century", "Общий вид медресе Мухаммеда Аминхана. Хива. Середина XIX века", "Muhammad Aminxon madrasasining umumiy ko'rinishi. Xiva. XIX asr o'rtalari"),
    "aboutExhibition2" -> Array("Roof of Muhammad Aminkhan Madrasa. Tiled, decorated.", "Крыша медресе Мухаммеда Аминхана. Плиточный, декорированный.", "Muhammad Aminxon madrasining peshtoq qismi. Koshin bilan qoplangan, bezak berilgan."),
    "aboutExhibition3" -> Array("The mask. The castle of the castle. III-II centuries", "Маска. Замок замка. III-II вв.", "Niqob. Qo'yqirilgan qal'a. III-II asrlar"),
    "gallery" -> Array("Gallery", "Галерея", "Galereya"),
    "aboutGallery" -> Array("Islam Khoja Madrasa and Minaret. Khiva. Ichan Castle. 1910.", "Исламское медресе Ходжа и минарет. Хива. Замок Ичан. 1910 г.", "Islom xo'ja madrasasi va minorasi. Xiva. Ichan qal'a. 1910-yil"),
    "display2" -> Array("Display", "ДИСПЛЕЙ", "Displey"),
    "displayText2" -> Array("Sayyid Niyaz Sholikorboy Mosque and Minaret. Khiva. Deshan Castle. The end of the XIX century", "Мечеть и минарет Сайида Нияза Шоликорбоя. Хива. Замок Дешан. Конец XIX века.", "Sayyid Niyoz sholikorboy masjidi va minorasi. Xiva. Deshan qal'a. XIX asr oxiri"),
    "dontMiss" -> Array("DON’T MISS", "НЕ ПРОПУСТИТЕ", "O\'TKAZIB YUBORMANG"),
    "upcomingEvents" -> Array("Upcoming Events", "Предстоящие События", "Tarixiy tadbirlar"),
    "ourCollection" -> Array("From Our Collection", "Из нашей коллекции", "Bizning to'plamdan"),
    "viewMore" -> Array("View More", "Посмотреть больше", "Ko\'proq ko\'rish"),
    "castle" -> Array("Castle of Nurullaboy", "Замок Нуруллабой", "Nurullaboy qal\'asi"),
    "numericalCounter" -> Array("Everything about our organization in numerical counter view.", "Все о нашей организации в виде цифрового счетчика.", "Bizning tashkilot haqida hamma narsa raqamli hisoblagich ko\'rinishida."),
    "wePerfection" -> Array("We Strive for Perfection Every day", "Мы стремимся к совершенству каждый день.", "Biz har kuni mukammallikka intilamiz."),
    "overOrganized" -> Array("Archaeological monuments", "Археологических памятников", "Arxeologik yodgorliklar"),
    "uniqueObjects" -> Array("Architectural monuments", "Памятников архитектуры", "Me`moriy obidalar "),
    "multimediaExhibitions" -> Array("Monumental works of art", "Монументальных произведений искусства", "Monumental san`at asarlari"),
    "ourTicketsSold" -> Array("Museum expositions", "Mузейных экспозиций", "Muzey ekspozitsiyalari"),
    "newsLetter" -> Array("News Letter Now", "Новостное письмо сейчас", "Hoziroq bog\'lanish"),
    "newsLetterInfo" -> Array("Receive e-mail updates on our exhibitions, events, and more........", "Получайте по электронной почте новости о наших выставках, мероприятиях и многом другом ........", "Bizning ko\'rgazmalarimiz, tadbirlarimiz va boshqalar haqida elektron pochta xabarlarini oling ........"),
    "subscribe" -> Array("Subscribe", "Подписывайся", "Obuna bo\'lish")
  )
  //  Index Page ids

  val eventNameMap = Map {
    "eventName" -> Array("Central Park", "Центральный парк", "Markaziy Park")
  }
  val eventNameEvenMap = Map {
    "eventName" -> Array("Reduis Maroa", "Редуис Мароа", "Reduis Maroa")
  }
  val eventLinkEvenMap = Map {
    "eventLink" -> Array("Renaissance to Revolution", "От Возрождения до революции", "Inqilobning Uyg'onishi")
  }
  val eventLinkMap = Map {
    "eventLink" -> Array("Buffalo Bill Museum & Grave", "Музей и могила Буффало Билла", "Buffalo Bill muzeyi va qabr")
  }
  val eventDateMap = Map {
    "eventDate" -> Array("November 30, 2021 - November 28, 2020", "30 ноября 2021 - 28 ноября 2020", "30 - noyabr, 2021 yil - 28 - noyabr, 2020 - yil")
  }
  val weekdaySat = Map {
    "weekday" -> Array("SATURDAY", "СУББОТА", "SHANBA")
  }
  val monthDec = Map {
    "month" -> Array("December", "Декабрь", "Dekabr")
  }
  val monthNov = Map {
    "month" -> Array("November", "Ноябрь", "Noyabr")
  }
  val exhibition = Map {
    "exhibition" -> Array("Exhibition", "Выставка", "Ko'rgazma")
  }
  val findMore = Map {
    "findMore" -> Array("Find More", "Найти еще", "Ko'proq izlash")
  }
  val learnMore = Map {
    "learnMore" -> Array("Learn More", "Учить больше", "Batafsil ma\'lumot")
  }
  val readMore = Map {
    "readMore" -> Array("Read More", "Подробнее", "Ko\'proq o\'qish")
  }
  val modernArt = Map {
    "modernArt" -> Array("Exhibition of Modern Art", "Выставка современного искусства", "Zamonaviy san\'at ko\'rgazmasi")
  }
  val multimedia = Map(
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
  val readMoreList = List("readMore", "readMore2", "readMore3", "readMore4", "readMore5", "readMore6", "readMore7", "readMore8", "readMore9", "readMore10")
  val modernArtList = List("modernArt", "modernArt2", "modernArt3", "modernArt5", "modernArt6", "modernArt7", "modernArt8", "modernArt9", "modernArt10")
  val learnMoreList = List("bigLearnMore", "secondLearnMore", "thirdLearnMore", "learnMore4", "learnMore5", "learnMore6", "learnMore7", "learnMore8", "learnMore9")
  val findMoreList = List("findMore", "findMore2", "findMore3", "findMore4", "findMore5", "findMore6")
  val exhibitionList = List("exhibition", "exhibition2", "exhibition3")
  val monthDecList = List("month2", "month4", "month6")
  val monthNovList = List("month", "month3", "month5")
  val weekdaySatList = List("weekday", "weekday2", "weekday3", "weekday4", "weekday5", "weekday6")
  val eventDateList = List("eventDate", "eventDate2", "eventDate3", "eventDate4", "eventDate5", "eventDate6")
  val eventLinkList = List("eventLink", "eventLink3", "eventLink5")
  val eventLinkEvenList = List("eventLink2", "eventLink4", "eventLink6")
  val eventNameList = List("eventName", "eventName3", "eventName5")
  val eventNameEvenList = List("eventName2", "eventName4", "eventName6")
  //  Events Page
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
  val interactive = Map(
    "interactive-header" -> Array("Interactive services", "Сервисы", "Interaktiv xizmatlar"),
    "sub-menu-for-interactive-home" -> Array("Home", "Главное", "Bosh sahifa"),
    "sub-menu-for-interactive" -> Array("Interactive services", "Сервисы", "Interaktiv xizmatlar")
  )
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
  navbarAndFooter.keys.foreach(
    menu => dom.document.getElementById(menu).asInstanceOf[HTMLLinkElement].innerText = navbarAndFooter(menu)(2)
  )
  if (isIndexPage != null) {
    learnMoreList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = learnMore("learnMore")(2)
    )
    readMoreList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = readMore("readMore")(2)
    )
    modernArtList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = modernArt("modernArt")(2)
    )
    findMoreList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = findMore("findMore")(2)
    )
    exhibitionList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = exhibition("exhibition")(2)
    )
    monthDecList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = monthDec("month")(2)
    )
    monthNovList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = monthNov("month")(2)
    )
    weekdaySatList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = weekdaySat("weekday")(2)
    )
    eventDateList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventDateMap("eventDate")(2)
    )
    eventLinkList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventLinkMap("eventLink")(2)
    )
    eventLinkEvenList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventLinkEvenMap("eventLink")(2)
    )
    eventNameList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventNameMap("eventName")(2)
    )
    eventNameEvenList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventNameEvenMap("eventName")(2)
    )
    elements.keys.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = elements(item)(2)
    )
  }
  //Events Page
  if (isEventsPage != null) {
    events.keys.foreach(
      header => dom.document.getElementById(header).asInstanceOf[HTMLLinkElement].innerText = events(header)(2)
    )
    eventsPageReadMoreIdsList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = readMore("readMore")(2)
    )
    eventsLatestNewsIdsList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = latestNews("latest-news")(2)
    )
    eventsSepList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = sep("sep")(2)
    )
    eventsAugList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = aug("aug")(2)
    )
    eventsMayList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = may("may")(2)
    )
    dom.document.getElementById("nov").asInstanceOf[HTMLLinkElement].innerText = nov("nov")(2)
    eventsWedList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = wed("wed")(2)
    )
    eventsTueList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = tue("tue")(2)
    )
    eventsMonList.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = mon("mon")(2)
    )
  }
  //  Multimedia Pages
  if (isMediaPage != null) {
    multimedia.keys.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = multimedia(item)(2)
    )
  }
  //  Interactive Services Pages
  if (isInteractivePage != null) {
    interactive.keys.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = interactive(item)(2)
    )
  }

  @JSExportTopLevel("contentTranslate")
  def contentTranslate(language: String): Unit = {
    val lang = language match {
      case "en" => 0
      case "ru" => 1
      case "uz" => 2
    }
    if (isIndexPage != null) {
      learnMoreList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = learnMore("learnMore")(lang)
      )
      readMoreList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = readMore("readMore")(lang)
      )
      modernArtList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = modernArt("modernArt")(lang)
      )
      findMoreList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = findMore("findMore")(lang)
      )
      exhibitionList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = exhibition("exhibition")(lang)
      )
      monthDecList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = monthDec("month")(lang)
      )
      monthNovList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = monthNov("month")(lang)
      )
      weekdaySatList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = weekdaySat("weekday")(lang)
      )
      eventDateList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventDateMap("eventDate")(lang)
      )
      eventLinkList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventLinkMap("eventLink")(lang)
      )
      eventLinkEvenList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventLinkEvenMap("eventLink")(lang)
      )
      eventNameList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventNameMap("eventName")(lang)
      )
      eventNameEvenList.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = eventNameEvenMap("eventName")(lang)
      )
      elements.keys.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = elements(item)(lang)
      )
    }
    //Events Page
    if (isEventsPage != null) {
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
    //  Multimedia Pages
    if (isMediaPage != null) {
      multimedia.keys.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = multimedia(item)(lang)
      )
    }
    //  Interactive Services Pages
    if (isInteractivePage != null) {
      interactive.keys.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = interactive(item)(lang)
      )
    }
    navbarAndFooter.keys.foreach(
      menu => dom.document.getElementById(menu).asInstanceOf[HTMLLinkElement].innerText = navbarAndFooter(menu)(lang)
    )
  }
}
