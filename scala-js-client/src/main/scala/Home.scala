import org.scalajs.dom
import org.scalajs.dom.raw.HTMLLinkElement

class Home {
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
 val elements = Map(
  //    Index page
  "smallIntro" -> Array("Small Intro", "Небольшое вступление", "Kichik kirish"),
  "smallIntroText" -> Array(
   "The Khorezm region, one of the first centers of world civilization, is distinguished by its unique cultural traditions, which have their ancient roots. The Khorezm oasis, located in the confluence of the Amu Darya and the Aral Sea, one of the lifebloods of Central Asia, has been the cradle of life for our ancestors since ancient times.",
   "Хорезмская область, один из первых центров мировой цивилизации, отличается уникальными культурными традициями, имеющими свои древние корни. Хорезмский оазис, расположенный в месте слияния Амударьи и Аральского моря, одного из источников жизненной силы Центральной Азии, издревле был колыбелью жизни наших предков.",
   "Jahon sivilizatsiyasining birinchi markazlaridan biri bo'lgan Xorazm viloyati o'zining qadimiy ildizlariga ega bo'lgan o'ziga xos madaniy an'analari bilan ajralib turadi. Markaziy Osiyoning qon tomirlaridan biri Amudaryo va Orol dengizining qo'shilish joyida joylashgan Xorazm vohasi qadim zamonlardan buyon ajdodlarimiz uchun hayot beshigi bo'lgan."
  ),
  "moreExplore" -> Array("More Explore", "Больше Исследовать", "Ko'proq o'rganish"),
  "currentExAndDisplay" -> Array("CURRENT EXHIBITIONS & DISPLAY", "ТЕКУЩИЕ ВЫСТАВКИ И ДИСПЛЕЙ", "Joriy ko'rgazmalar va displey"),
  "whatIsOnAtTheHistorical" -> Array("What’s On At The Historical", "Что происходит в историческом", "Tarixda nima bor"),
  "aboutExhibition" -> Array("Double gate. Khiva. Deshan Castle. Early XX century", "Двойные ворота. Хива. Замок Дешан. Начало XX века", "Qo\'sha darvoza. Xiva. Deshan qal'a. XX asr boshi"),
  "dateOfExhibition" -> Array("From 6 Sept 2018 until 7 Jan 2021", "С 6 сентября 2018 г. по 7 января 2021 г.", "2018 yil 6 sentyabrdan 2021 yil 7 yanvargacha"),
  "display" -> Array("Display", "ДИСПЛЕЙ", "Displey"),
  "displayText" -> Array("General view of Muhammad Aminkhan Madrasah. Khiva. Middle of XIX century", "Общий вид медресе Мухаммеда Аминхана. Хива. Середина XIX века", "Muhammad Aminxon madrasasining umumiy ko'rinishi. Xiva. XIX asr o'rtalari"),
  "dateOfDisplay" -> Array("From 16 NOV, 2018 Until 7 Jan 2021", "С 16 ноября 2018 г. по 7 января 2021 г.", "2018 yil 16 -noyabrdan 2021 yil 7 -yanvargacha"),
  "aboutExhibition2" -> Array("Roof of Muhammad Aminkhan Madrasa. Tiled, decorated.", "Крыша медресе Мухаммеда Аминхана. Плиточный, декорированный.", "Muhammad Aminxon madrasining peshtoq qismi. Koshin bilan qoplangan, bezak berilgan."),
  "dateOfExhibition2" -> Array("From 6 Sept 2018 until 7 Jan 2021", "С 6 сентября 2018 г. по 7 января 2021 г.", "2018 yil 6 sentyabrdan 2021 yil 7 yanvargacha"),
  "aboutExhibition3" -> Array("The mask. The castle of the castle. III-II centuries", "Маска. Замок замка. III-II вв.", "Niqob. Qo'yqirilgan qal'a. III-II asrlar"),
  "dateOfExhibition3" -> Array("From 6 Sept 2018 until 7 Jan 2021", "С 6 сентября 2018 г. по 7 января 2021 г.", "2018 yil 6 sentyabrdan 2021 yil 7 yanvargacha"),
  "gallery" -> Array("Gallery", "Галерея", "Galereya"),
  "aboutGallery" -> Array("Islam Khoja Madrasa and Minaret. Khiva. Ichan Castle. 1910.", "Исламское медресе Ходжа и минарет. Хива. Замок Ичан. 1910 г.", "Islom xo'ja madrasasi va minorasi. Xiva. Ichan qal'a. 1910-yil"),
  "dateOfGallery" -> Array("From 16 NOV, 2018 Until 7 Jan 2021", "С 16 ноября 2018 г. по 7 января 2021 г.", "2018 yil 16 -noyabrdan 2021 yil 7 -yanvargacha"),
  "display2" -> Array("Display", "ДИСПЛЕЙ", "Displey"),
  "displayText2" -> Array("Sayyid Niyaz Sholikorboy Mosque and Minaret. Khiva. Deshan Castle. The end of the XIX century", "Мечеть и минарет Сайида Нияза Шоликорбоя. Хива. Замок Дешан. Конец XIX века.", "Sayyid Niyoz sholikorboy masjidi va minorasi. Xiva. Deshan qal'a. XIX asr oxiri"),
  "dateOfDisplay2" -> Array("From 6 Sept 2018 until 7 Jan 2021", "С 6 сентября 2018 г. по 7 января 2021 г.", "2018 yil 6 sentyabrdan 2021 yil 7 yanvargacha"),
  "dontMiss" -> Array("DON’T MISS", "НЕ ПРОПУСТИТЕ", "O\'TKAZIB YUBORMANG"),
  "upcomingEvents" -> Array("Upcoming Events", "Предстоящие События", "Tarixiy tadbirlar"),
  "ourCollection" -> Array("From Our Collection", "Из нашей коллекции", "Bizning to'plamdan"),
  "viewMore" -> Array("View More", "Посмотреть больше", "Ko\'proq ko\'rish"),
  "castle" -> Array("Castle of Nurullaboy", "Замок Нуруллабой", "Nurullaboy qal\'asi"),
  "numericalCounter" -> Array("Everything about our organization in numerical counter view.", "Все о нашей организации в виде цифрового счетчика.", "Bizning tashkilot haqida hamma narsa raqamli hisoblagich ko\'rinishida."),
  "wePerfection" -> Array("We Strive for Perfection Every day", "Мы стремимся к совершенству каждый день.", "Biz har kuni mukammallikka intilamiz."),
  "overOrganized" -> Array("Number of cultural heritage monuments", "Количество памятников культурного наследия", "Madaniy meros yodgorliklari soni"),
  "uniqueObjects" -> Array("Unique Objects Around the World", "Уникальные объекты вокруг мир", "Dunyodagi noyob obyektlar"),
  "multimediaExhibitions" -> Array("Multi media Exhibitions with a Guide", "Мультимедийные выставки с гидом", "Qo'llanmali multimedia ko\'rgazmalari"),
  "ourTicketsSold" -> Array("Tickets Sold by our Organization", "Билеты продаются нашими Организация", "Bizning tashkilot tomonidan sotilgan chiptalar"),
  "newsLetter" -> Array("News Letter Now", "Новостное письмо сейчас", "Hoziroq bog\'lanish"),
  "newsLetterInfo" -> Array("Receive e-mail updates on our exhibitions, events, and more........", "Получайте по электронной почте новости о наших выставках, мероприятиях и многом другом ........", "Bizning ko\'rgazmalarimiz, tadbirlarimiz va boshqalar haqida elektron pochta xabarlarini oling ........"),
  "subscribe" -> Array("Subscribe", "Подписывайся", "Obuna bo\'lish")
 )

 def create(lang: Int): Unit = {
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
}
