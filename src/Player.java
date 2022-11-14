//
// This class acts like a blueprint.
// It itself is not a player, but describes and allows the creation of player
//

public class Player {

    // fields, instance variables, attributes (has but can be different, name, etc)
    private String name;
    private int health;
    private int dexterity; // how well a player uses dex weapons (bows, daggers)
    private int strength; // how well a player uses str weapons (swords, axes)
    private int intelligence; // how well a player can cast a spell
    private Weapon weapon1;
    private Weapon weapon2;


    // constructors, how to create new Players
    public Player(String name, int health, int dexterity, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.strength = strength;
    }

    // methods, actions

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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHeath(int health) {
        this.health = health;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public String toString() {
        return name + "\n" + "-------------------------" + "\n" +
                "Health: " + health + "\n" +
                "Intelligence: " + intelligence + "\n" +
                "Dexterity: " + dexterity + "\n" +
                "Strength: " + strength + "\n";
    }

}
