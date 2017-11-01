public class Lease {
    private double rate;
    private String duration;
    private int slipNumber;

    public Lease(){
        rate = 0;
        duration = "";
        slipNumber = 0;
    }

    public Lease(double rateInput, String dura, int slipNum){
        rate = rateInput;
        duration = dura;
        slipNumber = slipNum;
    }

    public double getRate(){
        return rate;
    }

    public String getDuration(){
        return duration;
    }

    public int getSlipNumber(){
        return slipNumber;
    }

    public void setRate(double rateInput){
        rate = rateInput;
    }

    public void setDuration(String dura){
        duration = dura;
    }

    public void setSlipNumber(int slipNum){
        slipNumber = slipNum;
    }

    public double calculatePayment(int days){
        return rate * days;
    }

    public String toString(){
        return "Slip Number: " + slipNumber + "\n" +
                "Rate: " + rate +"\n" +
                "Duration: " + duration;
    }
}
