/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activitytwo;

import java.util.ArrayList;
import java.util.Scanner;

/*
        this program is a self check out and a stock counter program 
        it will allow a user to "buy" items 
        and check how much stock is left over after the purchase 
        and a reciept will be drawn up for them 
        */

public class ActivityTwo {
public static Scanner scanner = new Scanner(System.in);
public static int userInput;
public static int userInput2;
public static int optionItem;
public static int switchChoice;
public static int quantity;

    public static void main(String[] args) {
        
  Inventory inventory = new Inventory ();
       
  ArrayList<Store_Items> inventory = new ArrayList<>();
  inventory.add("Long Life Milk", 30);
  inventory.add("Full Cream Milk", 25);
  inventory.add("Brown Bread", 15);
  inventory.add("White Bread", 18);
  inventory.add("White Wine", 105);
  inventory.add("Red Wine", 95);
  inventory.add("Pork", 110);
  inventory.add("Beef", 130);
  
  
  //____________________________________________________________________________________________________________welocme()    

         System.out.println("____________________________________________________________________");
         System.out.println("Welcome to the MIKHAIL CONSUMERS' program");
         System.out.println( "____________________________________________________________________");
         
         while(true){
             
         System.out.println( "\n Please select whether you would like to check stock or purchase items "
         + "\nDo this by entering 1 OR 2"
         + "\n1 --> check stock "
         + "\n2 --> purchase items");
         userInput = scanner.nextInt();
         
          switch(userInput)
          {
              
              case 1: Inventory.stockDisplay();break;
              case 2: purchasingItems();break; 
              
          }//end of switch 
          reprompt();
         }//end of while loop 
    }//end of main
        public static void reprompt()
    {

         System.out.println("\n Would you like to recieve your receipt or would you like to cancel?"
        +" \n enter --> 1 to proceed"
        +" \n enter --> 2 to cancel the purchase");
          userInput2 = scanner.nextInt();
         
          switch(userInput2)
          {
              case 1: Menu_Class.receipts();
                      break;
              case 2: System.out.println("We thank you for you time, we will now be closing the program...");
                  System.exit(0);
          }//end of switch 
         
    }//end of total
//____________________________________________________________________________________________________________menu2 
     
        public static void purchasingItems() 
    {
        
        System.out.println("Items available:");
           for (Store_Items item : inventory) 
    {
                System.out.println(item.getName() + " - Stock: " + item.getStock());
    }//end of for 
    }//end of purchasingItems()

  
        
    }//end of main
         



