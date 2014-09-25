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
public class FakeDatabase {

    private Customer[] customerArray;
    private Product[] productArray;

//    private final customerArray = {"1", "endres"};
//    private final String [] productArray = new String[10];
//    
    public FakeDatabase() {
        customerArray = new Customer[2];
        productArray = new Product[2];
        customerArray[0] = new Customer(1, "Endres");
        customerArray[1] = new Customer(2, "Perez");
        productArray[0] = new Product(1.00, "A", "a product");
        productArray[1] = new Product(2.00, "B", "b product");

    }

}
