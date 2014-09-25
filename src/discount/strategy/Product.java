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
    private double unitPrice;  
    private String productId;
    private String productDesc;

    public Product(double unitPrice, String productId, String productDesc) {
        this.unitPrice = unitPrice;
        this.productId = productId;
        this.productDesc = productDesc;
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

