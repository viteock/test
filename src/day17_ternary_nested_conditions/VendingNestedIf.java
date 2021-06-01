package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "tea";
        String snack = "candy";

        if(selection.equals("drink")) {
            if(drink.equals("tea")) {
                System.out.println(selection + " " +drink +" is selected");
            }else {
                System.out.println("Drink coke is selected");
            }
        }else {
            if (snack.equals("chips")) {
                System.out.println("chips is selected");
            }else {
                System.out.println("candy is selected");
            }
        }

        switch(selection) {
            case "drink":
                switch (drink) {
                    case "tea":
                        System.out.println("tea is selected");
                        break;
                    case "coke":
                        System.out.println("coke is selcted");
                       break;
                }
                break;
            case "snack":
                switch (snack){
                    case "chips":
                        System.out.println("chips is selected");
                        break;
                    case "candy":
                        System.out.println("candy is selected");
                        break;
                }
                break;
            default :
                System.out.println("Nothing selected");

        }
    }
}
