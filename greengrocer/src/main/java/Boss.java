import java.util.Scanner;

public class Boss {
    String process="",process2="";
    boolean isCorrect= true;
    int chosen, chosen2;

    public void bossView(){  // boosview metodu
        Scanner input = new Scanner(System.in);
        UpdateStock updateStock = new UpdateStock();  // UpdateStock sınıfından nesne oluştur
        Calculate calculate = new Calculate();// Calculate sınıfından nesne oluştur
        process = "Sayın manavımız ne yapmak isterseniz:\n" +
                "1 - Stokları Görüntüle\n" +
                "2 - Stokları Güncelle\n" +
                "3 - Fiyatları Güncelle\n" +
                "4 - Çıkış";
        process2 = "Lütfen görmek istediğiniz meyveyi seçiniz :\n" +
                "1 - Elma\n" +
                "2 - Armut\n" +
                "3 - Kiraz";

        while (isCorrect){  // Döngü kurulur seçim için
            System.out.println(process);
            System.out.print("Seçiminiz : ");
            chosen = input.nextInt();
            input.nextLine();
            switch (chosen){
                case 1 :  // görüntüle dedi ise

                    System.out.println(process2);
                    System.out.print("Seçiniz : ");
                    chosen2 =input.nextInt();   // meyve türü seçtirilir
                    input.nextLine();
                    if (chosen2 == 1){
                        System.out.println("Kalan elma stokunuz : " +updateStock.getStock("Elma"));   // Elma stoku getirilir
                    }else if(chosen2 ==2){
                        System.out.println("Kalan elma stokunuz : " +updateStock.getStock("Armut"));  // Armut stoku getirilir
                    }else if(chosen2 ==3){
                        System.out.println("Kalan elma stokunuz : " +updateStock.getStock("Kiraz")); // Kiraz stoku getirilir
                    }
                    break;
                case 2 : // stok güncelle dedi ise
                    System.out.println(process2);
                    System.out.print("Seçiniz : ");
                    chosen2 =input.nextInt();
                    if (chosen2 == 1){
                        System.out.print("Aldığınız elma miktarını giriniz : ");
                        double kg = input.nextDouble();
                        calculate.buyFruitGreengrocer("Elma",kg);  // Elma stoku güncellenir
                    }else if(chosen2 ==2){
                        System.out.print("Aldığınız armut miktarını giriniz : ");
                        double kg = input.nextDouble();
                        calculate.buyFruitGreengrocer("Armut",kg); // Armut stoku güncellenir
                    }else if(chosen2 ==3){
                        System.out.print("Aldığınız kiraz miktarını giriniz : ");
                        double kg = input.nextDouble();
                        calculate.buyFruitGreengrocer("Kiraz",kg); // Kiraz stoku güncellenir
                    }
                    break;
                case 3 :  // Fiyatları güncelle dedi ise
                    System.out.println(process2);
                    System.out.print("Seçiniz : ");
                    chosen2 =input.nextInt();
                    if (chosen2 == 1){
                        System.out.print("Yeni elma fiyatını giriniz : ");
                        double price = input.nextDouble();
                        calculate.updatePrice("Elma",price);  // Elma fiyatı güncellenir
                    }else if(chosen2 ==2){
                        System.out.print("Yeni armut fiyatını giriniz : ");
                        double price = input.nextDouble();
                        calculate.updatePrice("Armut",price);  // Armut fiyatı güncellenir
                    }else if(chosen2 ==3){
                        System.out.print("Yeni kiraz fiyatını giriniz : ");
                        double price = input.nextDouble();
                        calculate.updatePrice("Kiraz",price); // Kiraz fiyatı güncellenir
                    }
                    break;
                case 4 :  // çıkış seçti ise çıkış yapılır
                    System.out.println("Güle güle sevgili patron...");
                    isCorrect = false;
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız");
            }
        }




    }

}
