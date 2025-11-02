package lesson_2;

public class CheckSum {
          public static boolean main(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }
        public static void main(String[] args) {
            System.out.println(main(30, 10));    }
}
