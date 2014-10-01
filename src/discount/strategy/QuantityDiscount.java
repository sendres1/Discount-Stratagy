/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discount.strategy;

/**
 *
 * @author sendres1
 * @version 1.45
 */
public class QuantityDiscount implements DiscountStrategy {

    
    @Override
    public double calcDiscountAmt(LineItem item) {
        double discountAmt;
        int quantity = item.getQty();
        double unitPrice = item.getProduct().getUnitPrice();
        int FIRST_QTY_BREAK = 20;
        double FIRST_QTY_DISCOUNT = .05;
        int SECOND_QTY_BREAK = 100;
        double SECOND_QTY_DISCOUNT = .10;

        if (quantity > SECOND_QTY_BREAK) {
            discountAmt = quantity * unitPrice * SECOND_QTY_DISCOUNT;
        } else if (quantity > FIRST_QTY_BREAK) {
            discountAmt = quantity * unitPrice * FIRST_QTY_DISCOUNT;
        } else {
            discountAmt = 0;
        }

        return discountAmt;

    }

}
