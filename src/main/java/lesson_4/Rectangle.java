package lesson_4;

public class Rectangle implements Geometry {
    private static int side1;
    private static int side2;
    private static String fillColor;
    private static String borderColor;

    public Rectangle(Integer side1, Integer side2, String fillColor,
                     String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return 2 * (side2 + side1);
    }

    public double calculateArea() {
        return side2 * side1;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String printInfo() {
        System.out.println("Периметр прямоугольника равен: " + calculatePerimeter() +
                "\n Площадь прямоугольника равна: " + calculateArea() +
                "\n Цвет заливки прямоугольника: " + getFillColor() +
                "\n Цвет границы прямоугольника: " + getBorderColor());
        return ("Прямоугольник");
    }
}