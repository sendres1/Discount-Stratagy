package discount.strategy;

import java.text.NumberFormat;
import java.util.Arrays;

/**
 * Just a start and test class for this program. You may modify this class in
 * any way you see fit.
 *
 * @author sendres1
 * @version 1.100
 */
public class Startup {

    public static void main(String[] args) {

        DataAccessStrategy db = new FakeDatabase();

        Store store = new Store(9102, "Kohls Brookfield Store");
//        Customer customer = db.getCustomerByID(1); //new Customer(1,"Endres" );

//        POSRegister reg = new POSRegister(customer, store);
        POSRegister reg = new POSRegister(1, store, db);
      //  reg.newReceipt();
        
       // Store store, int custId, DataAccessStrategy db
//        reg.additem(fd.getProductByID("A"), 100);
  //      public void additem(String prodId, int qty, DataAccessStrategy db){
        reg.additem("A", 100, db);
        reg.additem("B", 99, db);
        reg.endSale();

        
        Customer c2 = db.getCustomerByID(2); //new Customer(1,"Endres" );
        POSRegister reg2 = new POSRegister(1, store, db);
      //  reg2.newReceipt();
        reg2.additem("B", 100, db);
        reg2.additem("A", 99, db);
        reg2.endSale();

    }
//
}
