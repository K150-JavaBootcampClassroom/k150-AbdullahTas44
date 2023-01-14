import java.util.Scanner;

public class Customer {
    String process="";
    boolean isCorrect= true;
    int chosen;
    double total=0.0,kg=0.0;

    public void customerView(){  // customerView metodu
        Scanner input = new Scanner(System.in);
        UpdateStock updateStock = new UpdateStock(); // UpdateStock sınıfından nesne oluştur
        Calculate calculate = new Calculate(); // Calculate sınıfından nesne oluştur
        process = "Lütfen almak istediğiniz meyveyi seçiniz :\n" +
                "1 - Elma\n" +
                "2 - Armut\n" +
                "3 - Kiraz\n" +
                "4 - Çıkış";

        while (isCorrect){  // while döngüsü ile müşteriye seçim yaptırılır
            System.out.println(process);
            System.out.print("Seçiminiz : ");
            chosen = input.nextInt();

            switch (chosen){
                case 1 :  // Elma seçti ise
                    System.out.print("Lütfen almak istediğiniz elma miktarını giriniz kg olarak");
                    kg = input.nextDouble();
                    total += calculate.customerBuyFruit("Elma",kg);  // Aldığı meyvenin ücreti hesaplanır
                    System.out.println("Total : " + total);
                    break;
                case 2: // Armut seçti ise
                    System.out.print("Lütfen almak istediğiniz armut miktarını giriniz kg olarak");
                    kg = input.nextDouble();
                    total += calculate.customerBuyFruit("Armut",kg);  // Aldığı meyvenin ücreti hesaplanır
                    System.out.println("Total : " + total);
                    break;
                case 3: // Kiraz seçti ise
                    System.out.print("Lütfen almak istediğiniz kiraz miktarını giriniz kg olarak");
                    kg = input.nextDouble();
                    total += calculate.customerBuyFruit("Kiraz",kg);  // Aldığı meyvenin ücreti hesaplanır
                    System.out.println("Total : " + total);
                    break;
                case 4: // Çıkmak istedi ise
                    System.out.println("Güle güle...");
                    isCorrect = false;
                    break;
                default:  // Hatalı seçim yaptı ise
                    System.out.println("Hatalı seçim yaptınız");
                    break;
            }
            if (chosen != 4 ){  // Seçimi çıkmak olmamış ise başka ürün almak istermi diye soralım alışverişe devam...
                System.out.println("Başka ürün alacak mısınız ?}\n" +
                        "1 - Evet\n" +
                        "2 - Hayır");
                System.out.print("Seçiminiz : ");
                chosen = input.nextInt();

                if (chosen == 2){  // seçim 1 ise yapacak bi şeyimiz yok alışveriş devam seçim 2 ise toplam mevcut borcunu yazarız
                    System.out.println("Ödemeniz gereken toplam ücret " + total);
                    System.out.println("Güle güle");
                    isCorrect = false;  // döngü bitmesi için isCorrect false olmalı
                }
            }
        }
    }
}
