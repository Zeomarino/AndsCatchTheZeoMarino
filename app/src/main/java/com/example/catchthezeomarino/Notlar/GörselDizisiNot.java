/*
Şu aşamada yavaş yavaş imagemize hareket verme olayına girelim hatırlarsanız bu bölümde değinmiştim. İmageView'e hareket verme olayını ben bir loop ile yaptım. Diye belirtmiştim yani bir foor loop'a for döngüsüne aldım bunu onun olması içinde tahmin edersinizki bir dizi olması gerekiyor.
Dizi olması içinde imageViewlerimizi tek tek tanımlayıp bir dizi içerisine bir dizi oluşturup tabiki kaydetmemiz gerekiyor daha önce nasıl timeText'i scoreText'i kaydettik.
Gelip tek tek imageViewlerimizi appCompatActivityin onCreate dışında.

    1) ImageView imageView1; "şeklinde toplam 16 Adet ekliyeceğim" herseferinde sadece sondaki sayıyı değiştiriceğim.
Bunun daha kolay daha verimli yöntemleri olabilirmi olabilir
    2) timeText & scoreText altındada işleyeceğim şu şekilde "imageView1 = findViewById(R.id.imageView1);" şeklinde her seferi sayıları değişicek tarzda ekliyorum.Elimle değiştiriyorum sayıları.
    3) ImageView Dizisi oluşturalım ImageView[] imageArray; Diyiceğim AppCompatAltına "[]" dizi işaretedir.
    4) onCreate Altına " imageArray = new ImageView[] dedikten sonra "{" süslü açar isek. "{}" içerisine istediğimiz elemanları yazarız ne gibi. {imageView1,imageView2}; şeklinde 16.ya kadar yapcam ben
Bunu niçin yaptık : Bunu bir loop'a alıp imageViewlerimizi yani zeoyu görünmez yapıcağız görünmez yaptıktan sonra random olarak 1 er tane açıcağız onu onCreate altındada yapabiliriz ama ayrı bir method açmayı tercih ettim.
    5) public void hideImages() { } şeklinde ve onuda
    6) hideImages(); şeklinde cağırayim. onCreate altında açılır açılmaz saklansın
Şimdilik sadece imageleri sakladığım birşey yazıcağım  animasyon olayına daha sonra gireceğim. Nasıl yapıyoruz bunu:
    7) hideImages methodumuzun içerisine foor loop'u açıyoruz "for (ımageView image:"hangi dizi içerisinde loop'a sokucağız.) şu şekilde "for (ImageView image : imageArray) { diyip bu dizi içerisinde loop'a sok diyoruz.
Bu dizi içerisindeki her imageView'i image. yazarak cağırabilirim  ve dersemki örneğin.
    8) image.setVisibility(View.INVISIBLE); dersek hepsini görünmez yapıcaktır
Şu aşamada emuyu çalıştırırsak onCreate altında cağrıldıgı için açtığında imagelerin görünmez olmasını bekliyoruz "görülceği üzerede şu aşamada benimki görünmez ve hiç birinede tıklanmıyor"
Tıklasamda skor artmıyor şimdi buraya kadar yaptık bundan sonraki kısım her saniyede bir felan hatta yarim saniyede bir 1 zeo imageView ortaya çıkartmak.
Onun içinde "ZeoHareketEdiyorNot" şeklinde devam ediceğim.




 */