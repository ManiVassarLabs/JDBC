package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             String url = "jdbc:mysql://localhost:3306/workspace";
             Connection con = DriverManager.getConnection(url, "root", "root");
            Statement stm = con.createStatement();
            String query = "select * from user_details";
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                System.out.println(rs.getString("email"));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
