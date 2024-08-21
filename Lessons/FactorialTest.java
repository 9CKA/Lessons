import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Assert.assertEquals(Factorial.factorial(5), 120);
        Assert.assertEquals(Factorial.factorial(4), 24);
        Assert.assertEquals(Factorial.factorial(3), 6);
    }
}