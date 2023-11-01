import java.util.ArrayList;
import java.util.List;

import people.Person;
import school.Student;
import school.Teacher;

public class MainProgram {
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
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
        //printAll(people);
    }
}
