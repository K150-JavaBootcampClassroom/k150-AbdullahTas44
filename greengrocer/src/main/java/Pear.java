public class Pear extends Fruits{
    private double stock=75;
    private double price;

    public Pear(String name, String color) {
        super(name, color);
        this.price=15.0;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price; // fiyat güncellenir
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double kg) {
        this.stock += kg;  // yeni gelen kg stoka eklenir - (eksi) geldi ise çıkarılır
    }
}
