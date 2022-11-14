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
} // end class weapon

