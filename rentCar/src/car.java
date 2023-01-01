import java.time.LocalDate;

public abstract class car {  // car absract class oluşturulur
    private int model;   // araç model yılı
    private int capacity;  // kaç kişilik
    private String color;  // rengi
    private int customerType;  // müşteri tipi buradadır 0 vatandaş 1 şirket
    public car(int model, int capacity, String color,int customerType) {
        this.model = model;
        this.capacity = capacity;
        this.color = color;
        this.customerType = customerType;
    }
    // bana sadece get metotları lazım
    public int getModel() {
        return model;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getColor() {
        return color;
    }
    public int getCustomerType() {
        return customerType;
    }
    // araç kiralama süreci burada başlar mevcut araçlar listelenir.
    public void rentOneCar(){

        if (getCustomerType()==0){                     // müşteri tipine göre araç türleri listenecek
            System.out.print("Araçlarınız : ");


        }else{
            System.out.print("Araçlarınız : ");
        }
    }
    public double calculateDailyFee(int modelType){
        LocalDate y = LocalDate.now();
        int year = y.getYear();                   // mevcut tarih çekilir sadece yıl olarak
        int carAge = year - model;
        double result=0.0;

        if (modelType==1)  // suv araç ise
            result = 500 + (500 * Double.valueOf(carAge/100.00));   // suv model için günlük 500 TL + araç yaşı kadar yüzde
        else if (modelType==2)  // sedan araç ise
            result = 400 + (400 * Double.valueOf(carAge/100.00));   // sedan model için günlük 400 TL + araç yaşı kadar yüzde
        else {  // geriye kalan hatchback araç ise
            result = 300 + (300 * Double.valueOf(carAge/100.00)); // hatchback model için günlük 300 TL + araç yaşı kadar yüzde
        }
        return result;  // ücreti dön
    }
    public double calculateMontyFee(int modelType){
        LocalDate y = LocalDate.now();
        int year = y.getYear();              // mevcut tarih çekilir sadece yıl olarak
        int carAge = year - model;
        double result=0.0;

        if (modelType==1){  // suv araç ise
            result = 450 + (450 * Double.valueOf(carAge/100.00));   // suv model için günlük 450 TL + araç yaşı kadar yüzde
            result *= 30;
        }else if (modelType==2){  // sedan araç ise
            result = 350 + (350 * Double.valueOf(carAge/100.00));   // sedan model için günlük 350 TL + araç yaşı kadar yüzde
            result *=30;
        }   // zaten burada hatchback araç olma ihtimali yok sadece günlük alınabilir hatchback
        return result;   // ücreti dön
    }
}


