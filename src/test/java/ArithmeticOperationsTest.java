import lesson_7_testng.ArithmeticOperations;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class ArithmeticOperationsTest {

    @Test(dataProvider = "additionData")
    public void testAdd(int a, int b, int expected) {
        assertEquals(ArithmeticOperations.add(a, b), expected);
    }

    @DataProvider(name = "additionData")
    public Object[][] additionData() {
        return new Object[][]{
                {5, 3, 8},
                {-5, 3, -2},
        };
    }

    @Test(dataProvider = "subtractionData")
    public void testSubtract(int a, int b, int expected) {
        assertEquals(ArithmeticOperations.subtract(a, b), expected);
    }

    @DataProvider(name = "subtractionData")
    public Object[][] subtractionData() {
        return new Object[][]{
                {10, 3, 7},
                {5, 8, -3},
        };
    }

    @Test(dataProvider = "multiplicationData")
    public void testMultiply(int a, int b, int expected) {
        assertEquals(ArithmeticOperations.multiply(a, b), expected);
    }

    @DataProvider(name = "multiplicationData")
    public Object[][] multiplicationData() {
        return new Object[][]{
                {5, 3, 15},
                {-5, 3, -15},
        };
    }

    @Test(dataProvider = "divisionData")
    public void testDivide(int a, int b, double expected) {
        assertEquals(ArithmeticOperations.divide(a, b), expected);
    }

    @DataProvider(name = "divisionData")
    public Object[][] divisionData() {
        return new Object[][]{
                {10, 2, 5.0},
                {-15, 3, -5.0},
        };
    }
}
