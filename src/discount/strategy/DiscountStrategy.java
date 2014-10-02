/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 * DiscountStrategy interface uses various discount arrangements.
 * @author sendres1
 * @version 1.15
 */
public interface DiscountStrategy {
    public abstract double calcDiscountAmt(LineItem item);
}
