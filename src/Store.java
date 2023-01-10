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
            System.out.print(items.get(i));
        }
    }
}
