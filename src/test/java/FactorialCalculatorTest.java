import lesson_7_testng.FactorialCalculator;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1L);
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(FactorialCalculator.calculateFactorial(1), 1L);
    }

    @Test(dataProvider = "positiveFactorialData")
    public void testFactorialPositiveNumbers(int input, long expected) {
        assertEquals(FactorialCalculator.calculateFactorial(input), expected);
    }

    @DataProvider(name = "positiveFactorialData")
    public Object[][] positiveFactorialData() {
        return new Object[][]{
                {2, 2},
                {3, 6},
                {4, 24},
        };
    }
}
