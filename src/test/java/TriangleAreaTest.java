import lesson_7_junit_5.FactorialCalculator;
import lesson_7_junit_5.TriangleArea;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @ParameterizedTest
    @DisplayName("Расчет площади")
    @CsvSource({
            "10, 5, 25",
            "7.5, 2, 7.5",
            "1, 1, 0.5"
    })
    void testAreaByBaseAndHeight(double base, double height, double expectedArea) {
        assertEquals(expectedArea, TriangleArea.calculateArea(base, height));
    }

    @Test
    @DisplayName("Расчет площади с невалидными данными")
    void testAreaByBaseAndHeightInvalidInput() {

        assertThrows(IllegalArgumentException.class,
                () -> TriangleArea.calculateArea(-5, -10));
    }
}

