package Practice.ArrayConcept.Practice2;

import java.sql.*;

public class DataBaseConnection {

    public static void main (String [] args){


        try {
            Class.forName("com.mysql.jdbc.driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost 3306/student/","root","ashok4870");

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from student");
                while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));

                stmt.close();
                rs.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
