
import activitytwo.ActivityTwo;
import activitytwo.PurchasingItems;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Testing {
    
    
     @Test
    public void testPurchasingItems() {
        
        String input = "1\nLong Life milk\n5\nquit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

       
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        
        PurchasingItems.customerclass();

        
        String expectedOutput = "Welcome to the customer self checkout services\n" +
                "\n" +
                "****************************************************************\n" +
                "Please enter which items you are purchasing \n" +
                "Note that you will be required to enter one item at a time by entering the given name\n" +
                "****************************************************************\n" +
                "\n" +
                "Are you purcahsing:\n" +
                " 1--> Long Life OR Full Cream milk\n" +
                " 2--> Brown OR White bread \n" +
                " 3--> Red OR White wine \n" +
                " 4--> Pork OR Beef \n" +
                "\nEnter the item you would like to purchase or enter QUIT to exit: \n" +
                "\n" +
                " Enter how much you want to buy:\n" +
                "This item was successfully added to your list\n" +
                "Thank you for shopping at the Store!\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}