import java.util.ArrayList;

public class companies {

    private String companyName;
    private int taxNumber;
    private String seatNumber;


    public companies(String companyName, int taxNumber, String seatNumber) {
        this.companyName = companyName;
        this.taxNumber = taxNumber;
        this.seatNumber = seatNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTaxNumber() {
        return taxNumber;
    }


    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double buyDomesticTicket(){
        domesticFly d = new domesticFly();
        return d.calculateDomestic(1);

    }

    public double buyOutsideTicket(String seatNumber){
        seat s = new seat();
        outsideFly o = new outsideFly();
        if ("Business".equals(s.findSeat(seatNumber))){
            return o.calculateOutsideBusiness(1);
        }
        if ("Economic".equals(s.findSeat(seatNumber))){
            return o.calculateOutside(1);
        }
        return 0.0;
    }



}
