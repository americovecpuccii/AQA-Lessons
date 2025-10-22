package lesson_4;

public class Circle extends GeometryShape{

    private static int radius;
    public Circle(Integer radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }
            public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

    public String printInfo() {
        System.out.println("Периметр круга равен: " + calculatePerimeter() +
                "\n Площадь круга равна: " + calculateArea() +
                "\n Цвет заливки круга: " + getFillColor() +
                "\n Цвет границы круга: " + getBorderColor());
        return ("Круг");
    }
    }

