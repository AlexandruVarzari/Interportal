package Lesson11Abstraction;

public class Circle implements Figure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = Math.PI*radius*radius;
        System.out.println("Circle radius: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2*Math.PI*radius;
        System.out.println(perimeter);
    }
}
