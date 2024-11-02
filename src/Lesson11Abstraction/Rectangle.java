package Lesson11Abstraction;

public class Rectangle implements Figure{
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        double area = width * height;
        System.out.println("Area rectangle: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2*(width + height);
        System.out.println("Rectangle perimeter: " + perimeter);
    }
}
