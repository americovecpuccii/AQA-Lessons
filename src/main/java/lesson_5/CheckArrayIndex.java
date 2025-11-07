package lesson_5;

public class CheckArrayIndex {

    public static void safeArrayAccess(int[] array, int index) {
        try {
            int value = array[index];
            System.out.printf("array[%d] = %d\n", index, value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Неверный индекс: %d\n", index);
            System.out.printf("Допустимый диапазон: 0 - %d\n", array.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] data = {6, 5, 8};

        safeArrayAccess(data, 1);
    }
}

