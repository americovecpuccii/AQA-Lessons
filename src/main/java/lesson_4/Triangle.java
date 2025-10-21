package lesson_4;

public class Triangle implements Geometry {
    private static int side1;
    private static int side2;
    private static int side3;
    private static int high;
    private static int base;
    private static String fillColor;
    private static String borderColor;

    public Triangle(Integer side1, Integer side2, Integer side3,
                    Integer high, Integer base, String fillColor,
                    String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.high = high;
        this.base = base;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        return 0.5 * base * high;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String printInfo() {
        System.out.println("Периметр треугольника равен: " + calculatePerimeter() +
                "\n Площадь треугольника равна: " + calculateArea() +
                "\n Цвет заливки треугольника: " + getFillColor() +
                "\n Цвет границы треугольника: " + getBorderColor());
        return ("Треуголльник");
    }
}
