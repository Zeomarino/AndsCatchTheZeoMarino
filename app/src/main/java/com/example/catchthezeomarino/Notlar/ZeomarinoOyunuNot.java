/*
App ilk başladıgında karakterimiz bizden kaçıyor bizde üstüne tıklayarak Zeoyu yakalamaya çalışıyoruz ve görülceği üzere tıkladıkça altta skor artıyor.
Oyun bittiğinde tekrar baştan başlatmak istersek başlatabiliyoruz vs böyle bir planım var
Herşeyden önce bir adet png resmi bulalım ben zeomarinoyu yaptım sizde başka birşey yapabilirsiniz bunun için resmimizin png olmasını istiyorumki etrafı şeffaf olsun insan gibi gözüksün yeter.
Resmimizi kopyalayıp res/drawble içerisine yapıştıralım.
Tasarım notu : Aslında oyunda gördüğümüz Zeomarino 1 tane değil 9 tane zeomarinoyu yan yana koydum ve bu dokuz zeoyu birbirinden kaçıp görünmez olarak yok olarak görülebilcek bir hale getirdim.
Ve bunuda loop'larla yaptım. Şimdi bunu yapmak için 9 Zeoyu yanyana getirmek için pratiklik açısından grid layout'u kullanacağım
Eğer sizde bu aşmayı okuyorsanız grid layoutu attıktan sonra otomatik constraint verdim grid layoutuma.Şimdi ilk İmageViewimizi alıp ilk gridin içerisine 0a0 a atalım. kutucuğa yani...
Resmimizin width ve heightini ayarlıcam büyük geldi gözüme width 100dp height 120 dp gibi ayarlıyorum bunu sonradan tekrar değiştirebiliriz küçük veya büyük gelirse önemli değil.
Ve bundan sonra hemen Text yani split kısmına geldim çünkü grid üzerinde xmlden çalışmak daha kolay oldugunu düşünüyorum
<ImageView içerisinde.
row ekledim , şu şekilde
"app:layout_row="0"" & "app:layout_column="0" " 2 layout ekledim Daha sonra
"        <ImageView
            android:id="@+id/imageView1"
            android:layout_width="100dp"
            android:layout_height="120dp"
            app:layout_row="0"
            app:layout_column="0"
            app:srcCompat="@drawable/catchthezeomarino" /> " Alıp içerisinde istediğimiz gibi kopyalayabiliyorduk "/>" bittiğinden emin olalım ama. Çünkü bu satır önceki imageViewin bitiş satırı.
Sadece neydi : 1 . İdleri değiştiriceğiz , daha sonrada column'u Şimdi "layout column" şuydu Grid layout içerisinde misal hemen alt satıra geçmemizi sağlıcağından .
layout_column alt satıra geçmesi amacıyla değiştirdim. Benim gridimde tabiki öyle ayarladığımdan dolayı 5 alt sıra 4 yan yana sıra vardı.
Yan yana sıraları değiştirmek içinde "layout_row'u" değiştirdim. Ve böylece 5x4 adam gibi bir grid layout ekranına yaydım Zeomarino resimlerini. Bunu yapmak zorunda değiliz tek bir imageViewlede yapılabilir imageView'i rastgele yerlerde oluşturabiliriz.
Birçok farklı yöntemi var aslında bunun fakat ben böyle yaratıcı bir yöntem olması açısından düşündüm çünkü daha önceki github içeriklerimde grid layoutun notunu tutmuştum kullanmak istedim diyelim.
Ben 16Tane imageView ekledim ekrandan ekrana değişiklik gösterebilir farklılık olabilir sizde Şimdi dizayn kısmına geri dönelim Gridimizin bukadar büyük olmasına gerek yok istediğimiz boyuta getirelim.
Ben dediğim gibi 16 tane imageView'i yaydığım için buna gerek duymadım ama siz küçültebilirsiniz constraint verdiğimiz için zaten ve grid layoutta constraintlere üstte sola "dalgalı ok " şeklinde constraintler olduğu için
Aslında otomatikmen kendi şekillendirdi hatta 1 2 tane textView koyunca infer constraint diyiceğiz ve bir sorun kaldıysa onlarda gidicek zaten.Ne texti olucaktı.
1 Tane bu grid layoutumuzun üstünde 1 Tane zamanı sayan bir text ekliyebiliriz. Bunu koyalım bunun textine "time:" yaptım ben  birde textSize ekledim 36sp yaptım size kafanıza göre yapmakta özgürsünüz.
Bir kaç renk paleti ile oynadım keza aynısından birtanede alta koyucağım.Bununda islemlerini aynı yağıcağım diğerinden tek farkı benim için texti Score: yapmam
Tekrar infer constraint diyorum constraintlerini alması için ve emuda çalıştırırsak bakalım düzgünmü durucak.Baktığımda sonuçtan memnun kaldım bunun üstünde devam edebiliriz sonra zaten bir sorun olursa bakarız tasarım için
yeterlidir burda duralım bir sonraki notumda anlatmaya devam ediceğim.
"SkoruArttırmakNot"

*/














































