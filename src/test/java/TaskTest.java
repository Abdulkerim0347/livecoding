import org.junit.jupiter.api.Test;
import practice.Task;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * min 100
 * max 999
 * edge cases: 99, 100, 999, 1000
 * positive case: 431
 * negative case: 10
 */

public class TaskTest {
    @Test
    public void sumOfThreeDigitsPositiveTest() {
        assertEquals(1, Task.sumOfThreeDigits(100));
        assertEquals(8, Task.sumOfThreeDigits(431));
        assertEquals(27, Task.sumOfThreeDigits(999));
    }

    @Test
    public void sumOfThreeDigitsNegativeTest() {
        assertEquals(0, Task.sumOfThreeDigits(10));
        assertEquals(0, Task.sumOfThreeDigits(1000));
        assertEquals(0, Task.sumOfThreeDigits(99));
    }
}
