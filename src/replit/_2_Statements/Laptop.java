package replit._2_Statements;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        //copy from
        Scanner sc = new Scanner(System.in);
        double screenSize;
        String cpuType, storageType, screenResolution;
        int ramSize, storageSize;
        double laptopPrice = 0;
        //start
        //screen size
        System.out.println("Select screen size:");
        screenSize = sc.nextDouble();
        if (screenSize == 13.3) {
            laptopPrice += 200;
        } else if (screenSize == 15.0) {
            laptopPrice += 300;
        } else if (screenSize == 17.3) {
            laptopPrice += 400;
        }
        //CPU type
        System.out.println("Select CPU type:");
        sc.nextLine();
        cpuType = sc.nextLine();
        switch (cpuType) {
            case "i3":
                laptopPrice += 150;
                break;
            case "i5":
                laptopPrice += 250;
                break;
            case "i7":
                laptopPrice += 350;
                break;
        }
        // RAM size
        System.out.println("Select RAM size:");
        ramSize = sc.nextInt();
        laptopPrice += (ramSize / 4) * 50;
        // storage type and size
        System.out.println("Select storage type:");
        sc.nextLine();
        storageType = sc.nextLine();
        System.out.println("Enter storage size:");
        storageSize = sc.nextInt();
        laptopPrice += (storageType.equals("HDD")) ? ((storageSize / 500) * 50) :
                ((storageSize / 500) * 100);
        // screen resolution
        System.out.println("Enter screen |resolution:");
        sc.nextLine();
        screenResolution = sc.nextLine();
        laptopPrice += (screenResolution.equals("4k")) ? 200 : 100;
        //print
        System.out.print("Laptop price is: $" + laptopPrice);
    }
}
