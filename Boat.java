public class Boat {
    private String registrationNum;
    private double size;
    private String fuelType;

    /**
     * Default Boat Constructor
     */
    public Boat(){
        registrationNum = "";
        size = 0;
        fuelType = null;
    }

    /**
     * Constructor for Boat
     * @param regNum        value registrationNum is set to
     * @param sizeInput     value Size is set to
     * @param fuel          value fuelType is set to
     */
    public Boat(String regNum, Double sizeInput, String fuel){
        registrationNum = regNum;
        size = sizeInput;
        fuelType = fuel;
    }

    /**
     * Gets registrationNumber
     * @return registrationNum
     */
    public String getRegistrationNum(){
        return registrationNum;
    }

    /**
     * Gets boat size(length)
     * @return  size
     */
    public Double getSize(){
        return size;
    }

    /**
     * Gets fuelType
     * @return  fuelType
     */
    public String getFuelType(){
        return fuelType;
    }

    /**
     * sets registrationNum
     * @param regNum value registrationNum is set to
     */
    public void setRegistrationNum(String regNum){
        registrationNum = regNum;
    }

    /**
     * sets size
     * @param sizeInput value size is set to
     */
    public void setSize(Double sizeInput){
        size = sizeInput;
    }

    /**
     * sets fuelType
     * @param fuel value fuelType is set to
     */
    public void setFuelType(String fuel){
        fuelType = fuel;
    }

    public String toString(){
        return "Registration Number: " + registrationNum + "\n" +
                "Size: " + size + "\n" +
                "Fuel Type: " + fuelType;
    }
}
