package arrington.customer;

import java.util.Scanner;
import java.lang.*;

public class CustomerApp {

    public static void main(String args[]){
        System.out.println("Welcome to the Customer Viewer");
        Scanner user_input = new Scanner( System.in );
        String Continue;
        Continue = "y";
        while(Continue.equalsIgnoreCase("y")) {
            String CustomerID;
            System.out.println("");
            System.out.print("Enter a Customer Number: ");
            CustomerID = user_input.next();
            int IDNum = Integer.parseInt(CustomerID);
            CustomerDB testerGuy = new CustomerDB();
            Customer outputGuy = testerGuy.getCustomer(IDNum);
            System.out.println("");
            if (outputGuy == null) {
                System.out.println("There is no customer number " + CustomerID + " in our records.");
                //continue;
            }
            else {
                System.out.println(outputGuy.getNameAndAddress());
            }
            System.out.println("");
            System.out.print("Display another customer? (y/n): ");
            Continue = user_input.next();
        }

    }

}
