/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discount.strategy;

/**
 *
 * @author sendres1
 * @version 1.15
 */
public class FakeDatabase {

    public final Customer[] customerArray;
    public final Product[] productArray;

//    private final customerArray = {"1", "endres"};
//    private final String [] productArray = new String[10];
//    
    public FakeDatabase() {
        customerArray = new Customer[2];
        productArray = new Product[2];
        customerArray[0] = new Customer(1, "Endres");
        customerArray[1] = new Customer(2, "Perez");
        productArray[0] = new Product("A", "a product", 1.00, new NoDiscount());
        productArray[1] = new Product("B", "b product", 2.00, new QuantityDiscount());

    }

    public Customer[] getCustomerArray() {
        return customerArray;
    }

    public Product[] getProductArray() {
        return productArray;
    }
    
    
    public Customer getCustomerByID(int ID){
        for(int i =0;i<customerArray.length;i++){
            int tempID = customerArray[i].getCustomerNum();
            if(tempID == ID){
                return customerArray[i];                
            }
        }
        throw new IllegalArgumentException("Invalid customer ID");
                
    }
    
    public Product getProductByID(String ID){
        for(int i =0;i<productArray.length;i++){
            String prodID = productArray[i].getProductId();
            if(prodID == ID){
                return productArray[i];                
            }
        }
        throw new IllegalArgumentException("Invalid product ID");
                
    }
    
  

}
