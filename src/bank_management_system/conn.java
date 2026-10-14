package bank_management_system;
 import java.sql.*;
public class conn {

    Connection c;
    public conn () {
        try {
            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
