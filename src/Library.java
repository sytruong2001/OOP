/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import DatabaseConnection.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class Library {
    private final List<Customer> listReaders = new ArrayList<>();

    public List<Customer> getReaders() {
        Connect dcm = new Connect("localhost:80", "oop", "root", "");
        
        String sql = "SELECT * FROM customer";
        try ( Connection connection = dcm.getConnection();  Statement statement = connection.createStatement();) {
            try ( ResultSet resultSet = statement.executeQuery(sql);) {
                this.listReaders.add(Customer.createObject(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
        return listReaders;

    }
    
    public float CalculateTheAmount (){
        for (Customer cal : this.listReaders) {
            System.out.println(cal.calculate());
        }    
        return 0;
    }
}
