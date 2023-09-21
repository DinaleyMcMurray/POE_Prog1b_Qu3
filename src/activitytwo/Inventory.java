/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

import java.util.ArrayList;

/**
 *
 * @author dinal
 */
public class Inventory extends PurchasingItems{
    
    public static void stockDisplay()
    {
// I used https://interviewsansar.com/how-to-print-arraylist-elements-in-java/ for my method to print out the elements of an array list
        /*
        PRINTING ARRAYLIST
        Using for-each loop
        
         System.out.println("\nUsing for-each loop\n");		
	      for (String str : arrlist)
	      { 		      
	           System.out.println(str); 		
	      }
        
        */
        
        for (Store_Items item : Inventory)
        {
            
        
        System.out.println("Please review the following"
        +"Remainder stock:"
        +"Item: " + item.getName()
        +"Quantity: "+ item.getStock());
        }//end of for loop 
    }//end of stockDsiplay()
    
}//end of class
