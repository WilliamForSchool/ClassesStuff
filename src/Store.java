import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items;

    public Store() {
        items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        items.add(item);
        return true;
    }
    public void printMenu() {
        for (Item item : items) {
            System.out.print(item + "\n");
        }
    }

    public Item getMostExpensiveItem() {
        if(items.size() == 0) {
            return null;
        }

        int priceMax = 0;
        for(int i = 0; i < items.size(); i++) {
            if(priceMax < items.get(i).getPrice()) {
                priceMax = i;
            }
        }
        return items.get(priceMax);
    }

    public double averageMenuPrice() {
        if(items.size() == 0) {
            return 0;
        }

        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total / items.size();
    }

    public ArrayList<Item> getAllItemsOfType(int type) {
        ArrayList<Item> arr = new ArrayList<>();
        for(Item temp: items) {
            if(temp.getType() == type) {
                arr.add(temp);
            }
        }
        return arr;
    }

    public ArrayList<Item> getDollarStore() {
        ArrayList<Item> arr = new ArrayList<>();
        for(Item temp: items) {
            if(temp.getPrice() <= 1.00) {
                arr.add(temp);
            }
        }
        return arr;
    }

    public void addListToMenu(ArrayList<Item> newItems) {

        for(Item temp: newItems) {
            items.add(temp);
        }
    }
}
