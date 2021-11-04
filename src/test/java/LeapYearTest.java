import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    /*
    * Instead of using AssertEquals(Expectation, function()), I can use assertTrue/assertFalse.
    * This uses "True" or "False" as expectation, and takes a function as parameter.
    */

    @Test
    public void check_1900_divisible_by_all_but_not_400() {
        assertFalse(main.checkLeapYear(1900));
    }

    @Test
    public void check_1800_divisible_by_all_but_not_400() {
        assertFalse(main.checkLeapYear(1800));
    }

    @Test
    public void check_1700_divisible_by_all_but_not_400() {
        assertFalse(main.checkLeapYear(1700));
    }

    @Test
    public void check_2000_divisible_by_all() {
        assertTrue(main.checkLeapYear(2000));
    }

    @Test
    public void check_1600_divisible_by_all() {
        assertTrue(main.checkLeapYear(1600));
    }

    @Test
    public void check_2021_divisible_by_4_and_100_not_400() {
        assertFalse(main.checkLeapYear(2021));
    }

    @Test
    public void check_2024_divisible_by_4() {
        assertTrue(main.checkLeapYear(2024));
    }

    @Test
    public void check_2100_divisible_by_100_not_by_400() {
        assertFalse(main.checkLeapYear(2100));
    }
}
