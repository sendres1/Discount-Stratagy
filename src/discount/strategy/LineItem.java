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
public class LineItem {

    public Product product;
    public int qty;

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
 
    
    
     public double getSubTotal(){
         
         return this.qty*this.product.getUnitPrice() - this.product.getDiscountAmt(this);
     }
    
   }