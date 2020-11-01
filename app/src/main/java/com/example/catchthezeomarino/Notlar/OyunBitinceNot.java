/*
Şimdi geldik artık zaman bittikten sonra ne olcağını yani Yani  nereye "public void onFinish(){" altına bitince ne olucak.
Ne olucak mesela hatırlarsanız kullancıya bir soru soruyorduk tekrar oynamak istermisin diye adam isterse Restart atıyorduk istemezse yapcak birşey yok zaten şuan için öyle durabiliriz bunun için ne yapalım.
Öncelikle Time: kısmına zaman bitti yazdırabiliriz Time:0 yazıyor şuanda farketmez yazdırmayabiliriz nasıl isterseniz artık.Örneğin Time Off! diye birşey diyebiliriz.
  1) onFinish altına "timText.setText("Time Off!");
sonrasında bu handler çalışmaya devam ediyor bir onu durdurabiliriz
  2)handler.removeCallbacks(runnable);   (içinde neyi durdurim diyor) bunu diyerek durdurabiliriz ve hatta ve hatta onu durdurduktan sonra.
tekrar bir foor loop çalıştırıp zeoyu komple saklıyabiliriz yani for işleminide gelip onFinish altındada yapabiliriz
" for (ImageView image: imageArray){
                    image.setVisibility(View.INVISIBLE);
                } " yapıştırırsak emuyu çalıştırırsak bakalım zamanımız bitince ne olucak zaman bittiğinde zeo gider Time Off! yazdırır böylece geriye kalıyor burda kullancıya bir alert göstermek.
   neydi uyarı mesajı gösterme oyun bitti baştan oynamak istermisin demeye
    3) AlertDialog.Builder alert = new AlertDialog.Builder(this); diyorum () içerisinde bize birtane context soruyor burda this diyiceğim ve this diyince kabul etmiyicek çünkü.
Böyle bir kod bloğunun içinde bulunuyorsak burda mesela CountDownTimer'a refarans oluyor zaten üstüne geldiğimizde mouse ile anlıyabiliriz nerde this kullanıcam nerde application kullanacağım.
this kullandık mainActivty'e işaret edebilirmi diye kontrol ettim etmedi sağlık olsun. Ben senden context bekliyordum sen bana gittin CountDownTimeri verdin diye ands uyarıyor bunu nasıl aşabilirim.
    3) AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this); diyebilirim mesela böylece mainaktiviteye gerçekten ulaşmak istediğimi söylüyebilirim.Ondan sonra Alertimize bir başlık verelim.
    4) alert.setTitle("Restart?"); gibi birşey. Birtanede mesaj verelim.
    5) alert.setMessage("Are you sure to restart game?"); Gerçekten baştan başlatalımmı şeklinde sonra bir adet button koyalım.
    6) alert.setPositiveButton("Yes",) Birtane pozitif button koyalım birtanede negatif buttonu. Bizden birtane text istiyordu bu birtanede listener listener yazmak için.
New list yazarsak DialogInterface.onClickListener seçeneği cıkıyor bunu arıyoruz zaten çift tıklarsak bizim icin yine method oluşturcaktır.
şeklinde oluşturuyor.
"alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });"  Noktalı virgülü koyalım sonuna
Bu methodun amacı şuydu yes'e tıklanırsa ne olucağını bekliyor bizden yes'e tıklarsa burda restart atıcağız.
    7)Birtanede negative button yapalım }); "alert.setNegativeButton("No",new Dialog Interface.onClick diyince yine aynı yağıcağız şu şekilde oluyor buda.
    "alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });"
Noya basarsa aslında çokta yapıcak birşey yok ama
    8) } den öncesine which'in altına { parantezin altına toast yapabiliriz "Toast.makeText(MainActivty.this, "Game Over!", Toast.LENGTH_SHORT).show(); "
şeklinde yazabiliriz en sonundada
    9) alert.show(); diyiceğiz  }); altına .
Peki restartı nasıl atıcağız pozitif buttonun altındaki onClick methodu içerisinde yazıcağız öncelikle Restart atmak için şöyle bir yöntem kullanıcağım aslında intentleri öğrenmiştik.
2 Aktivite yaparsak 1 tane aktivitemiz var 1 aktivite daha yapıyorduk intentleri bu aktivite arasında geçiş yapmak için kullanıyorduk fakat fakat onCreateyi baştan oluşturmak için şöyle bir yöntemde kullanılabilir.
bunu muhtemelen kullanmayız çok fazla
    10) Intent intent = getIntent(); diyoruz fakar hani nasıl bunu başka bir yerden yollarken getIntent felan diyip ekstra felan yolladılarsa onu alıyorduk ama zaten bize yollanan intent felan yoksa.
    11) startActivity(intent); dersek bu sefer kendi aktivitemizi baştan başlatırız.Fakat bütün bu bu kod içerisinde döngü içerisinde bu uygulamayı çok yormamak için güncel aktivitemizi tamamen bitirmemiz.
Destroy etmemiz gerekiyor onun içinde.
    12) startActivity üstünde "finish();" yazıp çalıştırıyoruz burda ne yapıcak güncel aktiviteyi bitirecek aynı aktiviteyi baştan başlatıcak
Bu çok kullanılan bir method değil muhtemelen sonra cok cıkmaz karşımıza olurda bu şekilde aynı aktiviteye bir restart atmamız gerekebilir bunu ozaman kullanabiliriz
Şu aşamada emuyu çalıştırsak bittiğinde baştan başlatalımmı diyor yes dersek aktiviteyi baştan başlatır bunu yapmanın tek yolu bu değil tabiki bir sürü yolu var  herşeyi baştan setupu baştan çalıştırabiliriz.
No dersek eğer  Game Over! yazdı ve bitti Bu oyunun tek bir yapılma yolu yok bir çok yöntem yapılabilir daha verimli kodlar vs yazabiliriz ben şimdilik böyle yaptım.

 */