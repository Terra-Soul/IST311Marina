import javax.swing.*;
import java.sql.*;

public class MarinaDatabase {
    static final String DATABASE_URL = "jdbc:ucanaccess://V:/Desktop/Company.accdb"; //jdbc:ucanaccess://X:My Documents/Company.accdb
    Connection connection = null;
    Statement statement = null;
    ResultSet rSet = null;
    PreparedStatement searchCustByName = null;
    PreparedStatement findPersonByLName = null;
    PreparedStatement addNewCust = null;

    public MarinaDatabase(){
        try{
            Connection connection = DriverManager.getConnection(DATABASE_URL);
            System.out.println("Made a connection to the database");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet searchCustByName(String fName, String lName) {
        try
        {

            searchCustByName = connection.prepareStatement("SELECT FirstName, LastName, BoatingLicense FROM Customer WHERE FirstName = ? and LastName = ?");

            searchCustByName.setString(1, fName);
            searchCustByName.setString(2, lName);

            rSet = searchCustByName.executeQuery();

            return rSet;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return rSet;
        }
    }

    public void addNewCust(int license, String fName, String lName){
        try{
            addNewCust = connection.prepareStatement("INSERT INTO CUSTOMER(boatingLicense, firstName, lastName) VALUES(?, ?, ?)");

            int ans = addNewCust.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
