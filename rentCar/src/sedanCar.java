import java.util.ArrayList;
import java.util.Arrays;

public class sedanCar extends car {
    // car class dan kal?t?m al?r?m
    private ArrayList<String> list = new ArrayList();   // ara�lar? listelemek i�in arraylist
    public sedanCar(int model, int capacity, String color,int customerType) {
        super(model, capacity, color,customerType);
        list.add("Opel");       // ara�lar? eklerim
        list.add("Renault");
    }
    public ArrayList<String> getList() {  // ara� listesini yazd?rmak i�in get metodu
      return list;
    }
    @Override
    public void rentOneCar() {           // car class dan metot override edilir
        super.rentOneCar();
        System.out.println(getList());  // ara� listesi yazd?r?l?r
    }
    @Override
    public double calculateDailyFee(int modelType) {   // car class dan metot override edilir
        return super.calculateDailyFee(modelType);
    }
    @Override
    public double calculateMontyFee(int modelType) {   // car class dan metot override edilir
        return super.calculateMontyFee(modelType);
    }

}
