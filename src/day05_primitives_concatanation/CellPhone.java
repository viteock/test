package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model = "Note 10+";
        String color = "black";
        double price = 1199.99;
        int storage = 512;
        boolean hasCamera = true;
        //printing
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);
        System.out.println("Ebat capat'");
        System.out.println();
        //  using +
        System.out.println(brand+"\n"+
                model+"\n"+color+"\n"+
                price+"\n"+storage+"\n"+
                hasCamera+"\n"+ "wooohoo");


    }
}
