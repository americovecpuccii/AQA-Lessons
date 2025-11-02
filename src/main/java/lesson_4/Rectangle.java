package lesson_4;

public class Rectangle extends GeometryShape {

    private static int side1;
    private static int side2;

    public Rectangle(Integer side1, Integer side2, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
    }
    public double calculatePerimeter() {
        return 2 * (side2 + side1);
    }

    public double calculateArea() {
        return side2 * side1;
    }

    public String printInfo() {
        System.out.println("Периметр прямоугольника равен: " + calculatePerimeter() +
                "\n Площадь прямоугольника равна: " + calculateArea() +
                "\n Цвет заливки прямоугольника: " + getFillColor() +
                "\n Цвет границы прямоугольника: " + getBorderColor());
        return ("Прямоугольник");
    }
}