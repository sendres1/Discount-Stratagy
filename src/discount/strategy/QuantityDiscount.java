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
    private int firstQtyBreak = 20;
    private double firstQtyDiscount = .05;

    public QuantityDiscount(int firstQtyBreak, double firstQtyDiscount) {
        this.firstQtyBreak = firstQtyBreak;
        this.firstQtyDiscount = firstQtyDiscount;
    }
    
    
    
    @Override
    public double calcDiscountAmt(LineItem item) {
        double discountAmt;
        int quantity = item.getQty();
        double unitPrice = item.getProduct().getUnitPrice();
//        int FIRST_QTY_BREAK = 20;
//        double FIRST_QTY_DISCOUNT = .05;
        int SECOND_QTY_BREAK = 100;
        double SECOND_QTY_DISCOUNT = .10;

        if (quantity > SECOND_QTY_BREAK) {
            discountAmt = quantity * unitPrice * SECOND_QTY_DISCOUNT;
        } else if (quantity > firstQtyBreak) {
            discountAmt = quantity * unitPrice * firstQtyDiscount;
        } else {
            discountAmt = 0;
        }

        return discountAmt;

    }

    public int getFirstQtyBreak() {
        return firstQtyBreak;
    }

    public void setFirstQtyBreak(int firstQtyBreak) {
        this.firstQtyBreak = firstQtyBreak;
    }

    public double getFirstQtyDiscount() {
        return firstQtyDiscount;
    }

    /**
     * Set the quantity discount rate for the first quantity break
     * @param firstQtyDiscount - the rate as a percent
     */
    public void setFirstQtyDiscount(double firstQtyDiscount) {
        if(firstQtyDiscount < 0) {
            throw new IllegalArgumentException();
        }
        this.firstQtyDiscount = firstQtyDiscount;
    }

}
