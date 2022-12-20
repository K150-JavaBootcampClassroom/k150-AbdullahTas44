import java.util.Scanner;

public class Atm {

    public static void main (String[]avgs){

        int chosen,amount=0;
        int balance = 10000;
        boolean isCorrect = true;

        String view = "Merhaba Abdullah Banka Hoşgeldiniz \n" +
                "Lütfen yapacağınız işlemi seçiniz : \n" +
                "1- Bakiye Öğrenme \n" +
                "2- Para Çekme \n" +
                "3- Para Yatırma \n" +
                "4- Çıkış";

        Scanner input = new Scanner(System.in);


        while (isCorrect){

            System.out.println(view);
            chosen = input.nextInt();
             switch (chosen){
                 case 1:
                     System.out.println("Mevcut bakiyeniz : " + balance);
                     break;
                 case 2:
                     System.out.print("Lütfen çekeceğiniz para miktarını giriniz : ");
                     amount = input.nextInt();
                     balance -= amount;
                     System.out.println("Yeni mevcut bakiyeniz : " + balance);
                     break;
                 case 3:
                     System.out.print("Lütfen yatıracağınız para miktarını giriniz : ");
                     amount = input.nextInt();
                     balance += amount;
                     System.out.println("Yeni mevcut bakiyeniz : " + balance);
                     break;
                 case 4:
                     System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz...");
                     isCorrect=false;
                     break;
                 default:
                     System.out.println("Hatalı giriş yaptınız lütfen tekrar giriş yapınız");
                     break;
             }




        }







    }



}
