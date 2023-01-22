import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class seat {

    private HashMap<String, Boolean> seatBusiness;{
        seatBusiness= new HashMap<>();
        seatBusiness.put("1A",false);
        seatBusiness.put("1B",false);
        seatBusiness.put("1C",true);
        seatBusiness.put("1D",false);
        seatBusiness.put("2A",false);
        seatBusiness.put("2B",true);
        seatBusiness.put("2C",false);
        seatBusiness.put("2D",true);
    }
    private HashMap<String, Boolean> seatEconomic;{

        seatEconomic = new HashMap<>();

        seatEconomic.put("3A",false);
        seatEconomic.put("3B",false);
        seatEconomic.put("3C",false);
        seatEconomic.put("3D",false);
        seatEconomic.put("4A",false);
        seatEconomic.put("4B",false);
        seatEconomic.put("4C",false);
        seatEconomic.put("4D",false);
        seatEconomic.put("5A",false);
        seatEconomic.put("5B",false);
        seatEconomic.put("5C",false);
        seatEconomic.put("5D",false);
        seatEconomic.put("6A",false);
        seatEconomic.put("6B",false);
        seatEconomic.put("6C",false);
        seatEconomic.put("6D",false);
        seatEconomic.put("7A",false);
        seatEconomic.put("7B",false);
        seatEconomic.put("7C",false);
        seatEconomic.put("7D",false);
        seatEconomic.put("8A",false);
        seatEconomic.put("8B",false);
        seatEconomic.put("8C",false);
        seatEconomic.put("8D",false);
        seatEconomic.put("9A",false);
        seatEconomic.put("9B",false);
        seatEconomic.put("9C",false);
        seatEconomic.put("9D",false);
        seatEconomic.put("10A",false);
        seatEconomic.put("10B",false);
        seatEconomic.put("10C",false);
        seatEconomic.put("10D",false);

    }

    public void printSeatEconomic() {
        for (Map.Entry<String, Boolean> entry : this.seatEconomic.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

    public void printSeatBusiness() {
        for (Map.Entry<String, Boolean> entry : this.seatBusiness.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

    public String findSeat(String seatNumber){
        System.out.println("Gelen koltuk numarası :"  + seatNumber);
        if (seatBusiness.containsKey(seatNumber)){
            return "Business";
        }

        if (seatEconomic.containsKey(seatNumber)){
            return "Economic";
        }

        return "Bilet bulunamadı";

    }


}
