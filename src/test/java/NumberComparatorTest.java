import lesson_7_junit_5.NumberComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @ParameterizedTest
    @DisplayName("Сравнение двух чисел")
    @CsvSource({
            "7, 1, '7 больше 1'",
            "4, 9, '4 меньше 9'",
            "8, 8, '8 равно 8'",
    })
    void testCompareNumbers(int a, int b, String expected) {
        assertEquals(expected, NumberComparator.compareNumbers(a, b));
    }
}
