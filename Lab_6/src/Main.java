import java.util.Scanner;

import Library_folder.Book;
import Stars.NightSky;

public class Main {
    public static void main(String[] args) {
        //NightSky test = new NightSky(0.2, 10, 4);
        //test.print();
        //System.out.println("\n" + test.starsInLastPrint());

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);


        /*
        int[] lol = {-1, 2, 4, 6, 8, 9, 23, 56};
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number to find: ");
        String val = reader.nextLine();
        boolean result = BinarySearch.BinaryFind(lol, Integer.parseInt(val));

        System.out.println(result);
        reader.close();

        printElegantly(lol);
        */
    }

    public static void printElegantly(int[] array){     // 6. print array elegantly
        String lmao = "";
        for(int i = 0; i <= array.length - 1; i++){
            if(i == 0){lmao = lmao + array[i];}
            else{
            lmao = lmao + "," + " " + array[i];
            }
        }
        System.out.println(lmao);
    }
}
