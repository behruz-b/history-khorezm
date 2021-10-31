import org.scalajs.dom
import org.scalajs.dom.raw._

import scala.scalajs.js.annotation.JSExportTopLevel


object Main extends App {
  //  check Pages
  val isIndexPage = dom.document.getElementById("indexPage").asInstanceOf[HTMLLinkElement]
  val isEventsPage = dom.document.getElementById("eventsPage").asInstanceOf[HTMLLinkElement]
  val isMediaPage = dom.document.getElementById("mediaPage").asInstanceOf[HTMLLinkElement]
  val isInteractivePage = dom.document.getElementById("interactivePage").asInstanceOf[HTMLLinkElement]
  //  For About Khorezm page
  val isAntiquePage = dom.document.getElementById("antiquePage").asInstanceOf[HTMLLinkElement]
  val isAncientPage = dom.document.getElementById("ancientPage").asInstanceOf[HTMLLinkElement]
  val isMiddleAgesPage = dom.document.getElementById("middleAgesPage").asInstanceOf[HTMLLinkElement]
  val isNineFifteenthCenturiesPage = dom.document.getElementById("nineFifteenthCenturiesPage").asInstanceOf[HTMLLinkElement]

  val navbarAndFooter = Map(
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
    "about-site-people" -> Array("Masharib Saydamatovich Abdullayev", "Машариб Сайдаматович Абдуллаев", "Masharib Saydamatovich Abdullayev"),
    "quickLink" -> Array("Quick Link", "Прямая ссылка", "Tezkor havola"),
    "homeLink" -> Array("Home", "Главное", "Bosh sahifa"),
    "historyLink" -> Array("History", "История", "Tarix"),
    "eventsLink" -> Array("News", "Новости", "Yangiliklar"),
    "contactLink" -> Array("Interactive services", "Интерактивные сервисы", "Interaktiv xizmatlar"),
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
    "uniqueObjects" -> Array("Architectural monuments", "Памятников архитектуры", "Me'moriy obidalar "),
    "multimediaExhibitions" -> Array("Monumental works of art", "Монументальных произведений искусства", "Monumental san'at asarlari"),
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
    "sub-menu-for-interactive" -> Array("Interactive services", "Сервисы", "Interaktiv xizmatlar"),
    "sub-menu-for-interactive" -> Array("Interactive services", "Сервисы", "Interaktiv xizmatlar"),
    "interactive-title" -> Array("Show map of Khorezm by years", "Показать карту Хорезма по годам", "Xorazm xaritasini yillar kesimida ko'rsatish"),
    "interactive-ml-title" -> Array("Image recognition and location service", "Служба распознавания изображений и определения местоположения", "Rasmlarni tanib olish va joylashuvini ko'rsatish xizmati"),
    "interactive-ml-info" -> Array(
      "This service includes photos of buildings, historical monuments, recreation areas in Khorezm. That is, each user will be " +
        "able to upload an image only with the location of the actual images (i.e. the \"location\" must be taken together when " +
        "the image is taken). These images are re-analyzed in the database and then \"converted into a service that needs to be routed.\" " +
        "For example, if Jalaladdin Manguberdi uploads a picture of our ancestor, he will show all the historical monuments about " +
        "Jaloliddin Manguberdi on a map (Google map, Yandex map). And it allows you to easily visit these monuments, find out where they " +
        "are and interesting information. Why do we want to find not only by name, but also by picture. Because a person who wants to go " +
        "somewhere sees a picture of him first, then wants to go, and saves the pictures. Now, through this system, it is possible to attract " +
        "more tourists and make the history of Khorezm more interesting",
      "В этот сервис включены фото зданий, исторических памятников, зон отдыха в Хорезме. То есть каждый пользователь сможет " +
        "загрузить изображение только с указанием местоположения фактических изображений (т.е. \"местоположение\" должно быть " +
        "взято вместе, когда изображение будет снято). Эти изображения повторно анализируются в базе данных, а затем «преобразуются " +
        "в сервис, который необходимо маршрутизировать». Например, если Джалаладдин Мангуберди загрузит фотографию нашего предка, он " +
        "покажет все исторические памятники о Джалолиддине Мангуберди на карте (карта Google, карта Яндекс). И это позволяет легко " +
        "посетить эти памятники, узнать, где они находятся, и интересную информацию.Почему мы хотим найти не только по названию, но и " +
        "по картинке. Потому что человек, который хочет куда-то пойти, сначала видит его фотографию, затем хочет пойти и сохраняет фотографии. " +
        "Теперь с помощью этой системы можно привлечь больше туристов и сделать историю Хорезма более интересной.",
      "Bu servis Xorazmdagi binolar, tarixiy obidalar, dam olish maskanlar rasmlarini o'z ichiga oladi. Ya'ni xar bir foydalanuvchi rasm " +
        "yuklashi mumkin bo'ladi, faqat xaqiqiy rasmlarni joylashuvi bilan (ya'ni rasm olinganda \"location\" birga olinga bo'lishi kerak). " +
        "Bu rasmlar ma'lumotlar omborida qayta tahlil qilinadi va keyinchalik \"Yo'nalish berish uchun kerakli bir servisga aylanadi\". " +
        "Masalan Jaloladdin Manguberdi bobomizni rasmini yuklansa, Jaloliddin Manguberdi xaqida qanday tarixiy obidalar bo'lsa xammasini " +
        "xaritada ko'rsatadi (Google map, Yandex map). Va bemalol shu obidalarni borib ko'rish, qayerda joylashgani va qiziqarli ma'lumotlarga " +
        "ega bo'lish imkonini yaratadi.Nima uchun faqat nomi bilan emas, balki rasmi bilan topadigan qilmoqchimiz. Chunki biron joyga borishni " +
        "istagan odam, oldin uni rasmini ko'radi keyin borishni istaydi, va rasmlarni saqlab qo'yadi. Endi bu tizim orqali turislarni ko'proq " +
        "jalb qilishga, Xorazm tarixini yanada qiziqarli qilib o'rgatishga erishiladi"),
    "map-info" -> Array(
      "Khorezm is an ancient civilization with a history of 2700 years of statehood, the territory of which has changed many times in different" +
        " periods. This map shows the borders of the Khorezm states from the VII century BC to the present day.",
      "Хорезм - древняя цивилизация с 2700-летней историей государственности, территория которой многократно менялась в разные периоды. " +
        "На этой карте показаны границы хорезмских государств с VII века до нашей эры до наших дней.",
      "Xorazm 2700 yillik davlatchilk tarixiga ega qadimiy sivilizatsiya o'chog'i bo'lib, hududi turli davrlarda ko'p marta o'zgargan. " +
        "Mazkur xaritada miloddan avvalgi VII asrdan hozirgi kungacha bo'lgan davrda Xorazm davlatlari chegaralari ko'rsatilgan."),
    //    Map
    "temir-one" -> Array("Iron Age", "Железный век", "Temir davri"),
    "olti-two" -> Array("VI-IV centuries", "VI-IV век", "VI-IV asr"),
    "tort-three" -> Array("4th-2nd centuries BC", "IV-II вв. До н.э.", "Mil.av. 4-2 asr"),
    "ikki-four" -> Array("2nd century AD", "2 век нашей эры", "milodiy 2 asr"),
    "uch-five" -> Array("III - VI centuries", "III - VI век", "III - VI asr"),
    "yetti-six" -> Array("VI - VII centuries", "VI - VII век", "VI - VII asr"),
    "sakkiz-seven" -> Array("VIII - IX centuries", "VIII - IX век", "VIII - IX asr"),
    "on-eight" -> Array("X century", "X век", "X asr"),
    "asr-1" -> Array("XVI-XVII centuries", "XVI-XVII век", "XVI-XVII asr"),
    "asr-2" -> Array("The end of the XVIII century", "Конец XVIII века", "XVIII asr oxiri"),
    "xiva-xon-1" -> Array("Khiva khanate", "Хивинское ханство", "Xiva xonligi"),
    "xiva-xon-2" -> Array("Khiva khanate", "Хивинское ханство", "Xiva xonligi"),
    "xiva-xon-3" -> Array("Khiva khanate", "Хивинское ханство", "Xiva xonligi"),
    "xorazm" -> Array("Khorezm", "Хорезм", "Xorazm"),
    "map-title-1" -> Array("Early Iron\n Age Asia", "Азия раннего\n железного века", "Ilk Temir \ndavri Osiyo"),
    "map-title-2" -> Array("Khorezm Achaemenid \nperiod VI - IV centuries", "Хорезмский период \nАхеменидов VI - IV вв.", "Xorazm Ahamoniylar \ndavri VI - IV asr"),
    "map-title-3" -> Array("Khorezm 4-2 \ncenturies BC", "Хорезм 4-2\n вв. До н.э.", "Xorazm miloddan\n avvalgi 4-2 asr"),
    "map-title-4" -> Array("Khorezm 2- century AD\n 2nd century AD", "Хорезм 2- век нашей \nэры 2 век нашей эры", "Xorazm mil 2- mil 2 asr"),
    "map-title-5" -> Array("The period of the \nAfricans III - VI centuries", "Период Aфриканцев\n III - VI вв.", "Afrig'iylar davri\n III - VI asr"),
    "map-title-6" -> Array("The period of the \nAfricans VI - VII centuries", "Период Aфриканцев\n VI - VII вв.", "Afrig'iylar davri\n VI - VII asr"),
    "map-title-7" -> Array("Khorezm \nVIII - IX centuries", "Хорезм\n VIII - IX вв.", "Xorazm \nVIII - IX asr"),
    "map-title-8" -> Array("X century Mamuns", "Мамуны X века", "X asr \nMa'muniylar"),
    "map-title-9" -> Array("Anushtegin Khorezmshah \n(1097-1231)", "Ануштегин Хорезмшах \n(1097-1231)", "Anushtegin Xorazmshoh \n(1097-1231)"),
    "map-title-10" -> Array("Khorezmshah Qutbiddin Muhammad \n(1097-1127)", "Хорезмшах Кутбиддин Мухаммад\n (1097-1127)", "Xorazmshoh Qutbiddin Muhammad \n(1097-1127)"),
    "map-title-11" -> Array("Ostir (1127-1156)", "Остир (1127-1156)", "Ostir (1127-1156)"),
    "map-title-12" -> Array("El Arslon \n(1156-1172)", "Эль-Арслон \n(1156–1172)", "El Arslon \n(1156-1172)"),
    "map-title-13" -> Array("Alouddin Takash \n(1172-1200)", "Алоуддин Такаш \n(1172-1200)", "Alouddin Takash \n(1172-1200)"),
    "map-title-14" -> Array("Alouddin Muhammad \n(1200-1220)", "Алоуддин Мухаммад \n(1200-1220)", "Alouddin Muhammad \n(1200-1220)"),
    "map-title-15" -> Array("Arabian \nXVI - XVII centuries", "Аравийские \nXVI - XVII вв", "Arabshohiy \nXVI - XVII asr"),
    "map-title-16" -> Array("Khiva khanate at the \nend of the XVIII century", "Хивинское ханство \nв конце XVIII века", "Xiva xonligi \nXVIII asr oxiri"),
    "map-title-17" -> Array("Khiva khanate", "Хивинское ханство", "Xiva xonligi"),
    "map-title-18" -> Array("Khiva khanate (1873-1920)", "Хивинское ханство (1873-1920)", "Xiva xonligi (1873-1920)"),
    "map-title-19" -> Array("Khiva khanate", "Хивинское ханство", "Xiva xonligi"),
    "map-title-20" -> Array("Khiva khanate", "Хивинское ханство", "Xiva xonligi"),
    "map-title-21" -> Array("XXSR 1920-1924", "XXSR 1920-1924 гг.", "XXSR 1920-1924 yillar"),
    "map-title-22" -> Array("Khorezm region", "Хорезмская обл.", "Xorazm viloyati")
  )
  val latestNews = Map(
    "latest-news" -> Array("Latest news", "Последние новости", "So'nggi yangiliklar")
  )
  val antiquePageContent = Map(
    "antik-sub-home" -> Array("Home", "Главное", "Bosh sahifa"),
    "about-khorezm-menu" -> Array("About Khorezm", "О Хорезме", "Xorazm haqida"),
    "antique-header-title" -> Array("KHOREZM IN THE ANTIQUE PERIOD", "ХОРЕЗМ В АНТИЧНЫЙ ПЕРИОД", "ANTIK DAVRDA \nXORAZM"),
    "antique-blog-title" -> Array("KHOREZM IN THE ANTIQUE PERIOD", "ХОРЕЗМ В АНТИЧНЫЙ ПЕРИОД", "ANTIK DAVRDA XORAZM"),
    "antique-blog-info-1" -> Array("The Khorezm region, one of the first centers of world civilization, is distinguished by " +
      "its unique cultural traditions, which have their ancient roots. The Khorezm oasis, located in the confluence of the Amu " +
      "Darya and the Aral Sea, one of the lifebloods of Central Asia, has been the cradle of life for our ancestors since ancient " +
      "times.One of the medieval scholars, Istakhri, commented on the Amudarya, saying that \"Khorezm is a country that could " +
      "benefit from the whole of Jaihun.\" This idea is reminiscent of Herodotus' statement about Egypt. Herodotus, the " +
      "\"father of history\" who lived in the 5th century BC, considered the whole of Egypt to be the \"gift of the Nile.\" " +
      "Ya.Gulamov “History of irrigation in Khorezm. (From ancient times to the present) ” and speaks of the Amudarya and its " +
      "delta as very similar to the two great rivers above. Thanks to these rivers, primitive man was able to live within the " +
      "vast deserts. The lakes formed as a result of the overflow of these rivers and their tributaries, as well as the tugai " +
      "and changalzars, provided the people with much of what they needed during all periods of social development. For thousands " +
      "of years, the peoples living in the oases have waged a fierce struggle against the mobile sands and water regime changes " +
      "that have swept across both rivers. They conquered deserts and rivers and built flourishing oases.",
      "Хорезмская область, один из первых центров мировой цивилизации, отличается уникальными культурными традициями, имеющими " +
        "свои древние корни. Хорезмский оазис, расположенный в месте слияния Амударьи и Аральского моря, одного из источников " +
        "жизненной силы Центральной Азии, с древних времен был колыбелью жизни наших предков. Один из средневековых ученых Истахри " +
        "так прокомментировал Амударью. , заявив, что «Хорезм - это страна, которая могла бы получить выгоду от всего Джайхуна». " +
        "Эта идея напоминает высказывание Геродота о Египте. Геродот, «отец истории», живший в V веке до нашей эры, считал весь " +
        "Египет «даром Нила». Я. Гуламов «История орошения в Хорезме. (С древних времен до наших дней) »и говорит об Амударье и " +
        "ее дельте, как об очень похожих на две великие реки выше. Благодаря этим рекам первобытный человек смог жить в бескрайних " +
        "пустынях. Озера, образовавшиеся в результате разлива этих рек и их притоков, а также тугаев и чангалзаров, давали людям " +
        "многое из того, что им было нужно на протяжении всех периодов общественного развития. На протяжении тысячелетий народы, " +
        "живущие в оазисах, вели ожесточенную борьбу с подвижными песками и изменениями водного режима, захлестнувшими обе реки. " +
        "Они покорили пустыни и реки и построили цветущие оазисы.",
      "Jahon sivilizatsiyasining ilk markazlaridan biri bo‘lgan Xorazm viloyati o‘zining qadimiy ildizlariga ega bo‘lgan o‘ziga " +
        "xos madaniy an’analari bilan ajralib turadi. Amudaryo va Orol dengizi qo‘shilgan joyda joylashgan, Markaziy Osiyoning qon " +
        "tomirlaridan biri bo‘lgan Xorazm vohasi qadimdan ajdodlarimizning hayot beshigi bo‘lib kelgan.O‘rta asr allomalaridan biri " +
        "Istaxriy Amudaryo haqida fikr bildirgan. , “Xorazm butun Jayhundan foyda oladigan davlatdir” degan. Bu fikr Gerodotning " +
        "Misr haqidagi gapini eslatadi. Miloddan avvalgi V asrda yashagan “tarixning otasi” Gerodot butun Misrni “Nilning tuhfasi” " +
        "deb hisoblagan. Ya.G‘ulomov “Xorazmda sug‘orish tarixi. (Qadim zamonlardan hozirgi kungacha) ” va Amudaryo va uning deltasi " +
        "haqida yuqoridagi ikkita katta daryoga juda o'xshashligi haqida gapiradi. Bu daryolar tufayli ibtidoiy odam keng cho'llarda " +
        "yashashga muvaffaq bo'ldi. Bu daryolar va ularning irmoqlarining toshib ketishi natijasida hosil boʻlgan koʻllar, shuningdek, " +
        "toʻqay va changalzorlar ijtimoiy taraqqiyotning barcha davrlarida aholiga zarur boʻlgan koʻp narsalarni yetkazib bergan. " +
        "Ming yillar davomida vohalarda yashovchi xalqlar har ikki daryodan oqib o‘tgan ko‘chma qumlarga, suv rejimining o‘zgarishiga " +
        "qarshi qattiq kurash olib borgan. Ular choʻl va daryolarni egallab, gullab-yashnayotgan vohalar qurdilar."),
    "antique-image-title" -> Array("Private collection 2158. Courtesy of the artist.", "Частное собрание 2158. Предоставлено художником.", "Shaxsiy kolleksiya 2158. Rassomning izni bilan."),
    "antique-blog-info-2" -> Array(
      "Khorezm is a historical region located between Turan and Iran. Its territory in ancient times stretched from the mouths of the " +
        "Amudarya to the south to the upper reaches of the Murgab and Tajan rivers. Therefore, this ancient historical region is known " +
        "in science by two names: Ancient Khorezm and Greater Khorezm. The first information about Khorezm can be found in the books of " +
        "Avesto, Bihistun by Darius 1, ancient Greek authors (Hecate, Herodotus, Strabo, etc.) and in the works of early medieval Arab geographers.\n" +
        "In the \"Yasht\" part of the Avesta, Khorezm is praised as \"a river of a thousand streams\", \"a land rich in lakes and meadows\". The " +
        "territory of ancient Khorezm is naturally divided into 2 regions. In its northern part, in the foothills of the Amu Darya, there are " +
        "countless wetlands, vast plains to the north and northeast, and in the south, a large part of the valleys of the Murgab and Tajan " +
        "rivers in the foothills of mountains and hills. fertile lands.\n The Khorezm oasis occupies the plain on the right and left banks " +
        "of the Amudarya delta. Only the southernmost part of the oasis in Tuyamoy is the middle reaches of the Amudarya. Here is a small " +
        "Pitnak oasis in the sands of the Karakum Desert, on the left bank of the Arctic.\n Approaching the oasis, there are Karakum hills " +
        "and barkhan sands that move easily under the influence of wind. The name Karakum, according to VI Masalsky, is not given by the " +
        "color of the sands, but by their desolate, lifeless appearance. According to Ya. Gulyamov, the name actually means \"evil sands\". " +
        "The Khorezmians have been passing through these sands since ancient times and have been in constant contact with Khorasan and other " +
        "parts of Iran.\n The oasis on the right bank is bordered on the northeast by the Southern and Western Kyzylkum. The relief of " +
        "the Kyzylkum surface is closely related to the tectonics of the Cretaceous rocks that make it up. Kyzylkum and Karakum sands do " +
        "not differ from each other in terms of their origin and geological formation. They consist mainly of two sands formed by the " +
        "mainland and alluvially. The first of these, reddish-yellow, or rather reddish-gray, was formed only as a result of the erosion " +
        "and flight of macteric rocks under the influence of wind. The second type of sand is gray and originates in an alluvial way, i.e., " +
        "it is formed mainly by the windsweptness of riverbeds and coastal dunes.",
      "Хорезм - исторический регион, расположенный между Тураном и Ираном. Его территория в древности простиралась от устьев Амударьи на " +
        "юг до верховий рек Мургаб и Таджан. Поэтому этот древний исторический край известен в науке под двумя названиями: Древний Хорезм и " +
        "Большой Хорезм. Первые сведения о Хорезме можно найти в книгах Авесто, Бихистун Дария 1, древнегреческих авторов " +
        "(Геката, Геродот, Страбон и др.) И в трудах раннесредневековых арабских географов.\n В «Яштской» части Авесты Хорезм славится как " +
        "«река тысячи ручьев», «земля, богатая озерами и лугами». Территория древнего Хорезма естественным образом делится на 2 региона. В " +
        "его северной части, в предгорьях Амударьи, находятся бесчисленные водно-болотные угодья, обширные равнины на севере и северо-востоке, " +
        "а на юге большая часть долин рек Мургаб и Таджан в предгорьях гор и холмов. . плодородные земли.\n Хорезмский оазис занимает " +
        "равнину на правом и левом берегу дельты Амударьи. Только самая южная часть оазиса в Тюямой - это среднее течение Амударьи. Вот " +
        "небольшой Питнакский оазис в песках пустыни Каракумы, на левом берегу Арктики.\n Приближаясь к оазису, встречаются холмы Каракум " +
        "и барханные пески, которые легко перемещаются под действием ветра. Название Каракумы, по мнению В.И. Масальского, дано не цветом " +
        "песков, а их безлюдным, безжизненным видом. По словам Я. Гулямов, собственно название означает «злые пески». Хорезмийцы проходят " +
        "через эти пески с древних времен и находятся в постоянном контакте с Хорасаном и другими частями Ирана.\n Оазис на правом берегу " +
        "граничит с северо-востоком с Южным и Западным Кызылкумами. Рельеф поверхности Кызылкумов тесно связан с тектоникой слагающих ее " +
        "меловых пород. Кызылкумские и Каракумские пески не отличаются друг от друга по своему происхождению и геологическому образованию. " +
        "Они состоят в основном из двух песков, образованных материком и наносом. Первый из них, красновато-желтый, а точнее красновато-серый, " +
        "образовался только в результате размыва и разлета макроскопических пород под действием ветра. Второй тип песка - серый и имеет " +
        "аллювиальное происхождение, т. Е. Образован в основном за счет продуваемости русел рек и прибрежных дюн.",
      "Xorazm Turon va Eron oraligʻida joylashgan tarixiy hududdir. Uning hududi qadimda Amudaryoning ogʻzidan janubga, Murgʻob va Tojan " +
        "daryolarining yuqori oqimigacha choʻzilgan. Binobarin, bu qadimiy tarixiy hudud fanda ikki nom bilan mashhur: Qadimgi Xorazm va " +
        "Katta Xorazm. Xorazm haqidagi ilk maʼlumotlarni “Avesto”, Doro 1-ning “Bihistun” kitoblarida, qadimgi yunon mualliflari (Gekate, " +
        "Gerodot, Strabon va boshqalar) va ilk oʻrta asr arab geograflari asarlarida uchratish mumkin.\n “Avesto”ning “Yasht” qismida Xorazm" +
        " “ming soyli daryo”, “koʻl va oʻtloqlarga boy oʻlka” deb maqtalgan. Qadimgi Xorazm hududi tabiiy ravishda 2 rayonga boʻlingan. " +
        "Uning shimoliy qismida, Amudaryo togʻ etaklarida son-sanoqsiz botqoqliklar, shimol va shimoli-sharqda keng tekisliklar, janubda " +
        "Murgʻob va Tajan daryolari vodiylarining katta qismi togʻ va adirlar etaklarida joylashgan. . unumdor yerlar.\n Xorazm vohasi Amudaryo " +
        "deltasining oʻng va chap qirgʻogʻidagi tekislikni egallaydi. Tuyamoydagi vohaning eng janubiy qismigina Amudaryoning oʻrta oqimidir." +
        " Mana, Arktikaning chap qirg'og'ida, Qoraqum cho'li qumlarida kichik Pitnak vohasi.\n Vohaga yaqinlashganda shamol taʼsirida oson " +
        "harakatlanadigan Qoraqum adirlari va barxon qumlari bor. Qoraqum nomi, V.I.Masalskiyning fikricha, qumlarning rangi bilan emas, " +
        "balki ularning kimsasiz, jonsiz ko‘rinishi bilan berilgan. Ya. G‘ulomov, bu ism aslida “yomon qumlar” degan ma’noni anglatadi. " +
        "Xorazmliklar qadimdan bu qumlardan oʻtib, Xuroson va Eronning boshqa hududlari bilan doimiy aloqada boʻlgan.\n Oʻng qirgʻoqdagi " +
        "voha shimoli-sharqdan Janubiy va Gʻarbiy Qizilqum bilan chegaradosh. Qizilqum sirtining relyefi uni tashkil etuvchi boʻr davri togʻ " +
        "jinslarining tektonikasi bilan chambarchas bogʻliq. Qizilqum va Qoraqum qumlari kelib chiqishi va geologik shakllanishi jihatidan " +
        "bir-biridan farq qilmaydi. Ular asosan materik va allyuvial tomondan hosil boʻlgan ikkita qumdan iborat. Ulardan birinchisi, " +
        "qizil-sariq, to'g'rirog'i, qizil-kulrang, faqat shamol ta'sirida makterik jinslarning emirilishi va parvozi natijasida hosil bo'lgan. " +
        "Ikkinchi turdagi qum kulrang bo'lib, allyuvial yo'l bilan paydo bo'ladi, ya'ni u asosan daryo o'zanlari va qirg'oq qumtepalarining " +
        "shamollaridan hosil bo'ladi."),
  )
  val ancientPageContent = Map(
    "qadimgi-home-menu" -> Array("Home", "Главное", "Bosh sahifa"),
    "qadimgi-sub-menu" -> Array("About Khorezm", "О Хорезме", "Xorazm haqida"),
    "ancient-header-title" -> Array("KHOREZM IN THE ANCIENT PERIOD", "ХОРЕЗМ В ДРЕВНИЙ ПЕРИОД", "QADIMGI DAVRDA \nXORAZM"),
    "ancient-blog-title" -> Array("KHOREZM IN THE ANCIENT PERIOD", "ХОРЕЗМ В ДРЕВНИЙ ПЕРИОД", "QADIMGI DAVRDA XORAZM"),
    "ancient-blog-info-1" -> Array("In ancient Khorezm, the ethnos mentioned in the sources under the name of Khorasmi was formed in the last " +
      "quarter of the second millennium BC. This ethnos has been a people united in terms of territorial and linguistic unity since that time. " +
      "Abu Rayhan Beruni in his work \"Osor ul-baqiya anal urun al-kholiya\" gives interesting information about the history of statehood of " +
      "ancient Khorezm. That is, this date, which began in Khorezm in the tradition of local history, the royal dynasty called the Siyavushi, " +
      "from one thousand two hundred and ninety-two BC, serves to explain another important historical event. The fact is that when we talk " +
      "about ancient Khorezm, in science we come across the concept of Greater Khorezm. This concept was conditionally introduced in the twentieth " +
      "century by the German scientist J. Marquardt, and is based on data recorded by Herodotus and other ancient Greek authors. According to this, " +
      "the land inhabited by the ancient Khorezmians was between Parthia and Bactria, that is, between modern Khorasan. The year 1292 BC indicated " +
      "by Beruni is interpreted as the year when the Khorezmians settled in the present Khorezm oasis. The historical truth of this information " +
      "seems to have been proved by Beruni in the list of the royal dynasty of that period, which consisted of 22 generations.\n  Zoroastrianism i" +
      "s a sacred book of religion of the 6th century BC, which is the main source for studying the ancient culture, beliefs, language, " +
      "literature and partial history of the peoples of Iran and Central Asia. There are different opinions about the place where the work was " +
      "written. A group of scholars say that the French J. Darmsteter, the Azerbaijani scientist I. Aliyev said that the \"Avesta\" Media was " +
      "written in the northwestern part of modern Iran and Azerbaijan, most of them were V.V. Struve, S.P. in the provinces, between Balkh and Khorezm. " +
      "The latter idea has recently been acknowledged by Iranian scholars, such as Ibrahim Pur Dawud. The text of the Avesta has not been fully preserved. " +
      "To us, only a very small part of it has arrived.",
      "В древнем Хорезме упомянутый в источниках этнос под названием Хорасми сформировался в последней четверти второго тысячелетия до нашей эры.Этот этнос с тех пор является народом, объединенным территориально-языковым единством.Абу Райхан Беруни в своем произведении «Осоруль-бакияаналурун аль-холия» дает интересные сведения об истории государственности древнего Хорезма.\nТо есть эта дата, которая началась в Хорезме в традициях местной истории, царской династии Сиявуши, с тысяча двести девяносто второго года до нашей эры, служит объяснением еще одного важного исторического события.Дело в том, что когда мы говорим о древнем Хорезме, в науке встречается понятие Большой Хорезм.Это понятие было условно введено в ХХ веке немецким ученым Дж. Марквардтом и основано на данных, зафиксированных Геродотом и другими древнегреческими авторами.Согласно этому, земля, населенная древними хорезмийцами, находилась между Парфией и Бактрией, то есть между современным Хорасаном.Указанный Беруни 1292 г. до н.э. интерпретируется как год, когда хорезмийцы поселились в нынешнем Хорезмском оазисе. Историческая правдивость этой информации, похоже, была доказана Беруни в его списке царской династии того времени, который состоял из 22 поколений.Зороастризм - священная книга религии VI-VI веков до нашей эры, которая является основным источником для изучения древней культуры, верований, языка, литературы и, отчасти, истории народов Ирана и Средней Азии.Существуют разные мнения о месте написания произведения. \nГруппа ученых, француз Дж. Дармштетер, азербайджанский ученый И. Алиев говорили, что «Авеста»писалась в северо-западной части современного Ирана и Азербайджана, а большинство из них - В.В. Струве, С.П.Толстов, Ф.Альтхайм и другие считают, что она была создана в районах вдоль Амударьи, между Балхом и Хорезмом. Последняя идея недавно была признана иранскими учеными, такими как Ибрагим Пур Дауд. Текст Авесты полностью не сохранился. К нам пришла лишь очень небольшая часть.",
      "Qadimgi Xorazmda xorasmiy nomi bilan manbalarda qayd etilgan etnos miloddan avvalgi ikkinchi ming yillikning so‘nggi choragidayoq shakllangan edi. Bu etnos o‘sha davrdan boshlab hududiy va til birligi jihatidan uyushgan xalq edi. Abu Rayhon Beruniy o‘zining “Osor ul-boqiya anal urun al-xoliya” asarida Qadimgi Xorazmning davlatchilik tarixi haqida qiziq ma’lumot beradi. Ya’ni, Xorazmda mahalliy tarix an’anasiga ko‘ra siyovushiylar deb atalmish podsholik sulolasi miloddan avvalgi bir ming ikki yuz to‘qson ikkinchi yildan boshlangan ushbu sana boshqa bir jihatdan muhim tarixiy voqealarni izohlashga xizmat qiladi. Gap shundaki, Qadimgi Xorazm haqida so‘z borganda fanda Katta Xorazm degan tushunchaga duch kelinadi. Bu tushuncha XX asrda nemis olimi Y.Markvart tomonidan shartli ravishda kiritilgan bo‘lib, Gerodot va boshqa qadimgi Yunon mualliflari tomonidan yozib qoldirilgan ma’lumotlarga tayanadi. Bunga ko‘ra, qadimgi xorazmiylar yashagan o‘lka Parfiya bilan Baqtriya o‘rtasida, ya’ni hozirgi Xuroson o‘rtalarida bo‘lgan. Beruniy ko‘rsatgan miloddan avvalgi 1292 yil esa Xorazmliklarning hozirgi Xorazm vohasiga joylashgan yili deb izohlanadi. Bu ma’lumotlarning tarixiy haqiqat ekanligi Beruniy tomonidan o‘sha davr podsholik sulolasining 22 avloddan iborat deb ko‘rsatilgan ro‘yhatida o‘z isbotini topgandek ko‘rinadi.\nZardushtiylik – otashparastlik, miloddan avvalgi VI – milodning VI asri dinining muqaddas kitobi bo‘lib, Eron hamda O‘rta Osiyo xalqlarining qadimgi madaniyati, e’tiqodi, tili, adabiyoti va qisman tarixini o‘rganishda asosiy manba hisoblanadi. Asarning yozilgan joyi haqida turlicha fikrlar mavjud. Bir guruh olimlar fransuz J.Darmsteter, ojarbayjon olimi I.Aliyev “Avesta” Midiya - hozirgi Eronning shimoli-g‘arbiy qismi va Ozarbayjonda yozilgan desalar, ko‘pchilik V.V.Struve, S.P.Tolstov, F.Altxaym va boshqalar Amudaryo bo‘yida joylashgan viloyatlarda, Balx va Xorazm oralig‘ida yaratilgan, deb hisoblaydilar. Oxirgi fikr so‘nggi vaqtlarda Eron olimlari, masalan Ibrohim Pur Dovud tarafidan ham e’tirof etildi. “Avesta” matni to‘liq saqlanmagan. Bizgacha, uning juda oz qismi yetib kelgan, xolos."),
    "ancient-blog-info-2" -> Array(
      "Information about the foundation of the first Uzbek statehood can be found first in the Avesta and in the encyclopedic scholar Abu Rayhan " +
        "Beruni's monuments of ancient peoples, written 1000 years ago, as well as in the materials of archeological research in the Khorezm oasis. " +
        "In particular, the discovery of the oldest Zoroastrian temple in Central Asia at the Khumbuztepa monument in 2013, as well as the fact that " +
        "the 2700th anniversary of the Avesto was held in Khorezm, confirms our opinion.\n  The data and archeological materials in the Avesta show " +
        "that property and social inequality arose in the society of that time, the process of transition from the primitive community system to the " +
        "class society began, and in some more developed regions the first states began to form.\n  The process of formation of a class society and the" +
        " first statehood in Central Asia was very slow. The formation of the first statehood in Khorezm took a long time. Beruni points out that its " +
        "roots go back to the 12th century BC. The process went through two stages. The first stage is mil.avv. From the XII century to the VIII century," +
        " the 2nd stage BC. It lasted from the VIII century to the VI century, that is, until the invasion of the Achaemenids of Iran. According to" +
        " Beruni, in the first stage, with the migration of Siyavush, the son-in-law of Afrosiab, the king of Turan, his son Kay Khusrav and their " +
        "descendants to Khorezm, the process of gradual unification into a single kingdom began.\n  According to Beruni, the Turkic tribes are one " +
        "of the oldest ethnic groups in Khorezm, and the Khorezm people are mainly descended from this ethnos, which is why they consider the ancient " +
        "Turkic tribes as their ancestors. Most of the tribes living in the Khorezm oasis lived a sedentary life. The part of the population living in " +
        "cities and villages was engaged in trade, handicrafts and agriculture. The population living in the desert sand zone of the oasis was " +
        "semi-settled or nomadic, engaged in hunting and cattle breeding.\n  The first step of the Avesto heroes Siyavush and his son, Kay Khusrav, " +
        "who was awarded the title of the first Khorezmshah, to establish the first statehood in Khorezm was to unite the Turkic Sak-Massaget tribes " +
        "living in this country into a single kingdom. After completing this task, Siyavush set out to build a large, powerful and centralized state " +
        "in the future, uniting the Aryan tribes living in the basins of the Tajan and Murgab rivers and in the foothills of the Turkmen-Khurasan " +
        "Mountains. This is stated in the Avesta's poem \"Osha\", paragraph 41 of part VIII: \"Mard and businessman Khusrav, who united the Aryan " +
        "countries, came to Osha.\"\n  So, when the first Khorezmshah Kay Khusrav (1200-1140) began to unite the lands around Khorezm inhabited by " +
        "Aryans (Khorezmians were also a part of Aryans), then this work was continued by his descendants.\n  The historical conditions that arose " +
        "at that time created even more favorable conditions for the Siyavush to achieve this goal. By the first half of the 1st millennium BC, " +
        "significant changes had taken place in the economic, political and ethnographic map of Central Asia, including Uzbekistan. Sogdiana and " +
        "Khorezm regions were inhabited by tribes and ethnic groups (mainly Aryans) engaged in agriculture based on artificial irrigation.\n  " +
        "Historically, Persian-speaking tribes, including the Aryans and the so-called Khorezmians, have repeatedly migrated to the Khorezm oasis.\n  " +
        "The first migration Beruni points out is that  it happened in the XIII century BC. According to him, in 1292 BC, some people came to the " +
        "Khorezm oasis and began to settle there. The second migration was in in the XII century  BC Siyavush, his son Kay Khusrav and their " +
        "descendants came to Khorezm. The third migration  it occurred as a result of the invasions of the kings of Assyria and Media in Iran and " +
        "Central Asia during the VIII-VII centuries BC.\n  The fourth migration took place during the reign of the Achaemenids of Iran. In the 6th " +
        "century BC, the Achaemenid king Darius conquered Khorezm and moved the Khorezmian tribes from Khorasan to the Khorezm oasis in order to " +
        "consolidate his rule there, where he established farming communities. In later periods, such migrations or forced relocations were common.  " +
        "Ancient Greek historians and geographers (Herodotus, Hecate, Strabo) migrated from Khorasan with the Aryan tribes called \"Khorasmians\" " +
        "and mixed with the Sak-Massaget tribes living in the Khorezm oasis for a long time. Existing written sources, archeological researches, " +
        "legends and myths confirm this idea by scientists who have been conducting archeological researches in Khorezm oasis for many years. " +
        "Including S.P. Tolstov and M.A. In the article Itina it is said that at the beginning of the 2nd millennium BC , Khorezm was invaded by the " +
        "Suyargan tribes from the southern agricultural regions of Central Asia. Archaeologist B.I. Wow. According to Iber, . During the migration " +
        "in the VIII-VII centuries BC, some of the Khorasmians moved to the Lower Amudarya, and most - to the Akchadarya.\n  The Arab geographer " +
        "al-Muqaddas, in his book The Best Guide to the Study of Climates, tells of Khorezm, where a large group of people from Khorasan were expelled " +
        "and settled. According to Yaqut al-Hamawi, an Arab traveler and geographer who visited Khorezm in 1219-1220, “the people of Khorezm " +
        "built houses, palaces, buildings, multiplied and enriched themselves in this region. They built villages and towns and became famous for " +
        "their neighboring Khorasanians. The Khorasanians moved in and settled there.\nThus, in the first quarter of the 1st millennium BC, the end " +
        "of the Bronze Age and the Early Iron Age, as a result of the merger of various Turkic and Persian-Tajik ethnic groups living in the Khorezm " +
        "oasis during the long historical development, The Khorezmian people were formed. The Siyavush dynasty relied on this people and laid the " +
        "foundation of the first Khorezm statehood. However, the statehood that began to take shape at that time could not be considered a full-fledged " +
        "state. Only its first buds were formed. Later, class stratification intensified in society, and along with free collectives, a class " +
        "of slaves and nobles was formed, and the conflict between them intensified. A strong centralized state became necessary to keep the working " +
        "masses in obedience and to protect the homeland from external enemies. The process of creating such a state took place in BC and  it came " +
        "to an end in the VIII century.\n  According to the Avesta, the Siyavush dynasty managed to unite a large number of peoples and territories, " +
        "especially the regions inhabited by Aryan tribes, around Khorezm and create a large state system based on the principles of military-democratic " +
        "confederation. Herodotus A. Markwart, Richard Fray, W. Tarn, S.P. According to Tolstoy and Gulyamov, before the Achaemenid invasion " +
        "(VI century BC) in Central Asia there was a powerful \"Great Khorezm\" and the ancient state of Bactria. The Greater Khorezm Conference " +
        "included Sogdiana (Zarafshan Valley) and Khorasan (Southern Turkmenistan, Northeastern Iran, Western Afghanistan). V. Markwart, V. Bartold, SP " +
        "Tolstov, Ya. In the 6th century BC, as a result of the invasion of the Achaemenids of Iran, the state association \"Greater Khorezm\" " +
        "disbanded. The Achaemenids ruled Central Asia for up to 200 years. In the 4th century BC, Achaemenid rule in Central Asia ended and Khorezm " +
        "became an independent state.",
      "Сведения об основании первой узбекской государственности можно найти сначала в Авесте и в памятниках древних народов энциклопедиста Абу РайханаБеруни, написанных 1000 лет назад, а также в материалах археологических исследований в Хорезмском оазисе.В частности, наше мнение подтверждается находкой древнейшего зороастрийского храма в Средней Азии в 2013 году у памятника Хумбузтепа, а также проведением 2700-летия Авесто в Хорезме.Данные и археологические материалы в Авесте показывают, что в обществе того времени возникло имущественное и социальное неравенство, начался процесс перехода от первобытной общинной системы к классовому обществу, а в некоторых более развитых регионах начали формироваться первые государства.Процесс становления классового общества и первой государственности в Средней Азии шел очень медленно. Становление первой государственности в Хорезме длилось долго. Беруни указывает, что его корни уходят в XII век до нашей эры. Процесс прошел в два этапа. Первый этап с XII по VIII век до нашей эры, 2 этап с VIII по VI век до нашей эры, то есть до вторжения Ахеменидов в Иран.По словам Беруни, на первом этапе процесс объединения в единое царство начался с переселения в Хорезм Сиявуша, зятя Афросиаба, царя Турана, его сына Кая Хусрава и их потомков.\nПо словам Беруни, тюркские племена - одна из древнейших этнических групп в Хорезме, и хорезмцы в основном происходят от этого этноса, поэтому они считают древние тюркские племена своими предками.Большинство племен, населявших Хорезмский оазис, вели оседлый образ жизни. Часть населения, проживавшая в городах и селах, занималась торговлей, ремеслами и сельским хозяйством. Население, проживавшее в зоне песков пустыни оазиса, было полуседельным или кочевым, занималось охотой и скотоводством.\nПервым шагом авестийских героев Сиявуша и его сына Кая Хусрава, удостоенного титула первого хорезмшаха, к созданию первой государственности в Хорезме было объединение тюркских сак-массагетских племен, проживающих в этой стране, в единое царство.Выполнив эту задачу, Сиявуш вознамерился построить в будущем большое, мощное и централизованное государство, объединяющее арийские племена, живущие в бассейнах рек Таджан и Мургаб и в предгорьях Туркмен-Хорасанских гор.Об этом говорится в стихотворении Авесты «Оша», абзац 41 части VIII: «В Ош приехали Мард и бизнесмен Хусрав, объединившие арийские страны».Итак, когда первый хорезмшах Кай Хусрав (1200-1140) начал объединять земли вокруг Хорезма, населенные ариями (хорезмийцы тоже входили в состав арийцев), то эту работу продолжили его потомки.Сложившиеся в то время исторические условия дали Сиявушам гораздо лучшую возможность для достижения этой цели.К первой половине I тысячелетия до нашей эры, включая Узбекистан, происходя существенные изменения  на экономической, политической и этнографической карте Центральной Азии, были заселены племена и этнические группы(в основном арийцы) занимавшимися земледелием на основе искусственного орошения в регионах Гиркания, Парфия, Маргиана, Ария , Бактрия,Атрок, Мургаб, Герируд (Таджан), Кундуз и низовья Амударьи и Зарафшанскойдолины в Согдианскойи Хорезмской области.\nИсторически сложилось так, что персоязычные племена, в том числе арии и так называемые хорезмийцы, неоднократно переселялись в Хорезмский оазис.\nПервая миграция, на которую указывает Беруни, заключается в том, что это произошло в XIII веке до нашей эры. По его словам, в 1292 году до нашей эры некоторые люди пришли в Хорезмский оазис и стали там селиться. Второе переселение связано с приходом Сиявуша, его сына Кая Хусрава и их потомков в Хорезм в XII веке до нашей эры. Третье переселение произошло в результате вторжений царей Ассирии и Мидии в Иран и Среднюю Азию в VIII-VII веках до нашей эры.Четвертое переселение произошло во время правления Ахеменидов в Иране. В VI веке до нашей эры царь Ахеменидов Дарий завоевал Хорезм и переселил хорезмские племена из Хорасана в Хорезмский оазис, чтобы укрепить здесь свое правление, где он основал земледельческие общины. В более поздние периоды такие миграции или принудительные переселения продолжались.Древнегреческие историки и географы (Геродот, Геката, Страбон) мигрировали из Хорасана с арийскими племенами, называемыми «хорезмийцами», и смешались с сак-массагетскими племенами, долгое время проживавшими в Хорезмском оазисе.Существующие письменные источники, археологические исследования, легенды и мифы подтверждают эту идею учеными, которые на протяжении многих лет проводят археологические исследования в Хорезмском оазисе. В том числе С. Толстов, М.А. Итина говорит, что суярганские племена пришли в Хорезм из южных сельскохозяйственных районов Средней Азии в начале второго тысячелетия до нашей эры.Согласно археолог Б.И. Вай Иберу, во время миграции в VIII-VII веках до нашей эры часть хорезмийцев переселилась в Нижнюю Амударью, а большая часть - в Акчадарью.\nАрабский географ аль-Мукаддас в своей книге «Лучшее руководство по изучению климата» рассказывает о Хорезме, куда была изгнана и поселена большая группа людей из Хорасана.По словам Якута аль-Хамави, арабского путешественника и географа, посетившего Хорезм в 1219–1220 годах, «жители Хорезма строили дома, дворцы, здания, умножались и обогащались в этом регионе.Они построили села и города и стали известными среди соседних хорасанов, хорасаны переселились в них и начали селиться.Таким образом, в первой четверти I тысячелетия до нашей эры, конце бронзового века и раннем железном веке, в ходе длительного исторического развития различных исторических тюркских и персидско-таджикских этносов, проживавших в Хорезмском оазисе, первой общей древности предки узбекского народа Первый хорезмский народ сформировался как единое целое.Династия Сиявушов опиралась на этот народ и положила начало первой хорезмской государственности.Однако государственность, которая начала складываться в то время, не могла считаться полноценным государством. Были сформированы только его первые бутоны.\nПозже в обществе усилилось классовое расслоение, и наряду со свободными коллективами образовался класс рабов и дворян, между которыми усилился конфликт.Сильное централизованное государство стало необходимым, чтобы держать трудящиеся массы в повиновении и защищать родину от внешних врагов. Процесс создания такого государства подошел к концу в VIII веке до нашей эры.Согласно Авесте, династии Сиявуш удалось объединить вокруг Хорезма большое количество народов и территорий, особенно области, населенные арийскими племенами, и создать крупную государственную систему, основанную на принципах военно-демократической конфедерации.По мнению Геродота, А. Маркварта, Ричарда Фрей, В. Тарна, Толстова и Ю. Гулямова, до нашествия Ахеменидов (VI век до н.э.) в Средней Азии существовал могущественный «Великий Хорезм» и древнее государство Бактрия.Конференция Великого Хорезма включала Согдиану (Зарафшанская долина) и Хорасан (Южный Туркменистан, Северо-Восточный Иран, Западный Афганистан).В.Маркварт, В.Бартольд, С.П.Толстов, Я.Ғуломов говорят, чтоАрианам Вайджа (арийское пространство) в Авесте считается территорией Государственного объединения Большого Хорезма.В VI веке до нашей эры в результате вторжения Ахеменидов в Иран Государственное объединение Великого Хорезма распалось. Ахемениды правили Средней Азией до 200 лет.В IV веке до нашей эры власть Ахеменидов в Средней Азии закончилась, и Хорезм стал независимым государством.",
      "Ilk o‘zbek davlatchiligiga asos solinishi hakidagi ma’lumotlarni biz dastavval Avestodan hamda qomusiy olim Abu Rayxon Beruniyning bundan 1000 yil mukaddam yozilgan Qadimgi xalqlardan qolgan yodgorliklar, qolaversa, Xorazm vohasida o‘tkazilgan arxeologik tadqiqotlar materiallaridan topamiz. Jumladan, Xumbuztepa yodgorligidan 2013 yilda O‘rta Osiyo miqyosidagi eng qadimgi zardushtiylik ibodatxonasining topilishi va shu bilan birga “Avesto”ning 2700 yillik yubileyining ham Xorazmda o‘tkazilganligi, bu fikrimizni tasdiqlaydi.\nAvestoda keltirilgan ma’lumotlar hamda arxeologik materiallar shuni ko‘rsatadiki, o‘sha davrdagi jamiyatda mulkiy va sosial tengsizlik vujudga kelib, ibtidoiy jamoa tuzimidan sinfiy jamiyatga utish jarayoni boshlanib, ba’zi bir ko‘proq rivojlangan mintaqalarda dastlabki davlatlar ham shakllana boshlagan.\nO‘rta Osiyoda sinfiy jamiyat va ilk davlatchilikning shakllanishi jarayoni juda sekin kechgan. Xorazmda xam ilk davlatchilikning shakllanishi uzoq davom etgan. Beruniyning ta’kidlashicha, uning ildizlari mil.avv.XII asrga borib tutashadi. Bu jarayon ikki bosqichni o‘z boshidan kechirgan. Birinchi bosqichi mil.avv. XII asrdan VIII asrgacha, 2-bosqichi mil.avv. VIII asrdan VI asrgacha, ya’ni Eron ahamoniylari istilosiga qadar davom etgan. Beruniyning xabar berishicha, birinchi bosqichda Turon podshosi Afrosiyobning kuyovi Siyovush, uning o‘g‘li Kay Xusrav va ularning avlodlarining Xorazmga ko‘chib kelishi bilan bu yerda asta-sekin yagona podsholikka birlashish jarayoni boshlangan.\nBeruniyning ta’kidlashicha turkiy kabilalar Xorazmning eng qadimgi etnik guruhlaridan bo‘lib, Xorazm elati asosan shu etnosdan kelib chiqqan, Shuning uchun xam ular qadimgi turkiy qabilalarni o‘zining ajdodlari deb xisoblaydilar. Xorazm voxasida istiqomat qilgan qabilalarning aksariyati o‘troq xayot kechirganlar. Aholining shahar va qishloqlarida yashagan qismi savdo – sotiq, hunarmandchilik, dexqonchilik bilan shug‘ulangan. Vohaning cho‘l qum zonasida yashagan aholi esa yarim o‘troq yoki ko‘chmanchi bo‘lib, ovchilik va chorvachilik bilan shug‘ullangan.\nAvesto qahramonlari Siyovush va uning o‘g‘li, birinchi Xorazmshoh unvoniga sazovor bo‘lgan Kay Xusravning Xorazmda ilk davlatchilikka asos solish yo‘lidagi dastlabki qadami shu o‘lkada azaldan istiqomat qilib kelayotgan turkiy sak-massaget qabilalarini o‘ziga bo‘ysundirib, yagona bir podsholikka birlashtirishdan iborat bo‘lgan. Bu vazifa amalga oshgach, Siyovush ikkinchi, bundan ham murakkabroq vazifani, ya’ni Tajan va Murg‘ob daryolari havzasida hamda Turkman – Xuroson tog‘lari etaklarida istiqomat qilayotgan ariy qabilalarini o‘z podsholigi tarkibiga birlashtirib, kelajakda katta, qudratli va markazlashgan davlat barpo etishga kirishgan. Bu xaqda Avestoning “Osha” qasidasi, VIII qismining 41 bandida shunday deyilgan: “Oriyoniy mamlakatlarini birlashtirgan Mard va tadbirkor Xusrav keldi Osha qoshiga”.\nDemak, birinchi Xorazmshox Kay Xusrav (1200-1140) Xorazm atrofiga ariylar (Xorazimiylar ham ariylarning bir qismi bo‘lgan) yashayotgan o‘lkalarni birlashtira boshlagach, undan keyin bu ishni uning avlodlari davom etirgan. Bu maqsadga erishishda Siyovushlarga o‘sha davrda vujudga kelgan tarixiy sharoit xam ancha qulay imkoniyatlar tug‘dirgan.\nMil.avv. 1 ming yillikning birinchi yarmiga kelib, O‘rta Osiyo, jumladan O‘zbekistonning iqtisodiy – siyosiy va etnografik xaritasida muhim o‘zgarishlar ro‘y berib, Atrok, Murg‘ob, Gerirud (Tajan), Qunduz hamda Amudaryoning quyi oqimi va Zarafshon vodiysida joylashgan Girkaniya, Parfiya, Marg‘iyona, Ariya, Baqtriya, Sug‘diyona hamda Xorazm viloyatlariga sun’iy sug‘orishga asoslangan dexqonchilik bilan shug‘ullanuvchi qabila va elatlar (asosan ariylar) kelib joylashganlar. \nTarixda forsiyzabon qabilalarning jumladan ariylar va Xorazmiy deb atalgan qavmlarning Xorazm vohasiga bir qancha bor qo‘chib kelish jarayoni kuzatiladi.\nBirinchi ko‘chib kelish Beruniy ta’kidlashicha, mil. avv. XIII asrda ro‘y bergan. Uning aytishicha, mil.avv. 1292 yilda Xorazm vohasiga qandaydir aholi kelib joylasha boshlagan. Ikkinchi ko‘chib kelishi mil.avv. XII asrda Siyovush, uning o‘g‘li Kay Xusrav va ularning avlodlarini Xorazmga kyelishlari bilan bog‘liq. Uchinchi ko‘chib kelish mil.avv. VIII-VII asrlar davomida Ossuriya va Midiya podsholarining Eron va O‘rta Osiyoga qilgan tajovuzlari natijasida ro‘y bergan.\nTo‘rtinchi ko‘chib kelish Eron ahamoniylar hukmronligi davrida ro‘y bergan. Mil.avv VI asrda ahamoniylar shohi Doro Xorazmni bo‘ysundirib, bu yerda o‘z hukmronligini mustahkamlash maqsadida Xurosondan Xorazmiy qavmlarini Xorazm vohasiga ko‘chirib, bu yerda dehqonchilik jamoalari tashkil qilgan. Keyingi davrlarda bunday ko‘chib kelishlar yoxud majburan ko‘chirib kelishlar davrm etgan.\nAntik Yunon tarixchilari, geograflari (Gyerodot, Gekatey, Strabon) “Xorasmiy” deb atagan elat ariy qabilalari bilan Xurosondan ko‘chib kelib, Xorazm vohasida qadimdan istiqomat qilayotgan sak-massaget qabilalari bilan aralashib, qo‘shilib yagona “Xorazmliklar” deb atalgan xalqni shakllanishida o‘z hissalarini qo‘shganlar.\nMavjud yozma manbalar, arxeologik tadkikotlar, rivoyatu-afsonalar bu fikrni Xorazm vohasida ko‘p yillar arxeologik tadqiqotlar olib borgan olimlar ham tasdiqlaydilar. Jumladan S.P. Tolstov va M.A. Itina maqolasida mil.avv. 2 ming yillik boshlarida Xorazmga O‘rta Osiyoning janubiy dehkonchilik viloyatlaridan Suyargan qabilalari kirib kelgan deydi.\nArxelog B.I. Vay. Iberning fikricha, “mil.avv. VIII-VII asrlarda ro‘y bergan ko‘chish vaqtida Xorasmiylarning bir qismi Quyi Amudaryo bo‘yiga, aksariyati esa-Aqchadaryo bo‘yiga ko‘chib kelgan”.\nArab geografii al-Muqaddasiy ham o‘zining “Iqlimlarni o‘rganish uchun eng yaxshi qo‘llanma»”nomli asarida Xorazm haqida hikoya qilib, bu yerga Xurosondan katta bir guruh odamlar badarg‘a qilinganligi va ular bu yerda vatan tutib yashab qolganliklari xususida ma’lumot beradi.\n1219-1220 yillarda Xorazmda bo‘lgan arab sayyoxi va geografi Yoqut al-Hamaviyning ta’kidlashicha, “ahli Xorazm bu viloyatda uylar saroylar, imoratlar qildilar, ko‘paydilar, boyidilar. Ular qishloq va shaharlar bunyod kilib, qo‘shnisi xurosonliklarga mashhur bo‘ldilar Xurosonliklar ularning qoshiga ko‘chib kelib, o‘rnasha boshladilar.\nShunday kilib, mil.avv. 1 ming yillikning birinchi choragida bronza (jez) davrining oxiri va ilk temir davrida, uzoq davom etgan tarixiy rivojlanishi davrida Xorazm vohasida istiqomat qilgan turli turkiy va fors tojik etnik guruhlarning qo‘shilishi, bir-biriga singishib ketishi natijasida o‘zbek xalqi ajdodlarining ilk umumiy antik birligi sifatida dastlabki Xorazm elati shakllandi.\nSiyovushlar sifatida sulolasi mana shu elatga tayanib, ilk Xorazm davlatchiligiga asos sola boshladilar. Biroq o‘sha davrda shakllana boshlagan davlatchilikni tom ma’noda to‘laqonli davlat deb bo‘lmas edi. Uning faqat dastlabki kurtaklarigina shakllangan edi, xolos.\nKeyinchalik jamiyatda sinfiy tabaqalanish kuchayib, erkin jamoachilar bilan bir qatorda qullar va zadogonlar tabaqasi shakllanib, ular o‘rtasida ziddiyat keskinlashib ketdi. Mehnatkash ommani itoatda ushlab turish hamda vatanni tashqi dushmanlardan himoya qilish uchun qudratli markazlashgan davlat zarur bo‘lib qoldi. Shunday davlatni vujudga kelish jarayoni mil.avv. VIII asrga kelib o‘z nihoyasiga yetdi.\nAvestoda qayd qilinishicha, Siyovushlar sulolasi turli elat va hududlarni, ayniqsa ariy qabilalari istiqomat qilayotgan viloyatlarni Xorazm atrofiga birlashtirib, harbiy-demokratik konfederasiya prinsiplariga asoslangan katta davlat ushyumasini tuzishga muvvafaq bo‘lgan.\nGyerodot A.Markvart, Richard Fray, V. Tarn, S.P. Tolstov va Ya.Gʻulomovlarning ta’kidlanishicha, ahomoniylar istilosiga qadar (mil.avv. VI asr) Markaziy Osiyoda qudartli “Katta Xorazm” va kadimgi Baqtriya davlatlari mavjud bo‘lgan.\n“Katta Xorazm” konferensiyasi tarkibiga Sug‘diyona (Zarafshon vodiysi) Xuroson (Janubiy Turkmaniston, Shimoli-Sharkiy Eron, Gʻarbiy Afg‘oniston) kirgan. V.Markvart, V.Bartold, S.P.Tolstov, Ya.Gʻulomov Avestodagi “Arianam Vayja” (ariylar kengligi) aynan “Katta Xorazm” davlat uyushmasi hududlari deydilar.\nMil.avv.VI asrda Eron axamoniylari istilosi natijasida “Katta Xorazm” davlat uyushmasi tarqalib ketadi. Ahamoniylar O‘rta Osiyoda 200 yilgacha xukmronlik qilganlar.\nMil.avv. IV asrda O‘rta Osiyoda ahamoniylar hukmronligi tugatildi va Xorazm mustakil davlat bo‘lib chiqadi."
    )
  )
  val middleAgesPageContent = Map(
    "middle-home-menu" -> Array("Home", "Главное", "Bosh sahifa"),
    "middle-sub-menu" -> Array("About Khorezm", "О Хорезме", "Xorazm haqida"),
    "middle-header-title" -> Array("KHOREZM IN THE EARLY MIDDLE AGES", "ХОРЕЗМ В РАННЕМ СРЕДНЕМ ВОЗРАСТЕ", "ILK O'RTA ASRLARDA XORAZM."),
    "middle-blog-title" -> Array("KHOREZM IN THE EARLY MIDDLE AGES", "ХОРЕЗМ В РАННЕМ СРЕДНЕМ ВОЗРАСТЕ", "ILK O'RTA ASRLARDA XORAZM."),
    "middle-blog-info-1" -> Array(
      "Socio-political and cultural life in the Afrigiys era.\n\n  According to Beruni's list of 22 generations of the Sioux dynasty, the era of the new Khorezm dynasty begins with the reign of King Afrig, the youngest, or rather the last, dynasty of the dynasty. The accession of Afrigiys to the throne dates back to 305 AD. From this period until 995, the Afrigiys ruled on the throne of Khorezm.\n  Khorezm retained its political independence both during the Hephthalite period (second half of the 5th century - middle of the 6th century) and the Turks (second half of the 6th century - first half of the 7th century). The Byzantine historian Menander gives incomplete information that Khorezm established diplomatic relations with Byzantium and the Turks in the 1960s.\n  Arab sources state that Khorezm was twice conquered by the Arab generals Salim ibn Ziyad and Umayn ibn Abdullah. In fact, looting raids were carried out on these lands, as was the case with the cities of Movaraunnahr. Only at the beginning of the VIII century the armies led by the viceroy of Khorasan Qutayba ibe Muslim completely conquered Khorezm. Qutayba exterminates and persecutes the scholars who created and preserved the historical literature and cultural heritage of the Khorezmians. Therefore, there are not enough written sources on the history of the pre-Arab state of Khorezm.",
      "Общественно-политическая и культурная жизнь в эпоху афригидов\n\nСогласно списку Беруни, состоящий из 22 поколений династии Сиявушей, эпоха новой Хорезмской династии началась с правления короля Африга, который считался самой молодой, а точнее последней ветвью династии. Вступление Африга на престол датируется 305 годом нашей эры. С этого периода до 995 года на престоле Хорезма правили афригиды. \nХорезм сохранял свою политическую независимость как в эпоху эфталитов (вторая половина V - середина VI века), так и турков (вторая половина VI - первая половина VII веков). Византийский историк Менандр дает неполные сведения о том, что Хорезм установил дипломатические отношения с Византией и турками в 60-х годах VI века.\nСогласно арабским источникам, Хорезм дважды был завоеван арабскими генералами Салимом ибн Зиядом и Умайном ибн Абдуллох. Фактически на эти земли проводились набеги мародерства, как и в случае с городами Мавераннахра. Только в начале VIII века войска во главе с наместником Хорасана Кутайба ибн Муслимом полностью захватили Хорезм.",
      "Afrig‘iylar davrida ijtimoiy-siyosiy va madaniy hayot\n\nBeruniy tomonidan siyovushiylar sulolasining 22 avloddan iborat deb ko‘rsatilgan ro‘yxatida sulolaning yosh, to‘g‘rirog‘i so‘nggi bo‘g‘ini deb hisoblangan Afrig‘ degan podsho hukronligidan yangi xorazmshoxlar sulolasi davri boshlanadi. Afrig‘ning taxtga kelishi milodiy 305 yilga tqg‘ri keladi. Shu davrdan boshlab afrig‘iylar to 995 yilgacha Xorazmning podsholik taxtida hukmron bo‘lganlar.\nXorazm eftaliylar (V asrning 2-yarmi – VI asrning o‘rtalari) davrida ham, turklar (VI asrning 2- yarmi – VII asrning 1-yarmi) davrida ham o‘zining siyosiy mustaqilligini saqlab qoldi. Vizantiyalik tarixchi Menandr, Xorazm VI asrning 60-yillarida Vizantiya va turklar bilan diplomatik aloqalar olb borganligi to‘g‘risida to‘liq bo‘lmagan ma’lumot beradi.\nArab manbalarida Xorazmning arab lashkarboshilari Salim ibn Ziyod va Umayn ibn Abdulloh tomonidan ikki marta bo‘ysundirilganligi to‘g‘risida gapiriladi. Aslini olganda bu yerlarga ham Movaraunnaxr shaharlariga nisbatan qilinganidek, talon-taroj yurishlari uyushtirilib turilgan. Faqat VIII asrning boshidagina Xuroson noibi Qutayba ibe Muslim boshchiligidagi qo‘shinlar Xorazmni uzil-kesil bosib oldilar. Qutayba xorazmliklarning tarixiy adabiyoti va madaniy merosini yaratgan va saqlab kelgan olimlarni qirib yuboradi va quvg‘in qiladi. Shuning uchun ham, arablargacha bo‘lgan Xorazm davlati tarixiga oid yetarli yozma manbalar uchramaydi."
    ),
    "middle-blog-info-2" -> Array(
      "From 712 to 730, a group of supporters of Khurzod, the brother of the Khorezmshah, who had been brutally oppressed and persecuted by the Arabs, moved to the territories of the Caspian Khanate, where they took control of the army and the state. They are strengthening their military position and threatening the lands occupied by the Arabs in the Caucasus.\n  During this period, the Urgench Valley and the Khorezm state were directly subordinated to the caliphate, each paying a separate tribute. The rulers of the Khorezm state took a number of measures to strengthen their position. Information about the arrival of the ambassadors of Khorezmshah Shaushfir to China in 751 has been preserved.\n  Depressed by strong earthquakes, the Khorezm state was under the rule of the Tahirids, Saffarids and Samanids, the largest independent states that emerged in Central Asia and Eastern Iran in the IX-X centuries due to the collapse of the Arab Caliphate.\n   As for the cultural and spiritual changes of the African period, the Khorezmians continued their religious-philosophical, scientific and artistic work, which was formed in antiquity. Beruni in his book \"Monuments of ancient peoples\" reports that the Khorezm people had a calendar-calendar system adapted to pre-Islamic irrigated agriculture. “The people of Khorezm are in line with the Sogdian people at the beginning of the year and the months are in opposition to the Iranians. The customs of the Khorezmians are similar to those of the Sogdians, in whom the beginning of summer is the beginning of the new year, ”Beruni said.\n  Speaking of the stars of the constellation Beruni, it shows that in ancient Khorezm the notions of celestial lights were much more perfect. Beruni notes that \"the Khorezmians knew the constellations better than the Arabs.\" Beruni proves with evidence that the stars in some constellations are correctly represented in the Khorezmians in relation to the Arabs. The above data show that scientific knowledge developed in Khorezm in the morning.\n  The rich scientific and cultural heritage created in the ancient and early Middle Ages in the country plays an important role in the cultural development of Central Asia and Khorezm during the Renaissance.\n  It is known that the beginning of the IX-XIII centuries is known in the history of the peoples of the East as the Eastern Renaissance or \"Islamic Renaissance\". This period is characterized by high socio-economic, cultural, scientific and educational development in the Middle East, Central Asia, Khorezm, Khorasan, Iran, North India and neighboring countries, which were previously part of the caliphate. First of all, the material and spiritual foundations of this rise were connected with the development of the productive forces of feudal society at that time, and its material basis was created during the caliphate. By the ninth century, a group of famous Oriental scholars, thinkers, and translators working in the natural and human sciences in the capital, Baghdad, had made a tremendous contribution to the development of world science with their invaluable works. The economic and cultural upsurge of the Renaissance was also due to the separation of Central Asia, Khorasan, and the Arab Caliphate from Iran, the emergence of independent states in these regions, the cessation of hostilities, and the Enlightenment rulers' focus on economic and cultural development. At that time, a number of cities in the East, including Baghdad, Damascus, Nishapur, Ray, Jurjan, Merv, Bukhara, Samarkand, Kot, Gurganj, Khiva and others became famous not only as centers of trade, handicrafts, but also science and enlightenment. The Bayt ul-Hikma, one of the first academies of the East in Baghdad in the ninth century, was founded by scholars who worked at the institute.\n  Most of them, including Muhammad al-Khorezmi, Ahmad al-Farghani, Ahmad al-Marwazi, Abbas al-Jawhari, and others, were well-known scholars and thinkers who grew up in the lands of Movarounnahr and Khorezm. The invaluable works and scientific discoveries created by them later became the spiritual basis for the achievements of the team of scientists of the Khorezm Mamun Academy in the field of theoretical and applied sciences. Beruni, Abu Nasr ibn Iraq, and Ibn Sina are pleased to note that in their research they have made extensive use of the works of the scholars of the House of Wisdom in Baghdad, Indian and ancient Greek scholars and thinkers. In particular, the names of ancient Greek thinkers such as Aristotle, Ptolemy, Euclid, Hippocrates, Galen, Pythagoras are mentioned with reverence.\n  In fact, our compatriot Muhammad al-Khorezmi (783-850) was one of the leading scholars, scientific advisers of Bayt ul-Hikma, one of the scholars who created a new direction and school in science. He left dozens of works in the fields of astronomy, mathematics, geography, history and other sciences. His book Al-jabr val-muqabala was one of the first works in the world to establish the science of algebra. The scientist created a decimal positional system in mathematics. On this basis, he taught the East and Europe advanced computer systems, discovering a convenient and easy way of the practice of addition, subtraction, multiplication, and division. The concept of algorithm, a mathematical concept that refers to any regular, consistent computational process in science, is also directly related to the name of al-Khorezmi, as the Latin name of the scientist was changed to \"Algorithm\", \"Algorithm\" in the West.",
      "Кутайба истребляет и преследует ученых, создавших и сохранивших историческую литературу и культурное наследие хорезмийцев. Поэтому письменных источников по истории доарабского государства Хорезм недостаточно. С 712 по 730 год группа сторонников Хурзода, брата хорезмшаха, жестоко притесняемого и преследуемого арабами, во главе Булона двинулась на территорию Каспийского ханства, где они взяли под свой контроль армию и государство. Они усиливают свою военную позицию и угрожают оккупированным арабами землям на Кавказе.\nВ этот период Ургенчская долина и Хорезмское государство были напрямую подчинены халифату, каждый платил отдельную дань. Правители Хорезмского государства предприняли ряд мер для укрепления своего положения. Сохранились сведения о прибытии в Китай послов хорезмшаха Шаушфира в 751 году.\nПодавленное сильными трясками, Хорезмское государство находилось под властью Тахиридов, Саффаридов и Саманидов, крупнейших независимых государств, возникших в Средней Азии и Восточном Иране в IX-X веках в результате распада Арабского халифата.\nЧто касается культурных и духовных изменений афригийского периода, то хорезмийцы продолжили свою религиозную, философскую, научную и художественную деятельность, которая была сформирована в древности. Беруни в своем труде «Памятники минувших поколений» сообщает, что у хорезмцев была календарная система, адаптированная к доисламскому орошаемому земледелию. «Народ Хорезма соответствует согдийскому народу в начале года, а месяцы противостоят иранцам. Обычаи хорезмийцев похожи на обычаи согдийцев, у которых начало лета - начало Нового года », - сказал Беруни. Говоря о звездах, свойственных созвездию Беруни, он показывает, что в древнем Хорезме представления о небесных сияниях были гораздо более совершенными. Это отмечает Беруни, что «хорезмийцы знали свои зодиаки лучше, чем арабы». Беруни доказывает, что звезды в некоторых созвездиях правильно представлены у хорезмийцев по отношению к арабам. Приведенные данные показывают, что в Хорезме так рано развивались научные знания.\nБогатое научное и культурное наследие древнего и раннего средневековья играет важную роль в культурном развитии Средней Азии и Хорезма в эпоху Возрождения. \nИзвестно, что начало IX-XIII веков в истории народов Востока известно как Восточное Возрождение или «Исламское Возрождение». Этот период характеризуется высоким социально-экономическим, культурным, научным и образовательным развитием на Ближнем Востоке, в Центральной Азии, Хорезме, Хорасане, Иране, Северной Индии и соседних странах, ранее входивших в состав халифата. Прежде всего, материальная и духовная основы этого подъема были связаны с развитием производительных сил феодального общества того времени, а его материальная основа была создана во время халифата. К IX веку группа известных востоковедов, мыслителей и переводчиков, занимавшихся естественными и гуманитарными науками в столице Багдада, своими бесценными трудами внесла огромный вклад в развитие мировой науки. Экономический и культурный подъем эпохи Возрождения был также связан с отделением Центральной Азии, Хорасана и Ирана от Арабского халифата, появлением независимых государств в этих регионах, прекращением конфликтов и сосредоточением правителей эпохи Просвещения на экономических и социальных проблемах, еще просвещенные правители уделяли особое внимание экономическому и культурному развитию страны. В то время ряд городов Востока, в том числе Багдад, Дамаск, Нишапур, Рай, Джурджан, Марв, Бухара, Самарканд, Кят, Гургандж, Хива и другие, прославились не только торговлей и ремеслами, но и центрами народного промысла, знания и просвещения. «Байт-уль-Хикма», действовавшая в Багдаде в девятом веке, была одной из первых академий на Востоке, и большинство ученых, работавших в этой школе, в том числе Мухаммад аль-Хорезми, Ахмад аль-Фергани, Ахмад аль- Марвази, Аббас аль-Джавхари и другие были известными учеными и мыслителями, выросшими в Мавераннахре и Хорезме.  Созданные ими бесценные труды и научные открытия впоследствии стали духовной основой достижений коллектива ученых Хорезмской Академии Мамуна в области теоретических и прикладных наук. Беруни, Абу Наср ибн Ирак и Ибн Сина с удовлетворением отмечают, что в своих исследованиях они широко использовали работы ученых «Байт-уль-Хикма» в Багдаде, индийских и древнегреческих ученых и мыслителей. В частности, с почтением упоминаются имена древнегреческих мыслителей, таких как Аристотель, Птолемей, Евклид, Гиппократ, Гален, Пифагор.\nДействительно, наш соотечественник Мухаммад аль-Хорезми (783-850) был одним из ведущих ученых, научных советников Байт уль-Хикма, ученым, создавшим новое направление и школу в науке. Он оставил десятки работ в области астрономии, математики, географии, истории и других наук. Его книга «Аль-джабр валь-мукабала» была одним из первых в мире произведений, основавших науку об алгебре. Ученый создал в математике десятичную позиционную систему. На этой основе он обучал Восток и Европу, открывая удобный и простой способ практики сложения, вычитания, умножения и деления. Математическая концепция – концепция алгоритма, которая относится к любому регулярному, последовательному вычислительному процессу в науке, также напрямую связана с именем аль-Хорезми, потому что латинское имя ученого на Западе изменилось на «Алгоризм», «Алгоритмус».",
      "Arablarning shavqatsiz zulmi va quvg‘iniga uchragan xorazmshoxning ukasi Xurzod tarafdorlaridan bir guruhi Bulon boshchiligida 712 yildan 730 yilgacha Xazar xoqonligi hududlariga ko‘chib, mustahkam o‘rnashib, bu yerda ular armiya, davlatni boshqarish ishlarini o‘z qo‘llariga oldilar. Ular harbiy mavqelarini mustahkamlab, Kavkazda arablar egallagan yerlarga xavf sola boshlaydilar.\nBu davrda Urganch vodiysi va Xorazm davlati xalifalikka to‘g‘ridan-to‘g‘ri bo‘ysunib, har qaysisi alohida-alohida xiroj to‘lab turishgan. Xorazm davlati hukmdorlari o‘z mavqelarini mustahkamlash uchun bir qancha tadbirlarni amalga oshirishgan. 751 yil xorazmshoh Shaushfirning elchilari Xitoyga kelganligi haqida ma’lumotlar saqlanib qolgan.\nKuchli larzalardan tushkunlikka uchragan Xorazm davlati IX-X asrlarda Arab xalifaligining yemirilishi tufayli ketma-ket O‘rta Osiyo va Sharqiy Eronda paydo bo‘lgan yirik mustaqil davlatlar tohiriylar, safforiylar va somoniylar qo‘l ostida bo‘lgan.\nAfrig‘iylar davridagi madaniyg‘ma’naviy o‘zgarishlar haqida to‘xtaladigan bo‘lsak, bu davrda ham xorazmliklar antik davrdayoq shakllangan diniy-falsafiy, ilmiy va badiiy ijodiyotini davom ettirganlar. Beruniy o‘zining «Qadimgi xalqlardan qolgan yodgorliklar» asarida xorazmliklarning islomgacha sug‘orma dexqonchilik ishlariga muvofiqlashtirilgan taqvim-kalendar tizimi bo‘lganligi haqida xabar beradi. «Xorazm ahli yil va oylar boshlari So‘g‘d ahlinikiga muvofiq bo‘lib eronliklarnikiga esa muxolifdir. Xorazmliklarning rasm-rusumlari So‘g‘diylarnikiga o‘xshay-di, ularda ham yoz boshi novsorjining avvalidir», deb xabar beradi Beruniy.\nBeruniy burjlar turkumiga xos yulduzlar haqida gapirib, qadimgi xorazmliklarda osmon yoritqichlari haqidagi tushunchalar ancha mukammal bo‘lganligini ko‘rsatadi. Beruniy bu haqda «xorazmliklar burjlarini arablardan yaxshiroq bilganlar», deb qayd etadi. Ayrim burjlardagi yulduzlarni arablarga nisbatan xorazmliklarda to‘g‘ri ko‘rsatilganligini Beruniy dalillar bilan isbotlab beradi. Yuqorida keltirilgan ma’lumotlar Xorazmda ilmiy bilimlarning ertadanoq rivoj topganligini ko‘rsatadi.\nO‘rta Osiyo va Xorazmda ham Uyg‘onish davrida yuz bergan madaniy yuksalishda, o‘lkada qadimda va ilk o‘rta asrlarda yaratilgan boy ilmiy-madaniy merosi katta ahamiyat kasb etadi.\nMa’lumki, IX-XIII asr boshlari Sharq xalqlari tarixida Sharq Uyg‘onish davri yoki “Islom Renesansi” nomi bilan mashhurdir. Bu davr ilgari xalifalik tarkibiga kirgan yaqin Sharq, O‘rta Osiyo, Xorazm, Xuroson, Eron, Shimoliy Hindiston va ularga qo‘shni bo‘lgan mamlakatlarda ijtimoiy-iqtisodiy, madaniy, ilm-ma’rfiy soxalarda yuksak taraqqiyotga erishilganligi bilan ajraladi. Avvalo, bu yuksalishning moddiy va ma’naviy asoslari o‘sha davrda feodal jamiyatining ishlab chiqarish kuchlarining taraqqiy etishi bilan bog‘liq bo‘lib, uning moddiy zamini xalifalik davridayoq yaratilgan. IX asrga kelib poytaxt Bag‘dodda tabiiy va gumanitar fanlar bilan shug‘ullangan Sharqning bir guruh mashhur olimlari, mutafakkirlari va tarjimonlari faoliyat ko‘rsatib, ular o‘zlarining bebaho asarlari bilan dunyo fani taraqqiyotiga ulkan hissa qo‘shdilar. Uyg‘onish davridagi iqtisodiy va madaniy ko‘tarilishga yana O‘rta Osiyo, Xuroson, Eronning arab xalifaligidan ajralib chiqib, shu hududlarda mustaqil davlatlarning vujudga kelishi, o‘zaro nizolarning vaqtincha to‘xtalishi hamda ma’rifatparvar xukmdorlarning mamlakat iqtisodi va madaniy taraqqiyotiga alohida e’tibor bilan qaraganliklari o‘z samarasini beradi. O‘sha davrda Sharqning bir qator shaharlari jumladan, Bag‘dod, Damashq, Nishopur, Ray, Jurjon, Marv, Buxoro, Samarqand, Kot, Gurganj, Xiva va boshqalar nafaqat savdo, hunarmandchilik, balki ilm-ma’rifat markazlari sifatida ham mashxur bo‘ldi. IX asrda Bag‘dodda faoliyat ko‘rsatgan «Bayt ul-hikma» Sharqning to‘ng‘ich akademiyalaridan sanalib, mazkur ilmiy dargoxda ijod qilgan olimlarning aksar ko‘pi, jumladan, Muhammad al-Xorazmiy, Ahmad al-Farg‘oniy, Ahmad al-Marvaziy, Abbos al-Javhariy va boshqalar Movarounnahr va Xorazm zaminidan yetishib chiqqan taniqli allomalar va mutafakkirlar edi. Ular tomonidan yaratilgan bebaho asarlar va ilmiy kashfiyotlar keyinchalik Xorazm Ma’mun akademiyasi olimlar jamoasining nazariy va amaliy ilmlar sohasida erishgan yutuqlari uchun ma’naviy asos bo‘lgan edi. Beruniy, Abu Nasr ibn Iroq, Ibn Sinolar o‘z tadqiqotlarida Bag‘doddagi “Bayt ul-hikma” olimlari, Hindiston hamda antik Yunon olimlari va mutafakkirlari asarlaridan keng foydalanganliklarini mamnuniyat bilan qayd etadilar. Xususan, Aristotel, Ptolemey, Yevklid, Gippokrat, Galen, Pifagor kabi qadimgi Yunon mutafakkirlarining nomlari hurmat bilan tilga olinadi.\nDarhaqiqat, eldoshimiz Muhammad al-Xorazmiy (783-850) “Bayt ul-hikma”ning yetakchi olimi, ilmiy rahbari, fanda yangi yo‘nalish va maktab yaratgan allomalaridan edi. U astronomiya, matematika, geografiya, tarix va boshqa fanlar sohasida o‘nlab asarlar meros qoldirgan. Uning “Al-jabr val-muqobala” kitobi jahon da birinchi bo‘lib algebra faniga asos bo‘lgan asarlardandir. Olim matematika fanida o‘nlik pozision hisoblash sistemasini yaratdi. Shu asosda u qo‘shish, ayirish, ko‘paytirish va bo‘lish amaliyotining qulay va oson yo‘lini kashf etib, Sharq va Yevropani ilg‘or hisoblash tizimiga o‘rgatdi. Fanda har qanday muntazam, izchil hisoblash jarayonini anglatadigan matematik tushuncha – algoritm tushunchasi ham al-Xorazmiy nomi bilan bevosita bog‘liq, chunki olimning lotinlashgan nomi Gʻarbda “Algorizm”, “Algoritmus” bo‘lib o‘zgarib ketgan."
    )
  )
  val nineFifteenthCenturiesPageContent = Map(
    "nine-home-menu" -> Array("Home", "Главное", "Bosh sahifa"),
    "nine-sub-menu" -> Array("About Khorezm", "О Хорезме", "Xorazm haqida"),
    "nine-header-title" -> Array("KHOREZM IN IX – XV CENTURIES", "ХОРЕЗМ В IX - XV ВЕКАХ", "XORAZM IX – XV ASRLARDA"),
    "nine-blog-title" -> Array("KHOREZM IN IX – XV CENTURIES", "ХОРЕЗМ В IX - XV ВЕКАХ", "XORAZM IX – XV ASRLARDA"),
    "nine-blog-info-1" -> Array(
      "The development of Khorezm during the governance of Mamunids.\n\n  At the beginning of the VIII century, the whole of Movarounnahr, including Khorezm, was conquered by the Arab commander Qutayba and joined the caliphate. After the Arab conquest, two khokimiyats were established in Khorezm. The southeastern part of Khorezm was ruled by Abu Abdullah Muhammad, a member of the ancient African dynasty. The capital was Kat (Shobboz, now Beruni district). In the north-western part of Khorezm, the Emir of the Caliphate, Mamun ibn Muhammad (994-997), ruled the country. By the end of the tenth century, the political situation in Central Asia had become somewhat tense. The struggle between the Qarakhanids, the Samanids and the Ghaznavids intensified. Taking advantage of this situation, the Emir of Gurganj, Mamun ibn Muhammad, tried to take over the whole of Khorezm. In 995, he and a large army suddenly attacked and captured the fort of Kot, the capital of the Africans. Khorezmshah Abu Abdullah was captured and executed in Gurganj.\n  After that, Ma'mun ibn Muhammad united all of Khorezm, took the title of Khorezmshah and moved the capital to Gurganj.",
      "Возвышение Хорезма в период Мамунидов \nВ начале VIII века весь Мовароуннахр, включая Хорезм, был завоеван арабским полководцем Кутайбой и вошел в состав халифата. После арабского завоевания в Хорезме было создано два хокимията. Юго-восточной частью Хорезма правил Абу Абдулла Мухаммад, представитель древней африканской династии.Столицей был Кот (Шоббоз, ныне Берунийский район). В северо-западной части Хорезма страной правил эмир халифата Мамун ибн Мухаммад (994-997). К концу X века политическая ситуация в Средней Азии несколько обострилась. Усилилась борьба между Караханидами, Саманидами и Газневидами. Воспользовавшись этой ситуацией, эмир Гурганджа Мамун ибн Мухаммад попытался захватить весь Хорезм. В 995 году с большим войском он внезапно напал и захватил форт Кот, столицу африканцев. Хорезмшах Абу Абдулла был схвачен и казнен в Гургандже.",
      "Ma’muniylar davrida Xorazmning yuksalishi\n\n\tVIII asr boshlarida butun Movarounnahr shu jumladan, Xorazm ham arab sarkardasi Qutayba tomonidan zabt etilib, xalifalik tarkibiga qo‘shilgan edi. Arablar istilosidan keyin Xorazmda ikki hokimiyatchilik vujudga keladi. Xorazmning Janubi-Sharqiy qismida qadimgi Ofrig‘iylar sulolasiga mansub Abu Abdulloh Muhammad hukmronlik qildi. Poytaxti Kot (Shobboz, hozirgi Beruniy tumanida) shahri edi. Xorazmning Shimoli - Gʻarbiy qismida xalifalik amiri Ma’mun ibn Muhammad (994-997) davlatni boshqardi. X asr oxirlariga kelib O‘rta Osiyoda siyosiy vaziyat bir muncha keskinlashib qoladi. Qoraxoniylar, Somoniylar va Gʻaznaviylar orasida o‘zaro kurash kuchaydi. Ushbu vaziyatdan foydalangan Gurganj amiri Ma’mun ibn Muhammad butun Xorazmni o‘z qo‘li ostiga olishga xarakat kildi. 995 yili u katta qo‘shin bilan Ofrig‘iylar poytaxti Kot qal’asiga qo‘qqisdan hujum qilib, uni zabt etadi. Xorazmshoh Abu Abdulloh asir olinib, Gurganjda qatl qilindi. \nShundan so‘ng Ma’mun ibn Muhammad butun Xorazmni o‘ziga birlashtirib, o‘ziga Xorazmshoh unvonini qabul qiladi va poytaxtni Gurganj shaxriga ko‘chiradi."
    ),
    "nine-blog-info-2" -> Array(
      "After the death of Khorezmshah Mamun ibn Muhammad in 997, the throne passed from his children, first to Ali ibn Ma'mun (997-1009) and then to Ma'mun ibn Ma'mun (1009-1017). They were both enlightened rulers who fought to elevate the country. They revived the ancient system of statehood and cultural and enlightenment traditions in Khorezm. Through their efforts, political and cultural life in the country, especially urban life, trade and handicrafts, developed rapidly. Written sources and archeological research also testify to this. In particular, the Arab historian Istakhri noted that in the early tenth century there were a total of 9 to 13 cities in Khorezm, and half a century later, the Arab historian gives detailed information about about 40 cities in the Holy Khorezm. In particular, Gurganj, Khiva, Hazarasp, Kot, Ardakhushmison (Vayangan), Kardarankhos (Qalajik), Zamakhshar (Izmukhshir), Dorgan, Jigarband, located at the crossroads of the ancient Silk Road, have become major trade, economic and cultural centers of the East. Gurganj, the state capital and international trade center, is gaining more and more fame and status. Construction and beautification works will be carried out in the city, many beautiful buildings, palaces, caravanserais, crowded markets, majestic minarets, mosques, madrasas, public buildings will be built.\n  Gurganj, the capital of the Holy Khorezmshahs, is described as the most prosperous and beautiful city in the East. “The city (Gurganj) is expanding and becoming more beautiful day by day. In front of the Gate of Hajj stands the majestic palace of the rulers. The palace was built by al-Ma'mun. The gate of the palace is so beautiful that I have never seen it in the whole of Khorasan. His son Ali built another magnificent new palace for himself near this palace. In front of the palace there is a large area like Bukhara. There is a sheep market there. ” The capital Gurganj became a major center of world trade at that time. Khorezm traders established trade and cultural relations with the Oguzs in the north-east of the Aral Sea, the Bulgars on the Volga, the Khazars in the North-West of the Caspian Sea, Kievan Rus, the North Caucasus, Crimea, Bukhara, Samarkand, Termez in Movarounnahr, China, India and Iran. Scientific news and rare books also reached Khorezm through traders and tourists. The Mamuns even managed to exert their political influence on the northern part of the Caspian Sea and the powerful Caspian state. Marvazi Khorezmshah, a Central Asian historian living in the late 11th century, reports that the trade and diplomatic representatives of Prince Vladimir of Kiev came to the palace of Mamun ibn Muhammad, where they even dealt with the conversion of Russians to Islam. SP Tolstov argues that this information of Marvazi must have been taken from Beruni's \"History of Khorezm\".\n  The manuscript \"Description of the city of Khorezm\" also contains valuable information confirming the development of Khorezm, especially Gurganj, during the Mamunid period. The manuscript was prepared by Muhammad Niyaz Shavati in the late 19th and early 20th centuries. According to the author, the capital Gurganj was a huge city surrounded by a wall. At that time, the city had 170 large and small markets, about 5,000 mosques, about 700 madrassas and about a thousand baths. Arab tourists who visited Khorezm at that time noted with pleasure that Khorezm and its capital Gurganj were very beautiful, heavenly places on the banks of the Jaihun, rich and enlightened people. In particular, al-Muqaddas (10th century) described the Khorezmians as people of intellect, knowledge, jurisprudence, ability and knowledge. Yakut Hamawi (12th century) writes, \"Nowhere in the world have I seen such a glorious, rich, and extremely beautiful city as Gurganj, the capital of Khorezm, with an educated population.\" Ibn Battuta wrote that \"I have never met people in the whole world who were so kind, noble, hospitable and wise to foreigners like the Khorezmians,\".\n   In the Mamunid dynasty, only 3 kings ruled the country: Ma'mun ibn Muhammad (995-997), Ali ibn Ma'mun (997-999), Ma'mun ibn Ma'mun (999-1017). In the late tenth and early eleventh centuries, despite the difficult political situation in Central Asia, the dynasty of Mamunis, which ruled for a short time, developed the Khorezm state socially, politically, economically and culturally.\n  Administratively, the state is divided into provinces, and the provinces are divided into cities and villages. During their time, a much improved system of public administration emerged in Khorezm. Khorezmshah was considered the supreme ruler and governor of the state. In Gurganj, a central office was established under the royal palace, which included courts dealing with agriculture, trade, finance, taxation, urban and rural peacekeeping, military affairs, and other matters of state importance. One of the highest positions in the palace was the ministry post, which had the title of lord (chief lord). He was in charge of the affairs of the office, and ruled the state on behalf of the king during the great journey.\n  During the Mamunid period, science and culture flourished in the Khorezm state and the Khorezm Mamun Academy was established. The great encyclopedic scholars who served in it, with their remarkable discoveries and works, raised the status of the Khorezm state to a high level for its time and subsequent periods. However, this cultural rise did not last long. In 1017 Khorezm was conquered by Mahmud Ghaznavi. This put an end to the dynasty of the Mamuns.\n\n                                 Anushtegin-Khorezmshahs state\n\n  Mahmud Ghaznavi appoints one of his commanders, Altintosh, as Khorezmshah. Three Khorezmshahs from the Altintosh dynasty also ruled.\n  A dispute arose between the Seljuk Turks and the Ghaznavids, which arose in Central Asia, and in 1040 there were fierce battles between them near the city of Dandanakan, and the Seljuk Turks prevailed. They seized the property of the Ghaznavids and made Khorezm dependent. The last representatives of the Altintosh dynasty held various positions in the hands of the Seljuks, but they were not given the title of Khorezmshah.\n  Khorezm was ruled from 1040 by governors appointed by the Seljuk sultans. One of the Turkish rulers was Anushtegin Gerchoi (1077-97), the founder of the Anushtegin dynasty. After Anushtegin's death in 1097, Dodbek Habashi, the viceroy of Khorasan, appointed his son Qutbiddin Muhammad (1097-1127) as the viceroy of Khorezm and gave him the title of Khorezmshah. In return for Qutbiddin Muhammad's just and faithful service, Sultan Sanjar (1118-57) appointed his son Atsiz (1127-56) to the throne of Khorezm. Initially loyal to Sultan Sanjar, Atsiz used the political situation in Movaraunnahr in the late 1130s to try to establish an independent Khorezm state and wage a relentless war with him. El Arslan (1156-72), who ascended the throne after the death of Atsiz, fought against the local rulers and blacks. His successors, Sultan Muhammad (1172) and Alouddin Takash (1172-1200), fought for power until 1193. While Takash bequeathed to his successor Muhammad Khorezmshah (1200-20) a strong state and an organizationally powerful army, in his own words, he bequeathed the scattered kingdom to his son Jaloliddin Manguberdi (1220-31). With the death of Jalaliddin Manguberdi in 1231, the title of Khorezmshah and the dynasties that ruled the kingdom came to an end. Amir Shohmalik's deputy in Khorezm, Amir Shohmalik (1413-26), held the title of Khorezmshah until the end of his life.\n  His son Nasriddin Sultan Ibrahim also inherited the title of Khorezmshah. He was called Khorezmshah when he was expelled from Khorezm by Abulkhairkhan. None of the subsequent rulers of Khorezm held this title.\n  The beginning of the XII-XIII centuries was an important stage in the development of Khorezm statehood. During this period, the rulers of Khorezm, the Atsiz, Takash and Sultan Muhammad Khorezmshahs, who came from the Anushtegin dynasty, created a more perfect system, order and methods of governing the country. The highest office of the kingdom was the ministry, which held the titles of Sadr, Khojaibuzuq, and Nizamulmulk (the pillar of property). The minister was accountable only to the supreme ruler. All the officials and military commanders of the kingdom were also obedient to the minister, accountable to him.\n  At the end of his reign, Sultan Muhammad Khorezmshah established another supreme court in the palace, the Council of State, named after the Council of Representatives. In addition to the supreme ruler, 6 more experienced and knowledgeable representatives will take part in the work of the council. The most pressing issues were discussed in the State Council, and decisions were made by a majority vote.\n  In the Khorezm state, hajib, amir ohur, amir shikar, mutasarrif, toshtdor, qissador and there were also high positions such as rosh, amir ul-alam.\n  In the Khorezm state, state power was centralized. The country was governed by a wide range of competent courts of local and central government. The local authorities of the state were under the strong control of the central government.\n  The political position of the state increased due to the emergence of a large political unit centralized in a large area. Crafts and trade flourished there, and cities flourished. Growth in various sectors of the economy has been a factor for overall economic and cultural development. The capital Gurganj has become a major political, economic and cultural center. Trade, especially international trade, has played an important role in urban development. Trade caravans of the Khorezm state traveled not only across its territory, but also beyond, to India in the south, Arabia and Europe in the west.\n  Science, enlightenment and culture have risen in a number of cities within the Khorezm state. Cultural ties between Movaraunnahr, Khorasan, Persia, Azerbaijan and Iraq were growing.",
      "После этого Мамун ибн Мухаммад объединил весь Хорезм, принял титул Хорезмшаха и перенес столицу в Гургандж. После смерти хорезмшаха Мамуна ибн Мухаммада в 997 году трон перешел от его детей сначала к Али ибн Мамуну (997–1009), а затем к Мамуну ибн Мамуну (1009–1017).Оба они были просвещенными правителями, которые боролись за возвышение страны. Они возродили в Хорезме древнюю систему государственности, культурно-просветительские традиции. Благодаря их усилиям политическая и культурная жизнь страны, особенно городская, торговля и ремесла, быстро развивались.Об этом свидетельствуют письменные источники и археологические исследования. В частности, арабский историк Истахри отмечал, что в начале X века в Хорезме было всего от 9 до 13 городов,В частности, Гургандж, Хива, Хазарасп, Кот, Ардахушмисон (Ваянган), Кардаранхос (Каладжик), Замахшар (Измухшир), Дорган, Джигарбанд, расположенные на перекрестке древнего Шелкового пути, стали крупными торговыми, экономическими и культурными центрами Восток. Гургандж, столица штата и центр международной торговли, приобретает все большую известность и статус. В городе будут проведены работы по строительству и благоустройству, будет построено множество красивых зданий, дворцов, караван-сараев, многолюдных рынков, величественных минаретов, мечетей, медресе, общественных зданий. Дворец был построен аль-Мамуном. Ворота дворца такой богато украшенной красоты, что я даже не встречал такого человека во всем Хорошоне. Его сын Али построил еще один великолепный новый дворец, который он назвал рядом с этим дворцом. С лицевой стороны дворца находится широкая площадь, похожая на бухарскую. В том месте есть овечий рынок\". Столица Гургандж в то время стала крупнейшим центром мирового сообщества. Хорезмские купцы установили торговые и культурные связи с огузами на северо-востоке острова, болгарами на Волге, хазарами на северо-западе Каспийского моря, Киевской Русью, Северным Кавказом, городами Крыма, Бухарой, Самаркандом, Термезом, Китаем, Индией и Ираном. Через торговцев и туристов Новости науки и редкие книги также достигли Хорезма. Властям удалось перенести свое политическое влияние на северную часть Каспийского моря и могущественное Прикаспийское государство. Среднеазиатский историк Марвази Хоразмшах Мамун, живший в конце XI века, сообщает, что во дворец ибн Мухаммеда прибыли торговые и дипломатические представители киевского князя Владимира, где также рассматривался вопрос о принятии религии ислам на хатту Русь. С. П. Толстов утверждает, что эти данные из Марвази должны были быть взяты из \"истории Хорезма\"Беруни.  В руках\" города Хорезма \" также находится ценная информация, подтверждающая, насколько Хорезм, особенно грузинский, был развит в течение административного периода. Пособие было подготовлено Мухаммедом Ниязом Шовати в национальном стиле в конце XIX и начале XX веков. Автор сообщал, что столица представляла собой огромный город, окруженный стенами вокруг города Гургандж. В то время 170 мест в городе занимали большие и малые рынки, около 5 тысяч мечетей, около 700 медресе и около тысячи бань.Арабские туристы, посетившие Хорезм в то время, с удовольствием отмечают, что Хорезм и его столица Гургандж были прекрасны бенихойя, поселение джаннатмакон, ахолиси бадавлат и просвещенные люди на стороне Джейхуна. В частности, Аль-Мукки (X век) описывает: \"хорезмийцы-это люди понимания, знаний, юриспруденции, способностей и знаний\". А якут Хамави (XII век) пишет, что \"Я никогда не видел славного, богатого и прекрасного, образованного города бенихая, где-нибудь в мире, как столица Хорезма, Гургандж\". Если бы Ибн Бутаута (XIII век) развил вышеуказанные идеи, \"весь мир не смог бы встретить мудрецов, которые пили науку фикха как воду, Благородных, гостеприимных, таких добрых ко мне по отношению к иностранцам, как Хали хорезмы\", что дает высокую оценку таланту хорезмов.\nТолько 3 короля правили государственной властью в династии Мамунидов: Мамун ибн Мухаммад (995-997), Али ибн Мамун (997-999), Мамун ибн Мамун (999-1017). Династия администраторов, правившая недолго, не оглядываясь на сложную политическую ситуацию в Центральной Азии в конце X – XI веков, развила Хорезмское государство в социальном, политическом, экономическом и культурном плане. С административной точки зрения это государство было разделено на провинции, а провинции-на города и деревни. В этот период в Хорезме была создана значительно усовершенствованная система государственного управления. Хоразмшах считался Верховным правителем государства, абсолютным правителем. В гургандже, при королевском дворце, был создан центральный офис – Девон, в который входили суды, занимающиеся сельским хозяйством, торговлей и коммерцией, финансами, налоговыми вопросами, поддержанием мира в городах и деревнях, военными делами и другими задачами государственной важности. Одним из высших постов во дворце была должность министра, которому было присвоено звание Мастера (главного Ходжи). Он откликнулся на труд Девона, во время великого путешествия он правил государством от имени царя. Хорезмская академия Мамуна была создана в Хорезмском государстве с развитием науки и культуры. Великие ученые-энциклопедисты, ученые, которые служили в нем, своими удивительными открытиями и трудами подняли статус Хорезмского государства на высокий уровень для его периода и последующих периодов. Однако этот культурный подъем длился недолго. Ануштегин-государство хорезмшахов\nМахмуд Хазнави назначает одного из своих командиров на должность Альтинт ХОРА Хорезмшаха. Три хоразмшаха также правили из династии алтынтошлар. Существует спор между турками-сельджуками и Казной, который возник в Центральной Азии, между ними идут ожесточенные бои близ города Данданакан в 1040 году, турки-сельджуки побеждают. Они захватывают имущество казны и ставят Хорезм в зависимость. Последние представители династии алтынтош служили в руках сельджуков на разных должностях, но им не был присвоен титул хорезмшаха. Хорезмом правили наместники, назначенные сельджукскими султанами с 1040 года. Одним из таких турецких правителей был ануштегин Герхой (1077-97), основатель династии ануштегинов.7 году Хорезм Махмуд был завоеван Казной. То же самое положило конец династии Администраторов. После смерти Ануштегина в 1097 году Хуросан нойби Додбек Хабаший назначил своего сына Кутбиддина Мухаммеда (1097-1127) хорезмским нойби и присвоил ему титул хорезмшаха. Эвазига султан Санджар (1118-57), справедливая и верная служба кутбиддина Мухаммеда, назначает своего сына Оциза (1127-56)на трон Хорезма. Первоначально конь, верой и правдой служивший султану Санджару, неустанно сражался вместе с ним, пытаясь создать независимое государство Хорезм, воспользовавшись политической ситуацией в Моварауннахре в его 1130-е годы. Эль Лев (1156-72), который был на троне после смерти коня, сражался против местных правителей и кузнецов. Его преемники Султаншах Мухаммад (1172) и Алоуддин Такаш (1172-1200) боролись между собой за власть до 1193 года. Такаш унаследовал от своего преемника Мухаммеда Хорезмшаха (1200-20) централизованное твердое государство и сильную организационную армию, по его собственным словам, его сын Джалалуддин мангуберди (1220-31)унаследовал Королевство розничной торговли. В 1231 году, со смертью джлолиддина Мангуберди, титул хорезмшаха и династии, правившие королевством, также прекратились. Ноиби султана Шахруха в Хорезме Амир Шахмалик (1413-26) до конца своей жизни сохранял титул хорезмшаха. Кроме того, его сын Насриддин Султан Иброксима также унаследовал титул хорезмшаха. Его звали Хорезмшах, когда он был изгнан из Хорезма Абулхайраном. Ни один из последующих правителей Хорезма не носил этого титула. Начало XII-XIII веков было этапом муима в развитии хорезмской государственности. В этот период правители из династии Ануштегинидов в Хорезме, Хорсиз, Такаш и султан Мухаммад Хорезмшахи создали более совершенную систему, порядок и методы управления страной. Высшим постом султаната является министерство, которое регулируется титулами, отчеством и Уставом (основа собственности). Министр был подотчетен только перед верховным правителем. Присяге также подчинились все должностные лица Королевства и военные начальники штабов, которые были подотчетны перед ним. После своего правления султан Мухаммад Хорезмшах учредит во дворце еще один Верховный суд, то есть государственный совет, управляемый именем Совета представителей. Помимо верховного правителя, в работе совета примут участие еще 6 опытных, образованных представителей. Наиболее актуальные вопросы обсуждались на Государственном совете, и решения принимались большинством голосов. В Хорезмском государстве были также такие высокие должности, как Хадж, Амир ахур, Амир шикур, мутасарриф, таштдор, рассказчик, фарраш, Амир уль-алам. В Хорезмском государстве государственное управление имело централизованную систему управления. Управление страной осуществлялось с помощью обширных компетентных судов местных и центральных властей. Местные органы власти штата находились под сильным контролем центрального правительства.  В связи с появлением централизованной крупной политической единицы на огромной территории политическое положение государства возросло. В нем развивались ремесла и торговля, росли города. Рост в различных секторах экономики был фактором общего экономического и культурного развития. Столица Грузии стала крупным политическим, экономическим и культурным центром. Для городского развития торговля, особенно международная торговля, занимает важное место. Торговые караваны Хорезмского государства путешествовали не только по его территории, но и за ее пределами, в Индию на юге, в Аравию и Европу на Западе. В нескольких городах на территории Хорезмского государства выросли наука и культура. Укрепились культурные связи между странами Моварауннахра, Хорасана, Персии, Азербайджана и Ирака.",
      "997 yili Xorazmshoh Ma’mun ibn Muhammad vafotidan so‘ng taxt uning farzandlaridan, dastlab, Ali ibn Ma’mun (997-1009) va so‘ngra Ma’mun ibn Ma’mun (1009-1017) qo‘liga o‘tadi. Ularning har ikkalasi ham mamlakatni yuksaltirish uchun kurashgan ma’rifatparvar hukmdorlardan edi. Ular Xorazmda qadimiy davlatchilik tizimi va madaniy-ma’rifiy an’analarni qaytadan tikladilar. Ularning sa’y-harakati bilan mamlakatda siyosiy va madaniy hayot xususan, shahar xayoti, savdo va xunarmandchilik ishlari tez taraqqiy qildi. Yozma manbalar va arxeologik tadqiqotlar ham shundan guvohlik beradi. Jumladan, arab tarixchisi Istaxriy X asr boshlarida Xorazmda jami 9 dan 13 gacha shaharlar borligini qayd etgan bo‘lsa, shundan yarim asr o‘tgach, arab tarixchisi Muqaddasiy Xorazmdagi 40 ga yaqin shaharlar haqida aniq ma’lumotlar beradi. Ayniqsa, shulardan qadimgi «Ipak yo‘li» chorraxasida joylashgan Gurganj, Xiva, Hazorasp, Kot, Ardaxushmison (Vayangan), Kardaranxos (Qalajiq), Zamaxshar (Izmuxshir), Dorg‘on, Jigarband kabi shaharlarini Sharqning yirik savdo-iqtisodiy va madaniyat markazlariga aylanganligi qayd etiladi. Davlat poytaxti va xalqaro savdo markazi bo‘lgan Gurganjning shon-shuhrati va mavqei kundan-kun oshib boradi. Shaharda qurilish va obodonchilik ishlari rivoj topadi, ko‘plab go‘zal imoratlar, saroylar, karvon saroy, gavjum bozorlar, mahobatli minora, masjid, madrasa, jamoat binolari bunyod etiladi. \nMuqaddasiy Xorazmshohlar poytaxti Gurganjni Sharqdagi eng obod va go‘zal shahar sifatida ta’rif etadi. «Shahar (Gurganj) kundan kun kengayib, go‘zallashib borayapti. Xajaj darvozasi oldida xukmdorlarning mahobatli saroyi qad ko‘tarib turibdi. Saroy al-Ma’mun tomonidan qurilgan. Saroy darvozasi shunday naqshinkor go‘zalki, bunaqasini men butun Xurosonda ham uchratmaganman. Uning o‘g‘li Ali mazkur saroy yaqinida o‘ziga atab yana bir muhtasham yangi saroy bunyod qildirdi. Saroyning old tomonida Buxoronikiga o‘xshab keng maydoni bor. O‘sha joyda qo‘y bozori mavjud». Poytaxt Gurganj o‘sha davrda jahon savdosining yirik markaziga aylandi. Xorazmlik savdogarlar Orolning Shimoli-Sharqidagi o‘g‘uzlar, Volga bo‘yidagi Bulgarlar, Kaspiyning Shimoli-Gʻarbidagi Xazarlar, Kiyev Rusi, Shimoliy Kavkaz, Qrim shaharlari, Movarounnahrning Buxoro, Samarqand, Termiz shaharlari, Xitoy, Hindiston va Eron bilan savdo va madaniy aloqalarni yo‘lga qo‘yganlar. Savdogarlar va sayyohlar orqali ilm-fan yangiliklari va nodir kitoblar ham Xorazmga yetib kelib turgan. Ma’muniylar xatto Kaspiy dengizining shimoliy qismi va qudratli Xazar davlatiga o‘zlarining siyosiy ta’sirini o‘tkazishga muvaffaq bo‘lganlar. XI asr oxirlarida yashagan o‘rta osiyolik tarixchi Marvaziy Xorazmshoh Ma’mun ibn Muhammad saroyiga Kiyev knyazi Vladimirning savdo va diplomatik vakillarining kelganligi, ular bu yerda xatto rusga islom dinini qabul qilish masalasi bilan ham shug‘ullanganligi haqida xabar beradi. S.P.Tolstov Marvaziyning ushbu ma’lumotlari Beruniyning «Xorazm tarixi» dan olgan bo‘lishi kerak, deb ta’kidlaydi. \n«Ta’rifi shahri Xorazm» qo‘lyozmasida ham Ma’muniylar davrda Xorazmning, ayniqsa, Gurganjning qanchalik taraqqiy qilganligini tasdiqlovchi qimmatli ma’lumotlar bor. Qo‘lyozma XIX asr oxiri va XX asr boshlarida Muhammad Niyoz Shovotiy tomonidan terma usulda tayyorlangan. Muallifning xabar berishicha, poytaxt Gurganj atrofi devor bilan o‘rab olingan ulkan shahar bo‘lgan. O‘sha paytda shaharda 170 o‘rinda katta va kichik bozorlar, 5 mingga yaqin masjid, 700 ga yaqin madrasa va bir mingga yaqin hammomlar ishlab turgan. O‘sha davrda Xorazmga tashrif buyurgan arab sayyohlari Xorazm va poytaxti Gurganjni Jayxun yoqasidagi benihoya go‘zal, jannatmakon maskan, axolisi badavlat va ma’rifatli kishilar bo‘lganligini mamnuniyat bilan alohida qayd etadilar. Jumladan, al-Muqaddasiy (X asr) «Xorazmliklar aql-idrok, ilm, fiqh, qobiliyat hamda bilim kishilaridir» deb, ta’riflaydi. Yokut Hamaviy (XII asr) esa «Men jahonning biror joyida Xorazmning poytaxti Gurganjga o‘xshagan ulug‘vor, boy va benixoya go‘zal, aholisi bilimdon shaharni ko‘rmaganman», deb yozadi. Ibn Battuta (XIII asr) bo‘lsa yuqoridagi fikrlarni rivojlantirib, «Butun jahon da menga xali xorazmliklar kabi ajnabiylarga nisbatan shunchalik xushfe’l, olijanob, mehmondo‘st, fiqh ilmini suv qilib ichib yuborgan dono kishilarni uchratish nasib etmagandi», deb xorazmliklar iste’dodiga yuqori baho beradi. \nMa’muniylar sulolasida faqatgina 3 ta shoh davlat hokimiyatini boshqargan: Ma’mun ibn Muhammad (995-997), Ali ibn Ma’mun (997-999), Ma’mun ibn Ma’mun (999-1017). X asr oxiri – XI asr boshlarida O‘rta Osiyodagi og‘ir siyosiy vaziyatga qaramasda qisqa vaqt hukmronlik qilgan ma’muniylar sulolasi Xorazm davlatini ijtimoiy, siyosiy, iqtisodiy va madaniy jihatdan rivojlantirdi.\nMa’muriy jihatdan bu davlat viloyatlarga, viloyatlar esa, shahar va qishloqlarga ajralib boshqarilgan. Ular davrida Xorazmda davlat boshqaruvining ancha takomillashgan tizimi vujudga keldi. Xorazmshoh davlatning oliy hukmdori, hokimi mutloq hisoblagan. Gurganjda shoh saroyi qoshida markaziy boshqarma – devonxona tashkil etilib, uning tarkibida ziroat, savdo-tijorat, moliya, soliq ishlari, shahar va qishloqlarda osoyishtalikni saqlash, harbiy ishlar va boshqa davlat ahamiyatiga ega vazifalar bilan shug‘ullanadigan mahkamalar bo‘lgan. Saroyning eng yuqori lavozimlaridan biri vazirlik lavozimi bo‘lib, u xo‘jayinbuzruk (bosh xo‘ja) unvoniga ega bo‘lgan. U devonxona ishlariga javob bergan, katta safar paytida podsho nomidan davlatni idora qilgan. \nMa’muniylar davrida Xorazm davlatida ilm-fan, madaniyat ravnaq topib, Xorazm Ma’mun akademiyasi tashkil qilindi. Unda xizmat qilgan buyuk qomusiy olimlar, allomalar o‘zlarining ajoyib kashfiyotlari va asarlari bilan Xorazm davlatining mavqeini o‘z davri va keyingi davrlar uchun yuksak darajaga ko‘tardilar. Biroq bu madaniy yuksalish uzoq davom etmadi. 1017 yilda Xorazm Mahmud Gʻaznaviy tomonidan zabt etildi. Shu bilan ma’muniylar sulolasiga chek qo‘yildi. \n\nAnushtyegin-Xorazmshohlar davlati\n\nMahmud Gʻaznaviy o‘z sarkardalaridan biri Oltintoshni xorazmshoh lavozimiga tayinlaydi. Oltintoshlar sulolasidan ham 3 ta xorazmshoh hukmronlik qilgan.\nMarkaziy Osiyoda paydo bo‘lgan Saljuq turklar bilan g‘aznaviylar o‘rtasida nizo chiqib, 1040 yilda Dandanakan shahri yaqinida ular o‘rtasida qattiq janglar bo‘lib, Saljuq turklari g‘olib chiqadilar. Ular g‘aznaviylar mulkini qo‘lga kiritib, Xorazmni qaram qiladilar. Oltintoshlar sulolasining so‘nggi vakillari saljuqiylar qo‘lida turli lavozimlarda xizmat qilganlar, lekin ularga xorazmshoh unvoni berilmagan.\nXorazmni 1040 yildan Saljuq sultonlari tomonidan tayinlangan hokimlar boshqargan. Ana shundan turk hokimlaridan biri anushteginiylar sulolasi asochisi Anushtegin Gerchoi (1077-97) edi. 1097 yilda Anushtegin vafotidan keyin Xuroson noibi Dodbek Habashiy uning o‘g‘li Qutbiddin Muhammad (1097-1127) ni Xorazm noibi qilib tayinlab, unga xorazmshoh unvonini beradi. Qutbiddin Muhammadning adolatli va sadoqatli xizmati evaziga Sulton Sanjar (1118-57) uning o‘g‘li Otsiz (1127-56)ni Xorazm taxtiga tayinlaydi. Dastlab, Sulton Sanjarga sadoqat bilan xizmat qilgan Otsiz 1130-yillar ohirlarida Movaraunnaxrdagi siyosiy vaziyatdan foydalanib, mustaqil Xorazm davlatini tuzishga harakat qilib, uning bilan tinimsiz urush olib boradi. Otsiz vafotidan keyin taxtga o‘tirgan El arslon (1156-72) mahalliy hokimlar va qorahitoylarga qarshi kurash olib bordi. Uning vorislari Sultonshoh Muhammad (1172) va Alouddin Takash (1172-1200) hokimiyat uchun 1193 yilga qadar o‘zaro kurash olib bordilar. Takash o‘z vorisi Muhammad Xorazmshohga (1200-20) markazlashgan mustahkam davlat va tashkiliy jihatdan qudratli qo‘shinni meros qoldirgan bo‘lsa, uning o‘z so‘zlari bilan aytganda, o‘g‘li Jaloliddin Manguberdi (1220-31)ga parokanda saltanatni meros qilib qoldirdi. 1231 yilda jloliddin Manguberdi vafoti bilan xorazmshoh unvoni hamda saltanatni boshqargan sulolalar ham yakun topadi. Sulton Shohruxning Xorazmdagi noibi amir Shohmalik (1413-26) umrining oxirigacha Xorazmshoh unvonini o‘zida saqlagan. \nShuningdek, uning o‘g‘li Nasriddin Sulton Ibroximga ham meros tariqasida xorazmshoh unvoni o‘tgan. U Abulxayrxon tomonidan Xorazmdan quvilganida xorazmshoh deb atalgan. Bundan keyingi Xorazm hukmdorlaridan hech biri bu unvonga ega bo‘lmagan.\nXII-XIII-asr boshlari Xorazm davlatchiligining rivojlanishida muim bosqich bo‘ldi. Bu davrda Xorazmda anushteginiylar sulolasidan chiqqan hukmdorlar Otsiz, Takash va Sulton Muhammad Xorazmshohlar mamlakatni boshqarishning yanada mukammal tizimi, tartiboti va uslublarini yaratganlar. Saltanatning eng oliy lavozimi vazirlik bo‘lib, ular Sadr, Xo‘jayibuzuq va Nizomulmulk (mulkning tayanchi) unvonlari bilan yuritilgan. Vazir faqat oliy hukmdor oldida hisobdor bo‘lgan. Saltanatning barcha amaldorlari va harbiy boshliqlar ham vazirga itoat qilganlar, uning oldida hisobdor bo‘lganlar.\nSulton Muhammad Xorazmshoh o‘z podsholigining so‘nggida saroyda yana bir oliy mahkama, ya’ni vakillar Kengashi nomi bilan yuritilgan davlat Kengashi ta’sis etadi. Kengash ishida oliy hukmdordan boshqa yana tajribali, bilimli 6 ta vakil ishtirok etadi. Davlat kengashida eng dolzarb masalalar muhokama etilib, qarorlar ko‘pchilik ovoz bilan qabul qilingan.\nXorazm davlatida hojib, amir ohur, amir shikor, mutasarrif, toshtdor, qissador, farrosh, amir ul-alam kabi yuqori lavozimlar ham bo‘lgan.\nXorazm davlatida davlat hokimiyati markazlashgan boshqaruv tizimiga ega bo‘lgan. Mahalliy va markaziy hokimiyatning keng vakolatli mahkamalari yordamida mamlakat idora qilingan. Davlatning mahalliy hokimiyat organlari markaziy hokimiyatning kchli naroat ostida bo‘lgan.\nKatta hududda markazlashgan yirik siyosiy birlikning vujudga kelishi tufayli davlatning siyosiy mavqei ortdi. Unda hunarmandchilik va savdo-sotiq rivojlandi, shaharlar yuksaldi. Xo‘jalikning turli sohalaridagi o‘sish umumiy iqtisodiy va madaniy taraqqiyot uchun omil bo‘ldi. Poytaxt Gurganj yirik siyosiy, iqtisodiy va madaniy markazga aylandi. Shaharlart rivoji uchun savdo, ayniqsa, xalqaro savdo muhim o‘rin tutgan. Xorazm davlatining savdo karvonlari nafaqat o‘z hududi bo‘ylabgina emas, balki undan tashqariga, janubda Hindistonga, g‘arbda Arabiston va Yevropaga qatnagan.\nXorazm davlati tarkibiga kiritilgan huddlardagi bir qancha shaharlarda ilm-ma’rifat, madaniyat yuksaldi. Movaraunnaxr, Xuroson, Fors, ozarbayjon va Iroq o‘lkalari o‘rtasida madaniy aloqalar kuchaydi."
    )
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
  //  About Khorezm
  if (isAntiquePage != null) {
    antiquePageContent.keys.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = antiquePageContent(item)(2)
    )
  }
  if (isAncientPage != null) {
    ancientPageContent.keys.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = ancientPageContent(item)(2)
    )
  }
  if (isMiddleAgesPage != null) {
    middleAgesPageContent.keys.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = middleAgesPageContent(item)(2)
    )
  }
  if (isNineFifteenthCenturiesPage != null) {
    nineFifteenthCenturiesPageContent.keys.foreach(
      item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = nineFifteenthCenturiesPageContent(item)(2)
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
    //    About Khorezm
    if (isAntiquePage != null) {
      antiquePageContent.keys.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = antiquePageContent(item)(lang)
      )
    }
    if (isAncientPage != null) {
      ancientPageContent.keys.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = ancientPageContent(item)(lang)
      )
    }
    if (isMiddleAgesPage != null) {
      middleAgesPageContent.keys.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = middleAgesPageContent(item)(lang)
      )
    }
    if (isNineFifteenthCenturiesPage != null) {
      nineFifteenthCenturiesPageContent.keys.foreach(
        item => dom.document.getElementById(item).asInstanceOf[HTMLLinkElement].innerText = nineFifteenthCenturiesPageContent(item)(lang)
      )
    }
    navbarAndFooter.keys.foreach(
      menu => dom.document.getElementById(menu).asInstanceOf[HTMLLinkElement].innerText = navbarAndFooter(menu)(lang)
    )
  }
}
