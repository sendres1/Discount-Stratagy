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
public class Product {
     
    private String productId;
    private String productDesc;
    private double unitPrice; 
   // private double discountAmt;
    private DiscountStrategy strategy;

    public Product(String productId, String productDesc, double unitPrice, DiscountStrategy strategy) {
        this.unitPrice = unitPrice;
        this.productId = productId;
        this.productDesc = productDesc;
        this.strategy = strategy;
        
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public double getDiscountAmt(LineItem item) {
    //????????????????????????
        return strategy.calcDiscountAmt(item);
    }
    
    

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
    
    
    
    
    
    
}

