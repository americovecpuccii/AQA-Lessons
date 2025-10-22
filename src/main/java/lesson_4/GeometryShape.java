package lesson_4;

abstract class GeometryShape implements Geometry {

    protected static String fillColor;
    protected static String borderColor;

    public GeometryShape (String fillColor,
                     String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public String getFillColor() {return fillColor;}

    public String getBorderColor() {return borderColor;}
    }
