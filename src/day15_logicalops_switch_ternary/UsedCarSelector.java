package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Honda";
        double carPrice = 7999.0;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda")
                || model.equals("Tesla"))) {
            System.out.println("Ready to purchase model = " + model + "\nprice = " + carPrice);
        } else {
            System.out.println("Not interested in model = " + model + "\nprice = " + carPrice);
        }
    }

}
