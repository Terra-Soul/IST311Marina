public class PowerBoat extends Boat{
    private int engineNum;
    private String engineType;

    /**
     * Default Constructor
     */
    public PowerBoat(){
        engineNum = 0;
        engineType = "";
    }

    /**
     * Constructor of a power boat
     * @param regNum    Sets the registration number of a boat
     * @param size      describes the size of the boat(length)
     * @param fuelType  Describes the type of fuel that the boat uses
     * @param engNum    Number of engines the power boat has
     * @param engType   The type of engine(s) the power boat uses
     */
    public PowerBoat(String regNum, double size, String fuelType, int engNum, String engType){
        this.setRegistrationNum(regNum);
        this.setSize(size);
        this.setFuelType(fuelType);
        engineNum = engNum;
        engineType = engType;
    }

    /**
     * gets the number of engines the power boat has
     * @return engineNum
     */
    public int getEngineNum(){
        return engineNum;
    }

    /**
     * Gets the type of engine(s) used
     * @return engineType
     */
    public String getEngineType(){
        return engineType;
    }

    /**
     * Sets the number of engine(s) used
     * @param engNum number of engine(s) used
     */
    public void setEngineNum(int engNum){
        engineNum = engNum;
    }

    /**
     * Sets the type of engine(s) used
     * @param engType Type of engine(s) used
     */
    public void setEngineType(String engType){
        engineType = engType;
    }

    /**
     *
     * @return Number of engines on a single line, followed by engine type on another.
     */
    public String toString(){
        return super.toString() + "\n" +
                "Number of Engines: " + engineNum + "\n" +
                "Engine Type: " + engineType;
    }
}
