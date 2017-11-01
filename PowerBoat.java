public class PowerBoat extends Boat{
    private int engineNum;
    private String engineType;

    public PowerBoat(){
        engineNum = 0;
        engineType = "";
    }

    public PowerBoat(String regNum, double size, String fuelType, int engNum, String engType){
        this.setRegistrationNum(regNum);
        this.setSize(size);
        this.setFuelType(fuelType);
        engineNum = engNum;
        engineType = engType;
    }

    public int getEngineNum(){
        return engineNum;
    }

    public String getEngineType(){
        return engineType;
    }

    public void setEngineNum(int engNum){
        engineNum = engNum;
    }

    public void setEngineType(String engType){
        engineType = engType;
    }

    public String toString(){
        return super.toString() + "\n" +
                "Number of Engines: " + engineNum + "\n" +
                "Engine Type: " + engineType;
    }
}
