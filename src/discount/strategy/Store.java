/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discount.strategy;

/**
 ** Store concrete class instantiates a store
 * @author sendres1
 * @version 1.20
 */
public class Store {
    private int storeNo;
    private String storeDesc;

    
    //default constructor
    public Store() {
    }

    
    
    public Store(int storeNo, String storeDesc) {
        this.storeNo = storeNo;
        this.storeDesc = storeDesc;
    }

    public int getStoreNo() {
        return storeNo;
    }

    public String getStoreDesc() {
//        Evalate
        
        
        return storeDesc;
    }
//
//    public void setStoreNo(int storeNo) {
//        this.storeNo = storeNo;
//    }

    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }













}
