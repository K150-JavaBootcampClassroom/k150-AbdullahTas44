public class UpdateStock {

    public boolean checkStock (String name,double kg){  // Stokları kontrol etmek için kullanılan metot
        if (name.equals("Elma")){
            Apple apple = new Apple("Elma","Beyaz");
            if(apple.getStock() > kg){  // yeterli stok var mı
                return true;
            }else{
                return false;
            }
        }else if(name.equals("Armut")){
            Pear pear = new Pear("Pear","Sarı");
            if(pear.getStock() > kg){  // yeterli stok var mı
                return true;
            }else{
                return false;
            }
        }else if(name.equals("Kiraz")){
            Cherry cherry = new Cherry("Pear","Sarı");
            if(cherry.getStock() > kg){  // yeterli stok var mı
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

    public void setStock(String name,double kg){  // Stokları güncellemek için kullanılan metot
        if (name.equals("Elma")){
            Apple apple = new Apple("Elma","Beyaz");
            apple.setStock(kg);  // gönderilen kg ile stok güncellenir
        }else if(name.equals("Armut")){
            Pear pear = new Pear("Pear","Sarı");
            pear.setStock(kg);  // gönderilen kg ile stok güncellenir
        }else if(name.equals("Kiraz")){
            Cherry cherry = new Cherry("Pear","Sarı");
            cherry.setStock(kg);  // gönderilen kg ile stok güncellenir
        }
    }

    public double getStock(String name){   // Stokları görüntülemek için kullanılan metot
        if (name.equals("Elma")){
            Apple apple = new Apple("Elma","Beyaz");
            return apple.getStock();  // mevcut stok dönderilir
        }else if(name.equals("Armut")){
            Pear pear = new Pear("Pear","Sarı");
            return pear.getStock(); // mevcut stok dönderilir
        }else if(name.equals("Kiraz")){
            Cherry cherry = new Cherry("Pear","Sarı");
            return cherry.getStock();  // mevcut stok dönderilir
        }
        return 0.0;
    }


}
