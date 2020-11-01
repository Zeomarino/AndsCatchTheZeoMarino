/*
Şimdi ilk yapıcağımız iş şuydu zeo bizden kaçıcak ve biz zeonun üstüne tıkladıkça skorumuz artıcaktı.
Dolasıyla burdan bir başlamam gerektiğini düşündüm.Bunu yapmak basit nasıl yapıldığınıda siz muhtemelen tahmin etmişsinizdir bu imageViewlere birer onClick methodu atayıp ve bu methodun içerisine skoru bir arttır yazıcağız.
Şimdi isterseniz "Attributes" ile verebilirsiniz ama benim size tavsiyem onClickleri xml texti içerisinden vermemiz olucaktır daha kolay olur İlk imageVieimizin altına onClick yazdığımızda Ands Bizim için otomatik bir şekilde geri kalanları zaten eklicektir.
Şu şekilde yaptım android:onClick="incareseScore" yani skoru arttır oldu.Tahmin ettiğiniz üzere bunu tüm imageView'lerin içine yazıyorumki hangi imageye tıklanırsa tıklansın aynı increaseScore methodu çağrılıcak
Daha sonra bu methodumu yazdıracağım mainActivty.java içerisinde.
"public void increaseScore (View view) {" methodumuzu yazdırıyorum hatırlarsanız bir buttona yada bu tarz imageye vs onClick methodu atarken bu methodun sadece normal bir method olduğunu değil bir view tarafından yani ya button ya image ya text herhangi bir view tarafından görünüm tarafından cağrılcağını bildirmek için "View view" yazıyorduk.
Peki şimdi soralım kendimize bir ne olsun istiyoruz skorumuz her bu resme tıklandığında 1 1 artsın istiyoruz.
Öncelikle dizaynımızdaki buttonları time ve scoreyi tanımlıyalımki çünkü bunu değiştirmek için bunun tanımlı olması gerekmektedir.
Bunun için score bölümündeki textimin idSini basit olması adına tamamen "scoreText" timeTextide "timeText" diye değiştirdim anlayışlı ve güzel olması için tamamiyle.
Şimdi gelelim bunu gelelim mainActivty.javada tanımlamaya önceden normalde yada ne yapıyorduk hatırlarsanız onCreate içinde tanımlayıp geçiyorduk.
"TextView timeText = (TextView.) find ViewById(R.id.timeText);" şeklinde tanımlıyorduk bu şekilde tanımaylıp.
timeText.setText("22323232"):şeklinde birşeyler yazabilirim böylece açtığımda timeText'im çalışır olur.
Peki ben neden bu konuya değindim şuan bunu onCreate altında tanımlamak istemiyorum bunları inCreaseScore artında yapmak istiyorum
Şuan emuyu çalıştırırsak timTextin 22323232 şeklinde değişti aynı şeyi score içinde yapabiliriz tabiki  hatta onuda yazayim.
"TextView scoreText = (TextView) findViewById(R.id.scoreText);" şimdi ben bunu burda tanımlamadım peki.

public void increaseScore (View view) { altında yine tanımlamak için
"TextView scoreText = (TextView) findViewById(R.id.scoreText); şeklinde yazarsam.
Altınada scoretext.setText(); dersem tabiki burdada erişebilirim  peki scoreTexte başka bir yerde erişebilirmek için burda birsürü method yazıcağız belliki geniş kapsamlı bir uygulama yapıyoruz keza onCreate altında tekrar ulaşmak istersem her seferinde gelip.
"TextView scoreText = (TextView) findViewById(R.id.scoreText);" bunu bir orda bir burda 50 kere farklı yerde tanımlamak code açısından verimli değil.
çünkü herseferinde başka bir kodu baştan tanımlıyoruz bunun yerine bunların hepsini siliyorum
scoreTexti sadece onCreate altında birkere başlatıcağım ama tanımlamasını AppCompatActivty { onCreate dışında yapıcağım
Peki ne demek istiyorum güzelce açıklıyayım.
            // Kod zamanı .
  1) TextView scoreText; dedim onCreate dışına AppCompat Altına.
  2) TextView timeText; dedim
bunu yaptıktan sonra.
  3) onCreate içerisine ""scoreText = (TextView) findViewById(R.id.scoreText);"
  4) "timeText = (TextView) findViewById(R.id.timeText);
Farkettiyseni sadece ""TextView scoreText = (TextView) findViewById(R.id.scoreText);" baştaki "TextView" kısmını sildim çünkü eğer silmessem baştan bir obje oluşturuyormus gibi davranır ands.
Burda yukarda tanımladığımız objeyi "TextView scoreText;" 'den bahsediyorum burda  "scoreText = (TextView) findViewById(R.id.scoreText);" de başlatıyorum. Bunu burda initalize ediyorum.
böylece biz bunu onCreate altında initalize edip yani başlatırsam herhangi bir methodda örneğin : İncreaseScore methodu altında
  5)scoreText.setText("Score:"); şeklinde tanımlayabilirim
farklı yerlerde method dışı vb her yerde cağırabilirim böylece her seferinde aynı işlemi tekrar tekrar yapmamıza gerek yok herseferinde aynı işlemi yapmamıza gerek yok sonuç olarak bir kere onCreate altında yapmamız yeterli olucaktır.
  6)timeText.setText("Time:"); şeklinde tanımladım.
      "public void increaseScore (View view) {
        scoreText.setText("Score:");
        timeText.setText("Time:");

    }"
Şeklinde bir hal alıyor kodumuz yani şuan  emuyu çalıştırır ve resimlere tıklarsak scoreText vs yukardaki setText'e göre değişir gerçi benimkiler aynı dönüsüyor ama zaten zamanla bunu sayıya çevireceğiz.
Tabi birde biz score diye bir değişken oluşturmamız lazımki onuda tutabilelim. Yine birebir aynı mantıkla şöyle yapıcağım bunu.
  7) AppCompatActivty altına gelip. "int score;" diye bir oluşturucağım bunu gelip.
  8) onCreate altına "score = 0;"  0 Olarak başlaması için scorumuzun
  9) İncreaseScore altındada  "score++;" her tıklandığında skoru bir arttır "score = score + 1 ;" yazmakla bu birebir aynı şey.
  10) bundan sonra aşağıda kalan scoreText.setText("Score:"); gelip +score ekledim şu şekilde yani "scoreText.setText("Score:"+score);" diyiceğim. Böylece her tıklandıgında sayı 1 artırcak.
Kodumuz şu şekilde bir hal alıcak en son.
 "public void increaseScore (View view) {
        score++;
        scoreText.setText("Score:"+score); "
}
Bundan sonraki notuma "GeriyeSaymakNot" şeklinde devam ediceğim.
 */


