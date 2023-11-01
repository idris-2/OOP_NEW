package Shapes;
import Shapes.enums.FillType;

public class Shape {
    private String color;
    private FillType fill;
    
    public Shape(String color, FillType type){
        this.color = color;
        this.fill = type;
    }
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + fill);
    }
    public double getArea(){
        return 0;
    }


    public static void main(String[] args){
        Circle lol = new Circle("red", FillType.FILLED, 5);
        lol.displayInfo();
        System.out.println(lol.getArea());
        System.out.println(lol.calculateCircumference(5));

        System.out.println("\n");

        Rectangle lel = new Rectangle("red", FillType.FILLED, 5, 6);
        lel.displayInfo();
        System.out.println(lel.getArea());
    }
}