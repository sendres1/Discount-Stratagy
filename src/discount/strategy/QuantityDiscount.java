/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 *
 * @author sendres1
 */
public class QuantityDiscount implements DiscountStrategy {
    private double amount;
    private int quantity;
    private double unitPrice;
   // private values =[5,10,20,100];

    
    public double calcDiscountAmt(){
//        switch (month) {
//            case 1:  monthString = "January";
//                     break;
//            case 2:  monthString = "February";
        
        if (quantity > 100)
                amount = quantity * .10;
        else   if (quantity > 20)
                amount = quantity * .05; 
                else amount = 0;
        
        return amount;
        
    }
        
    
}

    
