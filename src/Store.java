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


    private boolean checkArray() {
        for(int i = 0; i < items.size() - 1; i++) {
            if(items.get(i).getPrice() > items.get(i + 1).getPrice()) {
                return false;
            }
        }
        return true;
    }

    public void sortArray() {
        checkArray();
        while(!checkArray()) {
            for(int i = 0; i < items.size() - 1; i++) {
                if (items.get(i).getPrice() > items.get(i + 1).getPrice()) {
                    Item temp = items.get(i + 1);
                    Item temp2 = items.get(i);
                    items.set(i, temp);
                    items.set(i + 1, temp2);
                }
            }
        }
    }


    public ArrayList<Item> removeDuplicates() {
        ArrayList<Item> arr2 = new ArrayList<>();

        for(int x = items.size() - 1; x >= 0; x--) {
            Item currentItem = items.get(x);
            for(int j = items.size() - 1; j >= 0; j--) {
                if(currentItem.equals(items.get(j)) && x != j) {
                    arr2.add(currentItem);
                    items.remove(x);
                }
            }

        }

        return arr2;
    }
}
