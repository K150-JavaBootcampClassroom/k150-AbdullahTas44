import java.util.Scanner;

public abstract class customer {   // abstract müşteri classı
    private String name;   // isim
    private int phoneNumber;  // telefon
    private String address;  // adres
    public customer(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }
    // bana sadece bilgileri getirmek lazım olduğundan sadece get metotlarını kullandım
    public String getName() {
        return name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }


}



