/* Şimdi skoru yaptığımıza göre bir sonraki aşama zaman sayacı kaldı onu yapıcağız
Bunu yapmak içinde count down timer'i kullanıcağız
Bunu gelelim direk onCreate altında yazalım çünkü uygulama açıldıgı gibi geriye saymasını istiyoruz
O sebeple onCreate altına gelip.
    1 ) new CountDownTimer() diyorum.
Hatırlarsanız countdowntimer'in 2 tane şey istiyordu bizde bir milisecond kaçtane geriye sayayim 2 de kaç aralıkla sayayim
Örneğin : 10 saniye say saniyede düş gibisinden söyle yazabiliriz.
    2) new CountDownTimer("10000",1000){ Hatırlarsanız bu milisaniye zaten yazıyor burda millisecond diye o yüzden 10 saniyeyi mili second olarak 10000 verdim.
Bunu açtıktan sonra CountDownTimer altında kırmızı uyarı cıkıyor uygulamamız gereken methodlar var diyor ampul o yüzden soldaki ampule basarsak.
"@Override
public void onTick(long millisUntilFinished){

}"

"@Override
public void onFinish() {

}"
şeklinde bize 2 method sunucaktır ands. Olduki vermesse ands @Override yazarak zaten methodları görebiliriz bizi burda ilgilendiren İmplement Methods olması.
Neydi peki bunlar.
"public void onFinish() {" bitince ne olcağı.CountDownTimer bitince ne olucak
"public void onTick(long millisUntilFinished){" onTick her bir saniyede ne yapayim.
ve en sonundada "}" count down fnish süslüsünü kırmızı ile gösterirse .start(); yazıyorduk. Buda countDownTimer'i başlat manasına geliyordu.
Şimdi onTick içerisinde ne yapıcağız sadece app üzerindeki time sayacını güncellememiz yeterli 60'dan başlasın geriye doğru saysın örneğin.
bunun için ne yapıcağım.
    3)onTick altına "timeText.setText("Time:"+millisUntilFinished/1000);" dicem
Şu şartlar altında emuyu çalıştırırsam başladı ve belli bir yerde durdu 0'da durdu bende.
Ve onFinish'de ne olucağını yazmadık o yüzden bittiğinde birşey olmadı. Şuan için zaten buraya birşey yazmamıza gerek yok oyunu yazmaya başladıktan sonra.
Yani zeolar kaçsın skorları alalım oyun bitsin ondan sonra onFinish'ide yazıcağız
Bundan sonraki notum.
"GörselDizisiNot" şeklinde devam edicek.


 */