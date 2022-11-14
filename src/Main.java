public class Main {
    public static void main(String[] args) {
        Player p = new Player("Warrior", 100, 15, 16, 20);
        p.setWeapon1(new Weapon("LongSword", "1d8", "1d20"));
        Enemy e1 = new Enemy("Skeleton", 12, 8);
        int result = p.getWeapon1().attack(e1);
        if (result == 0) {
            System.out.println("You missed");
        } else {
            System.out.print("You did " + result + " points of damage.");
        }
    }
}