/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 ** Customer class instantiates a customer with a customer number and name
 * 
 * @author sendres1
 * @version 1.05
 */
public class Customer {
    private int customerNum;
    private String customerName;

    public Customer(int customerNum, String customerName) {
        setCustomerNum(customerNum);
        setCustomerName(customerName);
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

   
    public final void setCustomerName(String customerName) throws IllegalArgumentException {
        if (customerName == null || customerName.isEmpty()){
            throw new IllegalArgumentException("invalid customer name");}
                   this.customerName = customerName;
    }

    public void setCustomerNum(int customerNum) throws IllegalArgumentException {
        if (customerNum <= 0) {
            throw new IllegalArgumentException("invalid CustomerNum");}
        this.customerNum = customerNum;
    }
    
    
    
    
    
    
}
