public class Main {
    public static void main(String[] args) {
        Player p = new Player("Warrior", 100, 15, 16, 20);
        Player p2 = new Player("Loser", 13, 1, 6, 9);
        Enemy one = new Enemy("Mr.Evil", 23, 2);
        System.out.println(one);
        System.out.println(p);
        System.out.println(p2);


    }
}