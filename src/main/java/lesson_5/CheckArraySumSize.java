package lesson_5;

public class CheckArraySumSize {
    public static void main(String[] args) {

        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] arrayWithInvalidData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "abc", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        System.out.println("\nВалидный массив");
        processArray(validArray);

        System.out.println("\nМассив с нечисловыми данными");
        processArray(arrayWithInvalidData);

        System.out.println("\nМассив неверного размера");
        processArray(invalidSizeArray);

    }

    private static void processArray(String[][] array) {
        try {
            int result = ArraySumCalculator.sum4x4Array(array);
            System.out.println("Сумма всех элементов: " + result);
            System.out.println("Массив валиден");

        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }
}
