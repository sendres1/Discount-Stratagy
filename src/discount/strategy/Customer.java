/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 *
 * @author sendres1
 * @version 1.05
 */
public class Customer {
    private int customerNum;
    private String customerName;

    public Customer(int customerNum, String customerName) {
        this.customerNum = customerNum;
        this.customerName = customerName;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

   
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
    
    
    
    
}
