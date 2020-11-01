/*
Daha önce runnable öğrenmiştik Runnable nasıl kullanmıştık : Özellikle devamlı yaptırmak istediğimiz her saniye başı veya yarım saniyede bir 10 saniyede bir yaptırmak istediğimiz
şeyleri runnable ile yapabiliriz demiştik ve bu countDownTimer gibi geri saymak içinde kullanılabilir ileri saymak içinde kullanılabilir kronometre gibi veya herhangi bir image'yi açıp kapatabilmek için herhangi bir işlemi aslında.
Belli periyotlarda yapabilmek için Runnableyi kullanabiliriz demiştik O yüzden bir handler.
    1) AppCompatActivty Altına "Handler handler;"
    2) AppCompatActivty Altına "Runnable runnable;"  koyuyorum.
--Handler Runnableyi kullanabilmek için gerekli olan bir sınıf Bunlarıda yine en üstte oluşturuyorumki başka bir yerde çekmem gerekirse yine kullanabileyim.
Şimdi hideImages(){ " methodunun içine geliyorum sadece bu for loop'unu yapmıcam başka şeylerde yaptırıcağım öncelikle handler ve runnablemi bir tanımlayiyim.
    3) handler = new Handler();
    4) runnable = new R "derken bize {...} diye bir seçenek sunuyor. tıklarsak.
    "runnable = new Runnable () {
    @Override
    public void run() {
    }
    }"
Şeklinde oluyor kendiliginden gelen bir override methodu oluyor şöyle new runnable "};" süslüsünü ";" ile kapatayim ve altta daha önceden yazmış olduğumuz foor loopu kesip.
public void run(){ içerisinde yapıcağız yani buraya yapıştırayim  neden : Run içerisinde bütün diziyi görünmez hale getireceğim her saniyede bir mesela sonrasında bir tane rastgele bir değer bulucağım.
Ve bu rastgele bulduğum bir değeri açıcağım.Yani rastgele bulduğum değeri dizi içerisinde görünür hale getireceğim  peki rasgele değer nasıl bulunur ?
    5) "Random random =new Random();" Run methodu içerisinde.
Random diye bir sınıf var random rastgele demek randomu kullanarak yeni bir random objesi oluşturayim Ve şöyle birşey diyebiliyoruz.
    6) Run methodu içerisinde "int i = random.nextInt(16);" diyiceğim bu nextInt"()" içerisine 16 yazarsam 0 ile 15 arası bize herhangi bir rastgele rakam getirir.
Neden 0 ile 15 bizim dizimizde "imageArray" 16 tane rakam var ve dizilerin indexi sıfırdan başlar öyle devam ederdi yani 16 elemanımız varsa 0 ile 15 arası bizim rastgele sayı oluşturmam gerekir
Örneğin
    7) imageArray [0].setVisibility(View.VISIBLE); der isem imageArray içindeki ilk şeyi alır ve görünür hale getirir  1 dersem onu yapar  8 dersem onu yapar bunuda rastgele yapabilmek için.
    7) imageArray[i].setVisibility(View.VISIBLE);  i diyiceğim böylece biraz sonra belirliyeceğimiz periyot içerisinde bu işlem devamlı olucak örneğin.
    8) handler.postDelayed()
- Ne demekti bu bir runnableyi çalıştır devamlı olucak birşeyi çalıştır ve bunu rötarlı calıştır ve habire milisaniyede bir olmasın bu söylediğim periyotta olsun ne gibi.
Şuan runnablenin içinde olduğumuz için  "this," diyebiliriz neydi this bir üstünde bulunduğu yere işaret ediyordu yani biz burda onCreate altında this dersek direk MainActivty'e işaret ederken.
şuan runnable içerisinde olduğum için run'a runnableye işaret ediyor
    8)handler.postDelayed(this,1000); şimdilik bir saniye dedim ve en son bunu başlatmak için.
    9) Runnable tanımlaması bittikten sonra }; sonra yani "handler.post(runnable);" diyoruz.
Şu aşamada emuyu çalıştırsak zeo hareket etmeye başladı sadece çok yavaş buna herkes tıklıyabilir her saniyede bir bunu yapmak güzel olmadı onu bir değiştirelim örneğin.
"500"millisde bir yapsın tabi 500'ü 300 400 yapıp farklı seviyelerde bir oyun yapabiliriz tabi şuanda bazı sorunlar var ne gibi.
Time 0 oldu ama zeo kaçmaya devam ediyor ve ben tıklamayada devam edebiliyorum  tıkladıkçada skor artıyor şimdi burda duralım sonraki bölümdede bunu halledelim.
"OyunBitinceNot" şeklinde devam ediceğim.
 */