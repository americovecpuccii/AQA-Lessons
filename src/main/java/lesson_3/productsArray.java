package lesson_3;

public class productsArray {
    public static void main(String[] args) {
        product[] productsArray = new product[5];
        productsArray[0] = new product("Samsung S25 Ultra", "01.02.2025",
                "Korea", 5599, true);
        productsArray[1] = new product("Iphone 17 Pro", "03.09.2025",
                "China", 9999, false);
        productsArray[2] = new product("Xiaomi Redmi Note 14", "25.04.2024",
                "China", 4452, true);
        productsArray[3] = new product("Iphone 16 Pro Max", "20.12.2022",
                "USA", 5699, true);
        productsArray[4] = new product("Honor Magic 8 pro", "05.04.2025",
                "Russia", 1488, false);
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }
    }
}
