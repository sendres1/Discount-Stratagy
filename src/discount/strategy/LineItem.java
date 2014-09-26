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
public class LineItem {
    private LineItem[];
}

private void addToArray(final LineItem item) { 
// needs validation
LineItem[] tempItems = new LineItem[lineItems.length + 1];       
System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);     
tempItems[lineItems.length] = item;        lineItems = tempItems;    }



product id       description   unitprice    qty     discount  extended price
1                   
2   /t
