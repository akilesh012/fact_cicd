import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void testFactorialOf5() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void testFactorialOf0() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    void testFactorialOf3() {
        assertEquals(6, Factorial.calculate(3));
    }
}
