import java.util.Scanner;

public class passangerService {
    private String passangerName;
    private String passangerTckn;
    private String passangerPhone;



    public void passangerInf(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayın yolcumuz lütfen isminizi giriniz: ");
        setPassangerName(input.nextLine());
        System.out.print("Sayın yolcumuz lütfen TCKN giriniz: ");
        setPassangerTckn(input.nextLine());
        System.out.print("Sayın yolcumuz lütfen telefon giriniz: ");
        setPassangerTckn(input.nextLine());

    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public String getPassangerTckn() {
        return passangerTckn;
    }

    public void setPassangerTckn(String passangerTckn) {
        this.passangerTckn = passangerTckn;
    }

    public String getPassangerPhone() {
        return passangerPhone;
    }

    public void setPassangerPhone(String passangerPhone) {
        this.passangerPhone = passangerPhone;
    }
}
