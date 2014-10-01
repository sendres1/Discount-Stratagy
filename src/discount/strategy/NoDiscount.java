/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;
         
/**
 *
 * @author sendres1
 * @version 1.30
 */
public  class NoDiscount implements DiscountStrategy {
    
  
    @Override
    public double calcDiscountAmt(LineItem item){
        return 0;
    }
}


