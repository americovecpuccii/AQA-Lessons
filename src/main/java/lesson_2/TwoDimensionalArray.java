package lesson_2;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            array[i][i] = 1;
        }
        printArray(array);
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
