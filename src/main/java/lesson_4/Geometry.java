package lesson_4;

import java.security.PublicKey;

interface Geometry {

    public String getFillColor();

    public String getBorderColor();

    default double calculatePerimeter() {
        System.out.println("Расчет периметра по умолчанию не реализован");
        return 0;
    }
    public double calculateArea();

    public String printInfo();
}



