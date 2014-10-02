/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 ** POSRegister concrete class instantiates store and receipt object to 
 *  facilitate a sale
 * @author sendres1
 * @version 1.35
 */
public class POSRegister {
//   private String ProductID;
//   private int    qty;
//   private Customer customer;
//   private String discount; 
   private Store store;
   private Receipt receipt;

//    public POSRegister(Customer customer, Store store) {
//        this.customer = customer;
//        this.store  = store;
//    }

    public POSRegister(int custId, Store store, DataAccessStrategy db) {
        this.receipt = new Receipt(store, custId, db);
        this.store  = store;
    }

     public void additem(String prodId, int qty, DataAccessStrategy db){
//         LineItem item = new LineItem(product, qty);
         LineItem item = new LineItem(prodId, qty, db);
         this.receipt.addLineItem(item);
     }
     
     
     public void endSale(){
         this.receipt.printReceipt();         
     }

//    public String getProductID() {
//        return ProductID;
//    }

//    public void setProductID(String ProductID) {
//        this.ProductID = ProductID;
//    }

//    public int getQty() {
//        return qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    public Customer getCustomerno() {
//        return this.customer;
//    }
//
//    public void setCustomerno(Customer customer) {
//        this.customer = customer;
//    }
//
//    public String getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(String discount) {
//        this.discount = discount;
//    }
    
//    public void newReceipt(){
//        this.receipt = new Receipt(this.store, this.customer);
//     } 
    
//     public void additem(Product product, int qty){
//         LineItem item = new LineItem(product, qty);
//         
//         this.receipt.addLineItem(item);
//     }
             
}
