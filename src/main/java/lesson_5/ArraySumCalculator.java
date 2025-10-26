package lesson_5;

public class ArraySumCalculator {

    public static int sum4x4Array(String[][] array) throws MyArraySizeException, MyArrayDataException {
        validateArraySize(array);

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                    System.out.printf("array[%d][%d] = '%s' -> %d\n", i, j, array[i][j], value);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }

    private static void validateArraySize(String[][] array) throws MyArraySizeException {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(array.length, array[i].length);
            }
        for (int j = 0; j < array.length; j++) {
            if (array[j].length != 4) {
                throw new MyArraySizeException(array.length, array[j].length);
                }
            }
        }
    }
}
