package JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@xe", "root", "Pass@123");
            System.out.println("Connection Stablished sscesfully");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
