/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

import static activitytwo.ActivityTwo.quantity;

/*
 * this class is here as a custom model class with two parameters (one Integer and other String) namely name, and stock inorder to hold 
 * https://stackoverflow.com/questions/19602601/create-an-arraylist-with-multiple-object-types
 * 
 */
class Store_Items extends PurchasingItems{
      private String name;
     private int stock;
     

   // Constructor to initialize the username and password
    public Store_Items(String name, int stock) 
    {
        this.name = name;
        this.stock = stock;
   }

    // Getter methods
    public String getName() { return name; }

    public int getStock() { return stock; }

 public void updateStock(int quantity) {
       stock -= quantity; //this operator is used for subtraction and assignment, the stock is subtracted by the quantity
       //this operator will update the amount of stock left, when tem.updateStock(quantity) is used the program will know to subtract the amount the user entered from the stock 
       //https://www.edureka.co/blog/operators-in-java/
       
    }

    public static int getQuantity() {
        return quantity;
    }
    
}

