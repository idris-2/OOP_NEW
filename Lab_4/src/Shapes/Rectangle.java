package Shapes;
import Shapes.enums.FillType;

public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(String color, FillType fill, double width, double height){
        super(color, fill);
        this.height = height;
        this.width = width;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Width : " + width);
        System.out.println("Heigth : " + height);
        System.out.println("Area : " + getArea());
    }
    @Override
    public double getArea(){
        return width * height;
    }
}
