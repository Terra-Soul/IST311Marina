import java.util.ArrayList;

public class Customer {
    private int boatingLicense;
    private String firstName;
    private String lastName;
    private ArrayList<Lease> leases;

    /**
     * Default constructor
     */
    public Customer(){
        boatingLicense = -1;
        firstName = "";
        lastName = "";
        leases = new ArrayList<>();
    }

    /**
     * Construcor for Customer
     * @param license value given to boatingLicesnce
     * @param fName value given to firstName
     * @param lName value given to lastName
     */
    public Customer(int license, String fName, String lName){
        boatingLicense = license;
        firstName = fName;
        lastName = lName;
        leases = new ArrayList<>();
    }

    /**
     * Gets the boating License
     * @return boatingLicense
     */
    public int getId(){
        return boatingLicense;
    }

    /**
     * Gets the first name
     * @return firstName
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Gets the last Name
     * @return lastName
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Gets all of the leases held by the customer
     * @return ArrayList of leases
     */
    public ArrayList<Lease> getLeases(){
        return leases;
    }

    /**
     * Gets the lease of a customer
     * @param leaseNum The leaseNum of the lease
     * @return the lease with the corresponding leaseNum
     */
    public Lease getLease(int leaseNum){
        for(int i = 0; i < leases.size(); i++){
            if (leases.get(i).getSlipNumber() == leaseNum){
                return leases.get(i);
            }
        }
        return null;
    }

    /**
     * adds a lease to the customers leases list
     * @param leaseToAdd lease that is added to the customers list
     */
    public void addLease(Lease leaseToAdd){
        leases.add(leaseToAdd);
    }

    /**
     * Removes a lease from the customers leases list
     * @param leaseToRemove is the slipNumber of the lease to remove
     */
    public void removeLease(Lease leaseToRemove){
        for(int i = 0; i < leases.size(); i++){
            if (leases.get(i).getSlipNumber() == leaseToRemove.getSlipNumber()){
                leases.remove(i);
            }
        }
    }

    /**
     * sets the boating license of a customer
     * @param license the license number to be changed to
     */
    public void setBoatingLicense(int license){
        boatingLicense = license;
    }

    /**
     * sets the first name of a customer
     * @param fName is the first name
     */
    public void setFirstName(String fName){
        firstName = fName;
    }

    /**
     * sets the last name of a customer
     * @param lName is the last name
     */
    public void setLastName(String lName){
        lastName = lName;
    }

    /**
     * gets the name of the customer
     * @return firstName and lastName seperated by a single space
     */
    public String getName(){
        return firstName + " " + lastName;
    }

    /**
     * String format of the customer
     * @return firstName, lastName and then all of the leases held under that customers name
     */
    public String toString(){
        StringBuilder output = new StringBuilder("Boating License: " + boatingLicense + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n");

        //Adding the data of each lease to the string to return
        for (int i = 0; i < leases.size(); i++){
            output.append(leases.get(i).toString());
        }

        return output.toString();
    }
}
