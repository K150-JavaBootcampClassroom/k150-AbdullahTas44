import java.util.Scanner;

public class UserType {

    public void user(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı tipinizi giriniz \n" +
                "1 - Manav\n" +
                "2 - Müşteri");
        System.out.print("Seçiminiz : ");
        int choosen = input.nextInt();
        if (choosen==1){   // Kullanıcı tipi Manav ise
            Boss boss = new Boss();  // Boss sınıfından nesne oluştur
            boss.bossView();  // bossView metodunu çalıştır
        }else if (choosen == 2 ){  // Kullanıcı tipi müşteri ise
            Customer customer = new Customer(); // Customer sınıfından nesne oluştur
            customer.customerView(); // customerView metodunu çalıştır
        }else {
            System.out.println("Hatalı seçim yapıldı\n" +
                    "Güle güle...");
        }

    }
}
