import java.util.ArrayList;
import java.util.List;

import Shapes.Circle;
import Shapes.Rectangle;
import people.Person;
import school.Student;
import school.Teacher;
import Shapes.enums.FillType;

public class MainProgram {
    /*
    public static void main(String[] args){
        Circle lol = new Circle("red", FillType.FILLED, 5);
        Rectangle lel = new Rectangle("red", FillType.FILLED, 5, 6);

        lol.displayInfo();
        System.out.println("\n");
        lel.displayInfo();
    }
    */
    
    
    // TASK 1:
    
    public static void printAll(List<Person> people){       // prints all info in a list format
        System.out.println(people);
    }
    public static void printDepartment(List<Person> people){        // only prints name of each human using get method
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        Teacher peka = new Teacher("Pekka Mikkola", 17, "BiH", "Korsontie Street 1 03100 Vantaa", 1200);
        Student oli = new Student("Olli", 56, "BIH", "Ida Albergintie Street 1 00400 Helsinki", "1289453");
        people.add(peka);
        people.add(oli);

        printDepartment(people);
        System.out.println(oli.getAge());
        //printAll(people);
        System.out.println("\n");

        oli.addGrade(10);
        oli.addGrade(7);
        System.out.println(oli.getGrades());
    }

}
