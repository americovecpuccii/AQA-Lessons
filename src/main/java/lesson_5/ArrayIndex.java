package lesson_5;

public class ArrayIndex extends Throwable {

    public static void main(String[] args) {

        ArrayIndexException();
    }

    public static void ArrayIndexException() {
        int[] numbers = {1, 2, 3}; // массив из 5 элементов (индексы 0-4)

        try {
            int value = numbers[4]; // ОШИБКА! Максимальный индекс = 4
            System.out.println("Значение: " + value); // Эта строка не выполнится

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка ArrayIndexOutOfBoundsException!");
        }
        System.out.println();
    }
}
