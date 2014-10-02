/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 * DataAccessStrategy interface used to read various databases
 * @author sendres1
 */
public interface DataAccessStrategy {

    public abstract Customer[] getCustomerArray();

    public abstract Customer getCustomerByID(int ID);

    public abstract Product[] getProductArray();

    public abstract Product getProductByID(String ID);
    
}
