package quiz2;
import quiz2.quiz_2;
enum Color{
    RED, BLACK, WHITE, GREEN
}

class Animal {
    private String name;
    private int age;
    private Color color;

    public Animal(String name){         // CONSTRUCTORS
        this.name = name;
    }
    public Animal(int age){
        this.age = age;
    }
    public Animal(String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){        // GET METHODS
        return name;
    }
    public int getAge(){
        return age;
    }
    public Color getColor(){
        return color;
    }

    public void setName(String new_name){       // SET METHODS
        this.name = new_name;
    }
    public void setAge(int new_age){
        this.age = new_age;
    }
    public void setColor(Color new_color){
        this.color = new_color;
    }

    public String runSound(){
        return "Animal running";
    }
}

class Tiger extends Animal{
    private int numOfTeeth;

    public Tiger(String name, int age, Color color, int teeth){
        super(name, age, color);
        this.numOfTeeth = teeth;
    }
    public int getTeeth(){
        return numOfTeeth;
    }
    public void setTeeth(int teeth){
        this.numOfTeeth = teeth;
    }
    @Override
    public String runSound(){
        return "Tiger running";
    }
}

class Lion extends Animal{
    private int bearLength;

    public Lion(String name, int leng){
        super(name);
        this.bearLength = leng;
    }
    public int getBearLength(){
        return bearLength;
    }
    public void setBearLength(int leng){
        this.bearLength = leng;
    }
    @Override
    public String runSound(){
        return "Lion running";
    }
}

public class quiz_2 {
    public static void main(String[] args){
        Animal dog = new Animal("Cunt", 5, Color.RED);
        Tiger lol = new Tiger("debil", 15, Color.WHITE, 56);
        Lion lmao = new Lion("Debilus Helius", 152);
        System.out.println(dog.runSound());
        System.out.println("\n" + lol.runSound());
        System.out.println("\n" + lmao.runSound());
        System.out.println("\n" + lmao.getName());
    }
}
