/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

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
    
    public float CalculateTheAmount (){
        return this.moneyNumber - this.percentageOfDiscount + this.tax*this.moneyNumber;
    }
    
    @Override
	public String toString() {
		return "Fullname: " + this.fullname + ", Address: " + this.address + 
	            ", số điện thoại: " + this.phone + ", Tiền trả trước chiết khấu và thuế: " + this.moneyNumber +",Thuế:" +this.tax;
	}
}
