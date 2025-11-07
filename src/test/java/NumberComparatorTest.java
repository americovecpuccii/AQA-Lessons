import lesson_7_testng.NumberComparator;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class NumberComparatorTest {

    @Test(dataProvider = "comparisonData")
    public void testCompareNumbers(int a, int b, String expected) {
        assertEquals(NumberComparator.compareNumbers(a, b), expected);
    }

    @DataProvider(name = "comparisonData")
    public Object[][] comparisonData() {
        return new Object[][]{
                {9, 3, "9 больше 3"},
                {2, 4, "2 меньше 4"},
                {6, 6, "6 равно 6"},
        };
    }
}
