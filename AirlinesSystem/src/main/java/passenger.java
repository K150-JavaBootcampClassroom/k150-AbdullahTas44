import java.util.Scanner;

public class passenger {
    public void passengerAccept(){
        Scanner input = new Scanner(System.in);
        int choose=0;
        String selectedSeat="";
        System.out.println("Lütfen seçiminizi yapınız\n" +
                "1 - Uçak bileti almak\n" +
                "2 - Çıkış");
        choose = input.nextInt();
        if (choose==1){
            System.out.println("Lütfen seçiminizi yapınız\n" +
                    "1 - İç hatlar\n" +
                    "2 - Dış hatlar");
            choose = input.nextInt();
            if (choose==1){
                System.out.println("Hangi havayolu ile uçmak istersiniz\n" +
                        "1 - Thy\n" +
                        "2 - Pegasus");
                choose=input.nextInt();
                if (choose==1){
                    System.out.println("THY hoşgeldiniz");
                    seat s = new seat();

                    passangerService p = new passangerService();
                    System.out.println("Mevcut koltuk listemiz : ");
                    s.printSeatEconomic();
                    System.out.print("Lütfen bir koltuk seçiniz/yazınız : ");
                    selectedSeat = input.nextLine();
                    input.nextLine();
                    System.out.println("Seçilen koltuk : " + selectedSeat);
                    p.passangerInf();
                    thy t = new thy("Thy",111,selectedSeat);


                    System.out.println("Sayın yolcumuz " + p.getPassangerName() + "uçak biletiniz alınmıştır.\n" +
                            "ödemeniz gerek toplam ücret : " + t.buyDomesticTicket());




                }else if (choose==2){
                    System.out.println("Pegasus hoşgeldiniz");
                    seat s = new seat();

                    passangerService p = new passangerService();
                    System.out.println("Mevcut koltuk listemiz : ");
                    s.printSeatEconomic();
                    System.out.print("Lütfen bir koltuk seçiniz/yazınız : ");
                    selectedSeat = input.nextLine();
                    input.nextLine();
                    System.out.println("Seçilen koltuk : " + selectedSeat);
                    p.passangerInf();
                    pegasus peg = new pegasus("Pegasus",222,selectedSeat);
                    System.out.println("Sayın yolcumuz " + p.getPassangerName() + "uçak biletiniz alınmıştır.\n" +
                            "ödemeniz gerek toplam ücret : " + peg.buyDomesticTicket());


                }else{
                    System.out.println("Çıkış yapıyorsunuz güle güle...");
                }
            }else if(choose==2){
                System.out.println("Hangi havayolu ile uçmak istersiniz\n" +
                        "1 - Thy\n" +
                        "2 - Pegasus");
                choose = input.nextInt();
                if (choose==1){
                    System.out.println("THY hoşgeldiniz");

                    seat s = new seat();

                    passangerService p = new passangerService();
                    System.out.println("Mevcut koltuk listemiz : ");
                    s.printSeatEconomic();
                    s.printSeatBusiness();
                    System.out.print("Lütfen bir koltuk seçiniz/yazınız : ");
                    selectedSeat = input.nextLine();
                    input.nextLine();
                    System.out.println("Seçilen koltuk : " + selectedSeat);
                    p.passangerInf();
                    thy t = new thy("Thy",111,selectedSeat);
                    System.out.println("Sayın yolcumuz " + p.getPassangerName() + "uçak biletiniz alınmıştır.\n" +
                            "ödemeniz gerek toplam ücret : " + t.buyOutsideTicket(selectedSeat));


                }else if (choose==2){

                    System.out.println("Pegasus hoşgeldiniz");

                    seat s = new seat();

                    passangerService p = new passangerService();
                    System.out.println("Mevcut koltuk listemiz : ");
                    s.printSeatEconomic();
                    s.printSeatBusiness();
                    System.out.print("Lütfen bir koltuk seçiniz/yazınız : ");
                    selectedSeat = input.nextLine();
                    input.nextLine();
                    System.out.println("Seçilen koltuk : " + selectedSeat);

                    p.passangerInf();
                    pegasus peg = new pegasus("Pegasus",222,selectedSeat);
                    System.out.println("Sayın yolcumuz " + p.getPassangerName() + "uçak biletiniz alınmıştır.\n" +
                            "ödemeniz gerek toplam ücret : " + peg.buyOutsideTicket(selectedSeat));
                }else{
                    System.out.println("Çıkış yapıyorsunuz güle güle...");
                }
            }else{
                System.out.println("Çıkış yapıyorsunuz güle güle...");
            }
        }else{
            System.out.println("Çıkış yapıyorsunuz güle güle...");
        }

    }
}
