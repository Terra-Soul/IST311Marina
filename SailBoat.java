
public class SailBoat extends Boat{
    private int sailNum;
    private boolean hasEngine;
    private double keelHeight;

    /**
     * Default Constructor
     */
    public SailBoat(){
        sailNum = 0;
        hasEngine = false;
        keelHeight = 0;
    }

    /**
     *
     * @param regNum    registrationNum of the SailBoat (inherited from Boat)
     * @param size      size of the SailBoat (inherited from Boat)
     * @param fuelType  fuelType of the SailBoat (inherited from Boat)
     * @param sails      of the Sailboat
     * @param hasEng    sets the hasEngine of the SailBoat
     * @param keelH     sets the keelHeight of the SailBoat
     */
    public SailBoat(String regNum, double size, String fuelType, int sails, boolean hasEng, double keelH){
        this.setRegistrationNum(regNum);
        this.setSize(size);
        this.setFuelType(fuelType);
        sailNum = sails;
        hasEngine = hasEng;
        keelHeight = keelH;
    }

    /**
     * gets the sailNum
     * @return sailNum
     */
    public int getSailNum(){
        return sailNum;
    }

    /**
     * gets the hasEngine value
     * @return hasEngine
     */
    public boolean getHasEngine(){
        return hasEngine;
    }

    /**
     * gets the keelHeight value
     * @return keelHeight
     */
    public double getKeelHeight(){
        return keelHeight;
    }

    /**
     * sets the SailNum
     * @param sails sets the sailNum
     */
    public void setSailNum(int sails){
        sailNum = sails;
    }

    /**
     * sets the hasEngine
     * @param hasEng sets the hasEngine
     */
    public void setHasEngine(boolean hasEng){
        hasEngine = hasEng;
    }

    /**
     * sets the keelHeight
     * @param keelH sets the keelHeight
     */
    public void setKeelHeight(double keelH){
        keelHeight = keelH;
    }

    public String toString(){
        return super.toString() + "\n" +
                "Sail Num: " + sailNum + "\n" +
                "Has Engine: " + hasEngine + "\n" +
                "Keel Height: " + keelHeight;
    }
}
