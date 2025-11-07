import lesson_7_testng.TriangleArea;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class TriangleAreaTest {

    @Test(dataProvider = "baseHeightData")
    public void testAreaByBaseAndHeight(double base, double height, double expectedArea) {
        double actualArea = TriangleArea.calculateArea(base, height);
        assertEquals(actualArea, expectedArea);
    }

    @DataProvider(name = "baseHeightData")
    public Object[][] baseHeightData() {
        return new Object[][]{
                {10, 5, 25},
                {4, 3, 6},
                {7.5, 2, 7.5}
        };
    }

    @Test(dataProvider = "invalidBaseHeightData",
            expectedExceptions = IllegalArgumentException.class)
    public void testAreaByBaseAndHeightInvalidInput(double base, double height) {
        TriangleArea.calculateArea(base, height);
    }

    @DataProvider(name = "invalidBaseHeightData")
    public Object[][] invalidBaseHeightData() {
        return new Object[][]{
                {-5, 10},
                {5, -10},
                {0, 10}
        };
    }
}
