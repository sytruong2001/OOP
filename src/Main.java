/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.Scanner;
import project1_oop.SachThamKhao;

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
        String fullname, address;
        int phone;
        float tax, moneyNumber, percentOfDiscount;
        ArrayList<Customer> customer = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so luong khach hang:");
        int n = scanner.nextInt();
        for(int i=1; i<=n ; i++) {
            scanner.nextLine();
            System.out.println("Nhap thong tin cua khach hang thu "+i);
            System.out.println("Ho va ten:");
            fullname = scanner.nextLine();
            System.out.println("Dia chi:");
            address = scanner.nextLine();
            System.out.println("So dien thoai:");
            phone = scanner.nextInt();
            System.out.println("Tiền trước chiết khấu và thuế:");
            moneyNumber = scanner.nextFloat();
            System.out.println("Chiết khấu:");
            percentOfDiscount = scanner.nextFloat();
            System.out.println("Thuế:");
            tax = scanner.nextFloat();
            Customer customers = new Customer();
            customer.add(customers);
            System.out.println("Số tiền được trả thực tế: " + customers.CalculateTheAmount());
        }  
        
    }
    
}
