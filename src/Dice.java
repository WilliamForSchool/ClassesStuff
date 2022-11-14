public class Dice {
    public static int roll(String stuff) {


        int placeOfD = stuff.indexOf("d");
        int numOfDice = Integer.parseInt(stuff.substring(0, placeOfD));
        int sides = Integer.parseInt(stuff.substring(placeOfD + 1));
        int total = 0;
        for(int i = 0; i < numOfDice; i++) {
            total += (int)(1 + Math.random() * sides);
        }
        return total;
    }


}
