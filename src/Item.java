public class Item {
    private String name;
    private double price;
    public static final int BEVERAGE = 1, SNACK = 2, CANDY = 3, FOOD = 4;
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " for $" + price + "\n";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Item(String name, double price, int type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
