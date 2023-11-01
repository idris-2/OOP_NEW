package Shapes;

enum FillType{
    FILLED, NOT_FILLED
}

public class Shape {
    private String color;
    private FillType fill;
    
    public Shape(String color, FillType type){
        this.color = color;
        this.fill = type;
    }
    public static void displayInfo(){
        System.out.println(Shape.class);
    }
}
