package replit._4_Loops;

import java.util.Scanner;

public class ShoppingListLoop {
    public static void main(String[] args) {
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        Scanner scan = new Scanner(System.in);

        //copy from
        do {
            System.out.println("Enter Item1 and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice +=price;
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equals("yes")) {
                shoppingListReport += ", ";
                count++;
            }
        }while(countinue.equals("yes"));
        System.out.println(shoppingListReport);
        System.out.print("Total price: " + totalPrice);
    }
}

