package Stars;
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int count;

    public NightSky(double dens){       // constructors
        this.density = dens;
        this.count = 0;
    }
    public NightSky(int w, int h){
        this.height = h;
        this.width = w;
        this.count = 0;
    }
    public NightSky(double dens, int w, int h){
        this.density = dens;
        this.height = h;
        this.width = w;
        this.count = 0;
    }

    public void printLine(){        // generate random sky line
        Random random = new Random();
        for(int i = 1; i <= width; i++){
            if (random.nextDouble() <= density) {
                System.out.print("*");
                count++;
            } 
            else {System.out.print(" ");}
        }
    System.out.println();
    }

    public void print(){        // print whole sky
        for(int i = 1; i <= height; i++){
            printLine();
        }
    }

    public int starsInLastPrint(){
        return count;
    }
}