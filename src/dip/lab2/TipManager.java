/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author sendres1
 */
public class TipManager {
    
    private TipCalculator tip;

    // constructor
    public TipManager(TipCalculator tip) {
        this.tip = tip;
    }

    // getter
    public TipCalculator getTip() {
        return tip;
    }

    //setter
    public void setTip(TipCalculator tip) {
        this.tip = tip;
    }
   
    /**
     * Copy one msg of input from reader to writer. Program ends when carriage
     * return is entered. Notice how flexible this is due to polymorphism!
     */
    public void calculateTip() {
        Double amount = TipCalculator.getTip();
        
    }
    
}
