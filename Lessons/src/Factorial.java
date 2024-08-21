import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void testFactorial() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(2, Factorial.factorial(1));
        assertEquals(6, Factorial.factorial(2));
        // и так далее...
    }

}

