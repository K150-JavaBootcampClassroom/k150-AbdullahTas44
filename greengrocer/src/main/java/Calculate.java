import java.util.Scanner;

public class Calculate implements IFruitCheckSystem{



    @Override
    public void buyFruitGreengrocer(String name, double kg) {   // patronun yapacağı işlemler / hesaplamalar metodu
        UpdateStock u = new UpdateStock();  // UpdateStock sınıfından nesne oluştur
        Scanner input = new Scanner(System.in);
        if (name =="Elma"){  // gelen elma ise
            Apple apple = new Apple("Elma","Beyaz");    // Apple sınıfından nesne oluştur
            u.setStock("Elma",kg);  // Elma alındığında mevcut stoka eklenmesi için
            System.out.print("Mevcut fiyatı güncellemek ister misiniz (1-Evet 2- Hayır : ");
            int choosen = input.nextInt();
            if(choosen==1){  // stoku güncellendikten sonra fiyatta değişecek ise
                System.out.print("İstediğiniz yeni fiyat nedir : ");
                double price = input.nextDouble();
                updatePrice("Elma",price); // updatePrice kullanarak Fiyatı güncelle
            }
        }
        else if(name=="Armut"){
            Pear pear = new Pear("Armut","Sarı");   // Pear sınıfından nesne oluştur
            u.setStock("Armut",kg);  // Armut alındığında mevcut stoka eklenmesi için
            System.out.print("Mevcut fiyatı güncellemek ister misiniz (1-Evet 2- Hayır : ");
            int choosen = input.nextInt();
            if(choosen==1){ // stoku güncellendikten sonra fiyatta değişecek ise
                System.out.print("İstediğiniz yeni fiyat nedir : ");
                double price = input.nextDouble();
                updatePrice("Armut",price); // updatePrice kullanarak Fiyatı güncelle
            }
            }
        else if(name=="Kiraz"){
            Cherry cherry = new Cherry("Kiraz","Kırmızı");
            u.setStock("Kiraz",kg);  // Kiraz alındığında mevcut stoka eklenmesi için
            System.out.print("Mevcut fiyatı güncellemek ister misiniz (1-Evet 2- Hayır : ");
            int choosen = input.nextInt();
            if(choosen==1){  // stoku güncellendikten sonra fiyatta değişecek ise
                System.out.print("İstediğiniz yeni fiyat nedir : ");
                double price = input.nextDouble();
                updatePrice("Kiraz",price); // updatePrice kullanarak Fiyatı güncelle
            }
        }
    }

    public void updatePrice(String name,double price){  // direk olarak fiyat güncellemek için oluşturulan metot
        if (name =="Elma"){
            Apple apple = new Apple("Elma","Beyaz");
            apple.setPrice(price); // fiyatı güncellemek için
        }
        else if(name=="Armut"){
            Pear pear = new Pear("Armut","Sarı");
            pear.setPrice(price); // fiyatı güncellemek için
        }
        else if(name=="Kiraz"){
            Cherry cherry = new Cherry("Kiraz","Kırmızı");
            cherry.setPrice(price); // fiyatı güncellemek için
        }
    }

    @Override
    public double customerBuyFruit(String name, double kg) {  // müşteri manavdan satın alma işlemi yapıldığında çalışacak kısım
        UpdateStock u = new UpdateStock();
        if (name =="Elma"){
            Apple apple = new Apple("Elma","Beyaz");

            if(u.checkStock("Elma",kg)){
                u.setStock("Elma",-kg);  // Elma alındığında mevcut stoktan düşmesi için - (eksi) olarak yolluyorum
                System.out.println(name + "kilogram fiyatı = " + apple.getPrice());
                return apple.getPrice()*kg;  // fiyatı döndüğümüz kısım
            }else{
                System.out.println("Yeterli miktarda elmamız bulunmamaktadır");
                return 0.0;  // satın alma olmadı ise 0 döneriz
            }
        }
        else if(name=="Armut"){
            Pear pear = new Pear("Armut","Sarı");
            if(u.checkStock("Armut",kg)){
                u.setStock("Armut",-kg);  // Armut alındığında mevcut stoktan düşmesi için - (eksi) olarak yolluyorum
                System.out.println(name + "kilogram fiyatı = " + pear.getPrice());
                return pear.getPrice()*kg;  // fiyatı döndüğümüz kısım
            }else{
                System.out.println("Yeterli miktarda armutumuz bulunmamaktadır");
                return 0.0;  // satın alma olmadı ise 0 döneriz
            }
        }else if(name=="Kiraz"){
            Cherry cherry = new Cherry("Kiraz","Kırmızı");
            if(u.checkStock("Kiraz",kg)){
                u.setStock("Kiraz",-kg);  // Kiraz alındığında mevcut stoktan düşmesi için - (eksi) olarak yolluyorum
                System.out.println(name + "kilogram fiyatı = " + cherry.getPrice());
                return cherry.getPrice()*kg;  // fiyatı döndüğümüz kısım
            }else{
                System.out.println("Yeterli miktarda kirazımız bulunmamaktadır");
                return 0.0;  // satın alma olmadı ise 0 döneriz
            }
        }
        return 0.0;
    }

}
