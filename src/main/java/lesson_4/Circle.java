package lesson_4;

public class Circle implements Geometry{
    private static int radius;
    private static String fillColor;
    private static String borderColor;
    public Circle(Integer radius, String fillColor,
                    String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
            public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        public String getFillColor() {
            return fillColor;
        }
        public String getBorderColor() {
            return borderColor;
        }
    public String printInfo() {
        System.out.println("Периметр круга равен: " + calculatePerimeter() +
                "\n Площадь круга равна: " + calculateArea() +
                "\n Цвет заливки круга: " + getFillColor() +
                "\n Цвет границы круга: " + getBorderColor());
        return ("Круг");
    }
    }

