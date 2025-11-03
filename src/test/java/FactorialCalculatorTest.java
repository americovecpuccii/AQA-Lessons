import lesson_7_junit_5.FactorialCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

    class FactorialCalculatorTest {

        @Test
        @DisplayName("Факториал 0 должен быть равен 1")
        void testFactorialOfZero() {
            assertEquals(1, FactorialCalculator.calculateFactorial(0));
        }

        @Test
        @DisplayName("Факториал 1 должен быть равен 1")
        void testFactorialOfOne() {
            assertEquals(1, FactorialCalculator.calculateFactorial(1));
        }

        @ParameterizedTest
        @DisplayName("Факториал положительных чисел")
        @CsvSource({
                "2, 3",
                "4, 24",
                "6, 720",
        })
        void testFactorialPositiveNumbers(int input, long expected) {
            assertEquals(expected, FactorialCalculator.calculateFactorial(input));
        }
    }


