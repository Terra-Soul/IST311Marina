import javax.swing.*;
import java.sql.*;

public class MarinaDatabase {
    static final String DATABASE_URL = "jdbc:ucanaccess://C:/Users/ambergholson/Desktop/Marina.accdb";
    Connection connection = null;
    Statement statement = null;
    ResultSet rSet = null;
    PreparedStatement searchCustByName = null;
    PreparedStatement findPersonByLName = null;
    PreparedStatement addNewCust = null;
    PreparedStatement addNewPowerBoat = null;
    PreparedStatement addNewSailBoat = null;
    PreparedStatement addNewLease = null;
    PreparedStatement addNewMaintenance = null;
    

    public MarinaDatabase(){
        try{
            connection = DriverManager.getConnection(DATABASE_URL);
            System.out.println("Made a connection to the database");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet searchCustByName(String fName, String lName) {
        try
        {
            searchCustByName = connection.prepareStatement(
                    "SELECT firstName, lastName, boatingLicense FROM Customer WHERE firstName = ? AND lastName = ?");

            searchCustByName.setString(1, fName);
            searchCustByName.setString(2, lName);

            rSet = searchCustByName.executeQuery();

            return rSet;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
            return rSet;
        }
    }

    public void addNewCust(int license, String fName, String lName){
        try{
            addNewCust = connection.prepareStatement("INSERT INTO CUSTOMER(boatingLicense, firstName, lastName) VALUES(?, ?, ?)");

            addNewCust.setInt(1, license);
            addNewCust.setString(2, fName);
            addNewCust.setString(3, lName);

            System.out.println("Customer added!");
            int ans = addNewCust.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void addNewPowerBoat(int registrationNum, int size, String fuelType, int numEngines, String engineType){
        try{
            addNewPowerBoat = connection.prepareStatement("INSERT INTO POWERBOAT(registrationNum, size, fuelType, numEngines, engineType) VALUES(?, ?, ?, ?, ?)");

            addNewPowerBoat.setInt(1, registrationNum);
            addNewPowerBoat.setInt(2, size);
            addNewPowerBoat.setString(3, fuelType);
            addNewPowerBoat.setInt(4, numEngines);
            addNewPowerBoat.setString(5, engineType);
           

            System.out.println("Power Boat added!");
            int ans = addNewPowerBoat.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void addNewSailBoat(int registrationNum, int size, String fuelType, int keelHeight, boolean hasEngine, int sailNum){
        try{
            addNewSailBoat = connection.prepareStatement("INSERT INTO SAILBOAT(registrationNum, size, fuelType, keelHeight, hasEngine, sailNum) VALUES(?, ?, ?, ?, ?, ?)");

            addNewSailBoat.setInt(1, registrationNum);
            addNewSailBoatt.setInt(2, size);
            addNewSailBoat.setString(3, fuelType);
            addNewSailBoat.setInt(4, keelHeight);
            addNewSailBoat.setBoolean(5, hasEngine);
            addNewSailBoat.setInt(6, sailNum);
           

            System.out.println("Sail Boat added!");
            int ans = addNewSailBoat.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void addNewLease(int slipNumber, int slotNumber, int duration, double rate, String expirationDate){
        try{
            addNewLease = connection.prepareStatement("INSERT INTO LEASE(slipNumber, slotNumber, duration, rate, expirationDate) VALUES(?, ?, ?, ?, ?)");

            addNewLease.setInt(1, slotNumber);
            addNewLease.setInt(1, slotNumber);
            addNewLease.setInt(1, duration);
            addNewLease.setDouble(2, rate);
            addNewLease.setString(3, expirationDate);
            
            System.out.println("Lease Created!");
            int ans = addNewLease.executeUpdate();
            
            //possible location for boatLeases and customerLeases code
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void addNewMaintenance(int invoiceNum, String dateOfMaintenance, String workDone){
        try{
            addNewMaintenance = connection.prepareStatement("INSERT INTO MAINTENANCE(invoiceNum, dateOfMaintenance, workDone) VALUES(?, ?, ?)");

            addNewMaintenance.setInt(1, invoiceNum);
            addNewMaintenance.setString(2, dateOfMaintenance);
            addNewMaintenance.setString(3, workDone);

            System.out.println("Maintenance record created!");
            int ans = addNewMaintenance.executeUpdate();
            
            //possible location for boatMaintenance code
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
