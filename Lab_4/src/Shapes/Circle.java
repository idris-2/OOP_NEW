package Shapes;
import Shapes.enums.FillType;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, FillType fill, double rad){
        super(color, fill);
        this.radius = rad;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Area : " + getArea());
        System.out.println("Radius : " + radius);
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }
    public double calculateCircumference(double r) {
        final double PI = Math.PI; // Assuming a constant PI
        return 2 * PI * r;
    }
}
