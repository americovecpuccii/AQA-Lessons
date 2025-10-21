package lesson_4;

public class CheckGeometry {
    public static void main(String[] args) {
        Triangle Triangle1 = new Triangle(4, 6, 8,
                5, 7, "black", "red");
        Circle Circle1 = new Circle(4, "blue", "brown");
        Rectangle Rectangle1 = new Rectangle(4, 6, "orange", "yellow");
        Triangle1.printInfo();
        Circle1.printInfo();
        Rectangle1.printInfo();
    }
}