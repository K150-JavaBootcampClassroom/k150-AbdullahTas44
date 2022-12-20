import java.util.Random;

public class NumberFind {
    public static void main (String[]args){

        Random rnd = new Random();
        int number,counter = 0 ;
        boolean isCorrect = true;

        while (isCorrect){

            number = rnd.nextInt(501);
            System.out.println("Üretilen sayı : " + number);
            if (number > 50 && number < 100){
                counter++;
                isCorrect = false;
            }else {
                counter++;
            }
        }

        System.out.println("Sayı "+ counter + ". kerede bulundu");


    }


}
