package arrington.customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String args[]){
        System.out.println("Welcome to the Customer Viewer");
        Scanner user_input = new Scanner( System.in );
        String Continue;
        Continue = "y";
        while(Continue == "y") {
            String CustomerID;
            System.out.println("");
            System.out.print("Enter a Customer Number: ");
            CustomerID = user_input.next();
            int IDNum = Integer.parseInt(CustomerID);
            System.out.println("");
            System.out.println("Customer Info Here");
            System.out.println("");
            System.out.print("Display another customer? (y/n): ");
            Continue = user_input.next();
        }

    }

}
