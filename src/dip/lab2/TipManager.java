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
    
    private TipCalculator tipCalc;

    // constructor
    public TipManager(TipCalculator tip) {
        this.tipCalc = tip;
    }

    // getter
    public TipCalculator  getTipCalculator() {
        return tipCalc;
    }

    //setter
    public void setTipCalculator(TipCalculator tip) {
        this.tipCalc = tip;
    }
   
    /**
     * Copy one msg of input from reader to writer. Program ends when carriage
     * return is entered. Notice how flexible this is due to polymorphism!
     */
    public double  calculateTip() {
//        double  amount = 0;
//       amount= tipCalc.getTip();
       return tipCalc.getTip();
        
    }
    
}
