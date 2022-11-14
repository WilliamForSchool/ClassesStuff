public class Enemy {
    // fields, instance variables, attributes (has but can be different, name, etc)
    private String name;
    private int health;
    private int ac; // armor class
    private Weapon weapon1;
    private Weapon weapon2;

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

    public Weapon getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Weapon weapon1) {
        this.weapon1 = weapon1;
    }

    public Weapon getWeapon2() {
        return weapon2;
    }

    public void setWeapon2(Weapon weapon2) {
        this.weapon2 = weapon2;
    }

    public String toString() {
        return name + "\n" + "----------------" + "\n" +
                "Health: " + health + "\n" +
                "Armor Class: " + ac + "\n";
    }
}
