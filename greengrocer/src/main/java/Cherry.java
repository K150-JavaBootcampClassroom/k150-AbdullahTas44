public class Cherry extends Fruits{

    private double stock=50;
    private double price;

    public Cherry(String name, String color) {
        super(name, color);
        this.price=20.0;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;  // fiyat güncellenir
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double kg) {
        this.stock += kg;  // yeni gelen kg stoka eklenir - (eksi) geldi ise çıkarılır
    }

}
