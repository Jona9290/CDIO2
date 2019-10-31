import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DieTest {
    // Test with 6 die sides
    private Die minTestDice1 = new Die(6);

    // Test with 10 die sides
    private Die minTestDice2 = new Die(10);

    // Test with 12 die sides
    private Die minTestDice3 = new Die(12);
    @org.junit.Test
    public void roll() {

        assertEquals(minTestDice1.roll(), 1,6);

        assertEquals(minTestDice2.roll(), 1,10);

        assertEquals(minTestDice3.roll(), 1,12);

    }

}