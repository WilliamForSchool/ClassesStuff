import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Store s = new Store();
        Item Water = new Item("Water", 1.99, 1);
        Item Twix = new Item("Twix", 0.99, 2);
        Item Ham_Sandwich = new Item("Ham Sandwich", 3.99, 3);
        Item Trail_Mix = new Item("Trail Mix", 1.99, 4);
        s.addItem(Water);
        s.addItem(Twix);
        s.addItem(Ham_Sandwich);
        s.addItem(Trail_Mix);
        s.printMenu();
    }
}