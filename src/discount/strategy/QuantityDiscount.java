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
public  class QuantityDiscount implements DiscountStrategy {
    


    // private values =[5,10,20,100];
    


    
    @Override
    public double calcDiscountAmt(LineItem item){
        double discountAmt;
        int quantity = item.getQty();
        double unitPrice = item.getProduct().getUnitPrice();
        
//        switch (month) {
//            case 1:  monthString = "January";
//                     break;
//            case 2:  monthString = "February";
        
        if (quantity > 100)
                discountAmt = quantity * unitPrice * .10;
        else   if (quantity > 20)
                discountAmt = quantity * unitPrice * .05; 
                else discountAmt = 0;
        
        return discountAmt;
        
    }
        
    
}

    
