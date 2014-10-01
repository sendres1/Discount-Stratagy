/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 *
 * @author sendres1
 * @version 1.50
 */
public class Receipt {
    private Store store;
    private Customer customer;
     private LineItem[] lineItems;   
     double total;
     private String description;     
     int qty;
     String prodID;

   // private String customerID;

    ///will need to read the fake database and spin thru arrary matching on id


    //private String storeid; not needed just getstoredesc

     //declare variables  
 


    public Receipt(Store store, Customer customer) {
     
        this.store = store;
        this.customer = customer;
        this.lineItems = new LineItem[0];
        
   //     this.description = description;
   //     this.prodID = prodID;
   //     this.qty = qty;
     
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
   
    public void printReceipt(){
        printStore();
        printCustomer();
         printItems();
        printThanks();
        
    }
        
    public void printCustomer(){
        System.out.println("  Client:  " + this.customer.getCustomerName());
    }
    
    public void printStore(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Store: " + this.store.getStoreDesc()); 
                                              
    }
    
    public void printItems(){
        for(int i=0;i<lineItems.length;i++){
        System.out.println("Product: " + lineItems[i].getSubTotal());
        }
    }
    
    
    public void printThanks(){
        System.out.println("   THANKS ");
    }
    
    public void addLineItem(LineItem item){
        addToArray(item);
    }
    
    
    private void addToArray(final LineItem item) { 
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];       
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);     
        tempItems[lineItems.length] = item;
        lineItems = tempItems;    
    }
    
    }
    
    
    