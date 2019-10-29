import java.util.Random;

public class Die {
    private int MAX = 6;

    /**
     * A constructor is created
     */
    public Die(int diesides) {
        MAX = diesides;
    }

    /**
     * The method called roll() contains a number generator
     * which returns a value between 1 and 6
     */
    public int roll() {

        Random diceRoller = new Random();
        int faceValue = diceRoller.nextInt(MAX) + 1;

        return faceValue;
    }

}