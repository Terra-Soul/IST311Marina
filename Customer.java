import java.util.ArrayList;

public class Customer {
    private int boatingLicense;
    private String firstName;
    private String lastName;
    private ArrayList<Lease> leases;

    public Customer(){
        boatingLicense = -1;
        firstName = "";
        lastName = "";
        leases = new ArrayList<>();
    }

    public Customer(int license, String fName, String lName){
        boatingLicense = license;
        firstName = fName;
        lastName = lName;
        leases = new ArrayList<>();
    }

    public int getId(){
        return boatingLicense;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public ArrayList<Lease> getLeases(){
        return leases;
    }

    public Lease getLease(int leaseNum){
        for(int i = 0; i < leases.size(); i++){
            if (leases.get(i).getSlipNumber() == leaseNum){
                return leases.get(i);
            }
        }
        return null;
    }

    public void addLease(Lease leaseToAdd){
        leases.add(leaseToAdd);
    }

    public void removeLease(Lease leaseToRemove){
        for(int i = 0; i < leases.size(); i++){
            if (leases.get(i).getSlipNumber() == leaseToRemove.getSlipNumber()){
                leases.remove(i);
            }
        }
    }

    public void setBoatingLicense(int license){
        boatingLicense = license;
    }

    public void setFirstName(String fName){
        firstName = fName;
    }

    public void setLastName(String lName){
        lastName = lName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

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
