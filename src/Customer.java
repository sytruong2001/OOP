/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class Customer {
    private String fullname;
    private String address;
    private int phone;
    private float moneyNumber;
    private float percentageOfDiscount;
    private float tax;
    
    public Customer(){
    }

    public Customer(String fullname, String address, int phone, float moneyNumber, float percentageOfDiscount, float tax) {
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.moneyNumber = moneyNumber;
        this.percentageOfDiscount = percentageOfDiscount;
        this.tax = tax;
    }
    
    public String getFullName(){
        return fullname;
    }
    public void setFullName(String fullname){
        this.fullname = fullname;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    
    public float getMoneyNumber(){
        return moneyNumber;
    }
    public void setMoneyNumber(float moneyNumber){
        this.moneyNumber = moneyNumber;
    }
    
    public float getPercentageOfDiscount(){
        return percentageOfDiscount;
    }
    public void setPercentageOfDiscount(float percentageOfDiscount){
        this.percentageOfDiscount = percentageOfDiscount;
    }
    
    public float getTax(){
        return tax;
    }
    public void setTax(float tax){
        this.tax = tax;
    }
    
    public float calculate() {
        return this.moneyNumber - this.percentageOfDiscount + this.percentageOfDiscount * this.tax;
    }
    
    public static Customer createObject(ResultSet resultSet) throws SQLException {
        String fullname = resultSet.getString("fullname");
        String address = resultSet.getString("address");
        int phone = resultSet.getInt("phone");
        float moneyNumber = resultSet.getFloat("phone");
        float percentageOfDiscount = resultSet.getFloat("percentageOfDiscount");
        float tax = resultSet.getFloat("tax");

        return new Customer(fullname, address,phone, moneyNumber, percentageOfDiscount,tax);
    }
}
