package lesson_7_testng;

public class NumberComparator {
    public static String compareNumbers(int a, int b) {
        if (a == b) {
            return a + " равно " + b;
        } else if (a > b) {
            return a + " больше " + b;
        } else {
            return a + " меньше " + b;
        }
    }
}
