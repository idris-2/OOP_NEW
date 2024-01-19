package Task_2;
import Interfaces.ToBeStored;

public class CD extends Thing implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    //Weight not needed cuz its initialized in Thing

    public CD(String artist, String title, int publishingYear) {
        super(0.1);
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }

    @Override
    public double weight(){
        return getWeight();     // using getWeight from Thing
    }
}