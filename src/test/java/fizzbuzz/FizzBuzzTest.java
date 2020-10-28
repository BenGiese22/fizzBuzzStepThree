package fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    
    private final String FIZZ_BUZZ_STEP_THREE_EXPECTED = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz \n"
    + "fizz: 4\n"
    + "buzz: 3\n"
    + "fizzbuzz: 1\n"
    + "lucky: 2\n"
    + "integer: 10";

    @Test
    public void testFizzBuzzStepThree() {
        assertEquals(FIZZ_BUZZ_STEP_THREE_EXPECTED, FizzBuzz.fizzBuzzStepThree());
    }
}