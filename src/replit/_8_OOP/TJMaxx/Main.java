package replit._8_OOP.TJMaxx;

public class Main {
    static TJMaxx store = new TJMaxx();
    public static void main(String[] args) {


        // Number of regular items
        int regularItems = 3;
        // Number of on sale items
        int saleItems = 2;
        // add all regular items

            store.addRegularItem(new Item("Pen", 10, 1, 2.5));
            store.addRegularItem(new Item("Hat", 2, 2, 10));
            store.addRegularItem(new Item("Cups", 1, 3, 3.6));

        // add all on sale items
        for(int i=0; i < saleItems; i++){
            store.addOnSaleItem(new OnSaleItem("Light", 4, 4, 30, 10));
            store.addOnSaleItem(new OnSaleItem("Towel", 4, 5, 12.4, 15));
        }
        //Test the different methods
        int test = 6;

        switch (test){
            case 1:
                System.out.println(store.getAllItemNames());
                break;
            case 2:
                System.out.println(store.getItemPrice(4));
                break;
            case 3:
                System.out.println(store.getOnSaleItem("Pen"));
                break;
            case 4:
                int before = store.regularItemsCount() + store.onSaleItemsCount();
                store.buyItem(1);
                int after =  store.regularItemsCount() + store.onSaleItemsCount();
                System.out.print(before == after);
            case 5:
                int num = 2;
                store.buyItem(num);
                System.out.println(ExtraUtil.getItemFromCatNum(num).getQuantity());
                break;
            case 6:
                int num2 = 4;
                store.buyItem(num2);
                System.out.println(ExtraUtil.getSaleFromCatNum(num2).getQuantity());
                break;
        }

       // input.close();

    }
}

class ExtraUtil{

    public static Item getItemFromCatNum(int num){
        for(Item each: Main.store.getRegularItems()){
            if(each.getCatalogNumber() == num){
                return each;
            }
        }
        return null;
    }

    public static OnSaleItem getSaleFromCatNum(int num){
        for(OnSaleItem each: Main.store.getOnSaleItems()){
            if(each.getCatalogNumber() == num){
                return each;
            }
        }
        return null;
    }

}
