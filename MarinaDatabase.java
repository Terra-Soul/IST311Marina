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
}
