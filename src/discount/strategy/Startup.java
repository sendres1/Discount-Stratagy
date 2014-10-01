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

        FakeDatabase fd = new FakeDatabase();

        Store s = new Store(9102, "Kohls Brookfield Store");
        Customer c = fd.getCustomerByID(1); //new Customer(1,"Endres" );

        POSRegister reg = new POSRegister(c, s);
        reg.newReceipt();
        reg.additem(fd.getProductByID("A"), 100);
        reg.additem(fd.getProductByID("B"), 99);
        reg.endReceipt();

        
        Customer c2 = fd.getCustomerByID(2); //new Customer(1,"Endres" );
        POSRegister reg2 = new POSRegister(c2, s);
        reg2.newReceipt();
        reg2.additem(fd.getProductByID("B"), 100);
        reg2.additem(fd.getProductByID("A"), 99);
        reg2.endReceipt();

    }
//
}
