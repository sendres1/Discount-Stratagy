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
    private String lineItems[]; 
    private String tempItems[];
    


//private void addToArray(final LineItem item) { 
//// needs validation
//LineItem[] tempItems = new LineItem[lineItems.length + 1];       
//System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);     
//tempItems[lineItems.length] = item;
//lineItems = tempItems;    }


 public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[copyFrom.length + 1];

        System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
        System.out.println(new String(copyTo));
    }


product id       description   unitprice    qty     discount  extended price
1                   
2   /t

        
        }