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
        for(int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + "\n");
        }
    }

    public Item getMostExpensiveItem() {
        int priceMax = 0;
        for(int i = 0; i < items.size(); i++) {
            if(priceMax < items.get(i).getPrice()) {
                priceMax = i;
            }
        }
        return items.get(priceMax);
    }

    public double averageMenuPrice() {
        double total = 0;
        for(int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice();
        }
        return total / items.size();
    }
}
