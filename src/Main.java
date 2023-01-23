import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store s = new Store();

        Item Water = new Item("Water", 1.99, Item.BEVERAGE);
        Item Milk = new Item("Milk", 4.99, Item.BEVERAGE);
        Item Coke = new Item("Coke", 2.99, Item.BEVERAGE);

        Item Water2 = new Item("Water", 14.99, Item.BEVERAGE);
        Item Twix2 = new Item("Twix", 2.99, Item.CANDY);
        Item Twix = new Item("Twix", 0.99, Item.CANDY);
        Item Whatchamacallit = new Item("Whatchamacallit", 0.99, Item.CANDY);
        Item Snickers = new Item("Snickers", 0.99, Item.CANDY);

        Item Ham_Sandwich = new Item("Ham Sandwich", 3.99, Item.FOOD);
        Item Burger = new Item("Burger", 5.99, Item.FOOD);
        Item Hotdog = new Item("Hotdog", 4.99, Item.FOOD);

        Item Trail_Mix = new Item("Trail Mix", 1.99, Item.SNACK);
        Item Cupcake = new Item("Cupcake", 0.99, Item.SNACK);
        Item Bagel_Bites = new Item("Bagel Bites", 2.99, Item.SNACK);


        ArrayList<Item> Snacks = new ArrayList<>();
        Snacks.add(Twix);
        Snacks.add(Whatchamacallit);
        Snacks.add(Snickers);


        s.addItem(Water);
        s.addItem(Milk);
        s.addItem(Water2);
        s.addItem(Twix2);
        s.addItem(Coke);
        s.addItem(Burger);
        s.addItem(Hotdog);
        s.addItem(Cupcake);
        s.addItem(Bagel_Bites);
        s.addItem(Ham_Sandwich);
        s.addItem(Trail_Mix);


        s.addListToMenu(Snacks);
        s.printMenu();
        System.out.println("----------------------");
        s.sortArray();
        s.printMenu();
        System.out.println("----------------------");
        System.out.println(s.removeDuplicates());
        s.printMenu();






    }
}