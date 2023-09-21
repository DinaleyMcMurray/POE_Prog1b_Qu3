/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;
import java.util.Scanner;

/**
 *
 * @author dinal
 */
public class PurchasingItems  {
    
    
    
    //this is where users are prompted 
    public static void customerclass()
         
    {
           Scanner scanner = new Scanner (System.in);
//____________________________________________________________________________________________________________welcome        
        System.out.println("Welcome to the customer self checkout services");
        System.out.println("\n");
        System.out.println("****************************************************************");
//____________________________________________________________________________________________________________menu   

 System.out.println("Please enter which items you are purchasing "
        + "\nNote that you will be required to enter one item at a time by entering the given name");
       System.out.println("****************************************************************");
        
        System.out.println("\nAre you purcahsing:"
        + "\n 1--> Long Life OR Full Cream milk"     
        + "\n 2--> Brown OR White bread "
        + "\n 3--> Red OR White wine "
        + "\n 4--> Pork OR Beef ");
        
      //   }//end of switch case
         
 System.out.println("\nEnter the item you would like to purchase or enter QUIT to exit: ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("quit")) {
                System.exit(0);
            } 
            //ignore case is important as it allows the user more leniency  when typing 

System.out.println("\n Enter how much you want to buy:");
          int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume new line 
            

            boolean itemFound = false; //must initialize the boolean as false, this is the default value
            //https://learn.microsoft.com/en-us/dotnet/visual-basic/language-reference/data-types/boolean-data-type

            for (Store_Items item : Inventory) {
                
                //equalsIgnoreCase() Method
                //https://www.w3schools.com/java/ref_string_equalsignorecase.asp#:~:text=The%20equalsIgnoreCase()%20method%20compares,strings%20lexicographically%2C%20ignoring%20case%20differences.
                
                if (item.getName().equalsIgnoreCase(itemName)) {
                    
                    if (item.getStock() >= quantity)
                    {
                        item.updateStock(quantity);
                        System.out.println("This item was successfully added to your list");
                    }//end of if statement  
                    
                    else 
                        
                    {
                        System.out.println("Sorry, there is not enough stock for " + item.getName() + "\n please re-enter how much you would like to purchase"
                        + "\n this is how much stock we have left in this item " + quantity);
                    }//end of else statment 
                    
                    itemFound = true;
                    break;
               
            }//end of if statement 

            if (!itemFound) {
                System.out.println("Item not found in the inventory.");
            }//end of if statement 
        }//end of for loop
        System.out.println("Thank you for shopping at the Store!");
 
        } 
    }//end of customer class