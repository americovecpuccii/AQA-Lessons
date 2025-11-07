import lesson_7_junit_5.ArithmeticOperations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {

    @ParameterizedTest
    @DisplayName("Сложение")
    @CsvSource({
            "5, 3, 8",
            "-5, 3, -2"
    })
    void testAdd(int a, int b, int expected) {
        assertEquals(expected, ArithmeticOperations.add(a, b));
    }

    @ParameterizedTest
    @DisplayName("Вычитание")
    @CsvSource({
            "10, 3, 7",
            "5, 8, -3"
    })
    void testSubtract(int a, int b, int expected) {
        assertEquals(expected, ArithmeticOperations.subtract(a, b));
    }

    @ParameterizedTest
    @DisplayName("Умножение")
    @CsvSource({
            "5, 3, 15",
            "-5, 3, -15"
    })
    void testMultiply(int a, int b, int expected) {
        assertEquals(expected, ArithmeticOperations.multiply(a, b));
    }

    @ParameterizedTest
    @DisplayName("Деление")
    @CsvSource({
            "10, 2, 5.0",
            "7, 2, 3.5"
    })
    void testDivide(int a, int b, double expected) {
        assertEquals(expected, ArithmeticOperations.divide(a, b));
    }
}
