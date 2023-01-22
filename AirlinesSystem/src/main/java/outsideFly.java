public class outsideFly implements ticketService {

    public double calculateDomestic(int person){
        return person * 0.0;
    }

    public double calculateOutside(int person){
        return person * 500;
    }

    public double calculateOutsideBusiness(int person){
        return person*1500;
    }

}
