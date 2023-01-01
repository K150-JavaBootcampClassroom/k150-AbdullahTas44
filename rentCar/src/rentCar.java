import java.util.Scanner;

public class rentCar {
    public static void main (String[]args){

        boolean isCorrect = false,isCorrect2=false;   // while döngülerim için boolenlar
        int customerType;
        Scanner input = new Scanner(System.in);

        while (!isCorrect){   // musteri tipini belirlemek için while girişi
            System.out.println("Lütfen müşteri tipinizi giriniz\n" +
                    "1- Vatandaş\n" +
                    "2- Şirket");
            System.out.print("Seçiminiz : ");
            customerType = input.nextInt();   // 1 yada 2 seçilir
            input.nextLine();

            if (customerType == 1){      // vatandaş ise

                System.out.print("Lütfen isim giriniz : ");   //isim alınır
                String name = input.nextLine();
                System.out.print("Lütfen telefon numarası giriniz : ");  // telefon alınır
                int phoneNumber = input.nextInt();
                input.nextLine();
                System.out.print("Lütfen adresinizi giriniz : ");  // adres alınır
                String address = input.nextLine();

                citizen m1 = new citizen(name,phoneNumber,address);   // vatandaş olarak nesne üretilir bilgiler atılır

                System.out.println(m1.getName() + " bey sadece Hatchback türü araç kiralayabilirsiniz");

                hatchbackCar h1 = new hatchbackCar(2022,7,"mavi",0);  // araç tipinden nesne üretilir
                h1.rentOneCar();  // araç kiralama süreci başlar

                System.out.println("Bu modelde sadece günlük kiralama yapabilirsiniz\n" +
                        "Günlük ödemeniz gereken miktar : " + h1.calculateDailyFee(3));

                // müşteri sadece günlük kiralama yapabilir buna göre hesap yapılıp geri dönüş yapılır

                isCorrect=true;

            }else if(customerType == 2){      // şirket ise
                System.out.print("Lütfen şirket ismi giriniz : ");  // şirket ismi alırız
                String name = input.nextLine();
                System.out.print("Lütfen telefon numarası giriniz : "); // telefon numarası alırız
                int phoneNumber = input.nextInt();
                input.nextLine();
                System.out.print("Lütfen adresinizi giriniz : ");  // adres bilgisi alırız
                String address = input.nextLine();

                company s1 = new company(name,phoneNumber,address);   // company class dan nesne üretme

                while (!isCorrect2) {        // araç kiralama türünü seçmek için while döngüsü girişi
                    System.out.println(s1.getName() + " şirketiniz hangi araç türünü kiralamak ister...\n" +
                            "1- Suv tarzı\n" +
                            "2- Sedan tarzı\n" +
                            "3- Hatchback tarzı");
                    System.out.print("Seçiminiz : ");
                    int carType = input.nextInt();             // araç tipi seçilir

                    switch (carType) {
                        case 1 -> {    // suv ise
                            suvCar c1 = new suvCar(2020, 5, "kırmızı", 1);   //suvCar class nesne oluştururuz
                            c1.rentOneCar();    // araç kiralama süreci başlar
                            System.out.println("Lütfen kiralama tipini seçiniz...\n" +
                                    "1- Günlük kiralama\n" +
                                    "2- Aylık kiralama");
                            System.out.print("Seçiminiz : ");
                            int rent = input.nextInt();        // kiralama türü seçilir günlük aylık
                            input.nextLine();
                            if (rent ==1){             // günlük ise
                                System.out.println("Kiralamak istediğiniz araç için günlük ödemeniz gereken ücre : " + c1.calculateDailyFee(1));

                            }else{                              // aylık ise
                                System.out.println("Kiralamak istediğiniz araç için aylık ödemeniz gereken ücre : " + c1.calculateMontyFee(1));
                            }
                            isCorrect2 = true;   // while döngüsünden çıkılır
                        }
                        case 2 -> {  // sedan ise
                            sedanCar c2 = new sedanCar(2021, 5, "sarı", 1);  //sedanCar class nesne oluştururuz
                            c2.rentOneCar();   // araç kiralama süreci başlar
                            System.out.println("Lütfen kiralama tipini seçiniz...\n" +
                                    "1- Günlük kiralama\n" +
                                    "2- Aylık kiralama");
                            System.out.print("Seçiminiz : ");
                            int rent = input.nextInt();   // kiralama türü seçilir
                            input.nextLine();
                            if (rent ==1){  // günlük ise
                                System.out.println("Kiralamak istediğiniz araç için günlük ödemeniz gereken ücre : " + c2.calculateDailyFee(2));

                            }else{            // aylık ise
                                System.out.println("Kiralamak istediğiniz araç için aylık ödemeniz gereken ücre : " + c2.calculateMontyFee(2));
                            }
                            isCorrect2 = true;  // while döngüsünden çıkılır
                        }
                        case 3 -> {  // hatchback ise
                            hatchbackCar c3 = new hatchbackCar(2022, 7, "mavi", 0);  // hatchback class nesne oluşturulur
                            c3.rentOneCar();  // araç kiralama süreci başlar

                            System.out.println("Bu modelde sadece günlük kiralama yapabilirsiniz\n" +
                                    "Günlük ödemeniz gereken miktar : " + c3.calculateDailyFee(3));   // bu araçta sadece günlük kiralama çalışır
                            isCorrect2 = true;   // while döngüsünden çıkılır
                        }
                        default -> System.out.println("Hatalı seçim yaptınız !!!");   // hatalı seçim başa dön
                    }
                }
                isCorrect=true;  // while döngüsünden çıkılır
                }
            else {
                System.out.println("Hatalı giriş yaptınız");  // hatalı seçim başa dön
            }
        }
    }
}
