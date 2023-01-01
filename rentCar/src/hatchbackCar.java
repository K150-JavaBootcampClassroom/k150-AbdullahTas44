import java.util.ArrayList;

public class hatchbackCar extends car{
    // car class dan kal?t?m al?r?m
    private ArrayList<String> list = new ArrayList();   // araçlar? listelemek için arraylist
    public hatchbackCar(int model, int capacity, String color,int customerType) {
        super(model, capacity, color,customerType);
        list.add("Honda");          // araçlar? eklerim
        list.add("Citroen");
    }
    public ArrayList<String> getList() {  // araç listesini yazd?rmak için get metodu
        return list;
    }
    @Override
    public void rentOneCar() {  // car class dan metot override edilir
        super.rentOneCar();
        System.out.println(getList());  // araç listesi yazd?r?l?r
    }
    @Override
    public double calculateDailyFee(int modelType) {    // car class dan metot override edilir
        return super.calculateDailyFee(modelType);
    }
    @Override
    public double calculateMontyFee(int modelType) {  // car class dan metot override edilir
        return super.calculateMontyFee(modelType);
    }
}
