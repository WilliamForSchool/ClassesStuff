public class Enemy {
    // fields, instance variables, attributes (has but can be different, name, etc)
    private String name;
    private int health;
    private int ac; // armor class

    // constructor
    public Enemy(String name, int health, int ac) {
        this.name = name;
        this.health = health;
        this.ac = ac;
    }

    // methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getAc() {
        return ac;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setAc(int ac) {
        this.ac = ac;
    }
    public String toString() {
        return name + "\n" + "----------------" + "\n" +
                "Health: " + health + "\n" +
                "Armor Class: " + ac;
    }
}
