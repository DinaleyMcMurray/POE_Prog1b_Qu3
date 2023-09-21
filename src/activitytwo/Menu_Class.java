/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author dinal
 */
public class Menu_Class extends PurchasingItems{
    
    //this is where the receipts will be displayed 
    public static void receipts(){
        
         for (Store_Items item : inventory)
        {
        System.out.println("\n Thank you so much for your purchases!"
                + "please review your reciept: ");

            System.out.println("Item: " + item.getName() );
            System.out.println("Quantitiy: " + quantity);
        
    }//end of for loop 
    }//end of receipts()
}//end of class
