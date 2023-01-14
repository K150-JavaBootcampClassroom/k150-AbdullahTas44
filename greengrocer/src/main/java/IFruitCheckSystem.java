public interface IFruitCheckSystem {
    void buyFruitGreengrocer(String name,double kg);    // implement edilen yerde zorunlu döngü
    double customerBuyFruit(String name,double kg);     // implement edilen yerde zorunlu döngü
}
// ilk başta calculate ve update sınıflarını implement etmeyi düşündüm sonrasında sadece calculate sınıfı yeterli olur dedim
// ama bu aşamada artık interface yapmıştım silmedim sistemi aynen devam ettirdim. istenirse kullanılmayabilir.
