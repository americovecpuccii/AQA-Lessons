package lesson_2;

public class ArrayZeroOne {
    public static void main(String args[]) {
       int[] array = {0,1,0,0,1,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }
}

