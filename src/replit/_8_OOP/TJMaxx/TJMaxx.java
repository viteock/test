package replit._8_OOP.TJMaxx;

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);

    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
        List<String> allNames = new ArrayList<>();
        for(Item each : regularItems){
            allNames.add(each.getName());
        }
        for(OnSaleItem each : onSaleItems){
            allNames.add(each.getName());
        }
        return allNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
        double price = 0.0;
        for(Item each : regularItems){
            if(each.getCatalogNumber() == catalogNumber){
                price = each.getPrice();
                break;
            }
        }
        for(OnSaleItem each : onSaleItems){
            if(each.getCatalogNumber() == catalogNumber){
                price = each.getPrice();
                break;
            }
        }
        return price;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        for(OnSaleItem each : onSaleItems) {
            if(each.getName().equals(name)){
                return each;
            }
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        for (int i = 0; i < onSaleItemsCount(); i++) {
            if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                onSaleItems.remove(i);
            }
        }
        for (int i = 0; i < regularItemsCount(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                regularItems.remove(i);

            }
        }
    }
    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        for (int i = 0; i < onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                onSaleItems.get(i).setQuantity(onSaleItems.get(i).getQuantity() - 1);
                if (onSaleItems.get(i).getQuantity() == 0) {
                    onSaleItems.remove(i);
                }
            }

        }
        for (int i = 0; i < regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                regularItems.get(i).setQuantity(regularItems.get(i).getQuantity() - 1);
                if (regularItems.get(i).getQuantity() == 0) {
                    regularItems.remove(i);
                }
            }

        }




    }


}