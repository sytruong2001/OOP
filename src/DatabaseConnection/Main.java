/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

import java.sql.*;
/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connect dbc = new Connect("localhost:80", "oop", "root", "");

//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
        String sql = "SELECT * FROM customer";

        try ( Connection connection = dbc.getConnection();  Statement statement = connection.createStatement();  ResultSet resultSet = statement.executeQuery(sql);) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("fullname"));
            }

        } catch (SQLException e) {

            e.printStackTrace(System.err);

        }
    }
    
}
