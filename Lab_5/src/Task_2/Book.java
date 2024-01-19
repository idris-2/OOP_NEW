package Task_2;
import Interfaces.ToBeStored;

public class Book extends Thing implements ToBeStored{
    private String writer;
    private String name;
    //Weight not needed cuz its initialized in Thing

    public Book(String writer, String name, double weight) {
        super(weight);
        this.writer = writer;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }
    @Override
    public double weight() {
        return getWeight();     // using getWeight from Thing
    };
}