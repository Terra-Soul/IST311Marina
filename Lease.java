public class Lease {
    private double rate;
    private int duration;
    private int slipNumber;

    /**
     * default constructor
     */
    public Lease(){
        rate = -1;
        duration = -1;
        slipNumber = -1;
    }

    /**
     * Lease constructor
     * @param rateInput = rate charged to the customer per unit of time (day/month)
     * @param dura = duration, the length of time the customer is using this marina spot
     * @param slipNum = the uniqueID of the lease
     */
    public Lease(double rateInput, int dura, int slipNum){
        rate = rateInput;
        duration = dura;
        slipNumber = slipNum;
    }

    /**
     * gets the rate the customer is being charged per unit of time
     * @return rate
     */
    public double getRate(){
        return rate;
    }

    /**
     * gets the length of time the customer will be using this spot of the marina
     * @return duration
     */
    public int getDuration(){
        return duration;
    }

    /**
     * gets the unique ID of the lease
     * @return slipNumber
     */
    public int getSlipNumber(){
        return slipNumber;
    }

    /**
     * sets the rate the customer pays per unit of time
     * @param rateInput value rate is set to
     */
    public void setRate(double rateInput){
        rate = rateInput;
    }

    /**
     * Sets the duration the customer is staying at their marina slot
     * @param dura the duration of time the customer is staying
     */
    public void setDuration(int dura){
        duration = dura;
    }

    /**
     * sets the slip number of the customer
     * @param slipNum the value the slip Number is changed to
     */
    public void setSlipNumber(int slipNum){
        slipNumber = slipNum;
    }

    /**
     * Calculates how much the customer is required to pay
     * @return rate * duration
     */
    public double calculatePayment(){
        return rate * duration;
    }

    /**
     * @return slipNumber, then Rate, then duration, all on seperate lines.
     */
    public String toString(){
        return "Slip Number: " + slipNumber + "\n" +
                "Rate: " + rate +"\n" +
                "Duration: " + duration;
    }
}
