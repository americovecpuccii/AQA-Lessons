package lesson_5;

public class ArrayIndex extends Throwable {

    public static void main(String[] args) {

        ArrayIndexException();
    }

    public static void ArrayIndexException() {
        int[] numbers = {1, 2, 3};

        try {
            int value = numbers[4];
            System.out.println("Значение: " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка ArrayIndexOutOfBoundsException!");
        }
        System.out.println();
    }
}
