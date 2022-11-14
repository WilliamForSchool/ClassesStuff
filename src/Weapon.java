public class Weapon {
    private String name;
    private String damage;
    private String toHit;

    public Weapon(String name, String damage, String toHit) {
        this.name = name;
        this.damage = damage;
        this.toHit = toHit;
    }

    public String getName() {
        return name;
    }

    public String getDamage() {
        return damage;
    }

    public String getToHit() {
        return toHit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public void setToHit(String toHit) {
        this.toHit = toHit;
    }



    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage='" + damage + '\'' +
                ", toHit='" + toHit + '\'' +
                '}';
    }
    public int attack(Enemy e) {
        int attackRoll = Dice.roll(toHit);
        if (attackRoll >= e.getAc()) {
            return Dice.roll(damage);
        } else {
            return 0;
        }
    }

} // end class weapon

