package Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/*
Create a Java program that demonstrates the use of reflection in the context of a student grade analysis system. Define a Student 
class with attributes such as name, ID, and a list of grades. Implement appropriate getters and setters, and include a method 
printInfo() to print the student's information.
Additionally, create a GradeAnalyzer class that takes a list of grades in its constructor and provides methods for calculating the 
average grade and printing a summary.

In the Start class, instantiate a GradeAnalyzer object with a list of grades, and then use reflection to access and print the field 
names and values of the GradeAnalyzer class. Iterate through the declared methods and invoke those whose names start with "calculate"
or "print," printing the method names and their results.
*/

class Student {
    private String name;
    private int id;
    private List<Integer> grades;

    public Student(String name, int id, List<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades: " + grades);
    }
}

class GradeAnalyzer {
    private List<Integer> grades;

    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public void printSummary() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
}

public class App2 {
    public static void main(String[] args) {
        // Create a list of grades
        List<Integer> grades = new ArrayList<>();
        grades.add(85);
        grades.add(90);
        grades.add(78);
        grades.add(95);

        // Instantiate a GradeAnalyzer object with the list of grades
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(grades);

        // Use reflection to access and print the field names and values of the GradeAnalyzer class
        Class<?> analyzerClass = gradeAnalyzer.getClass();
        Field[] fields = analyzerClass.getDeclaredFields();

        System.out.println("GradeAnalyzer Fields:");
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(gradeAnalyzer));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Iterate through declared methods and invoke those whose names start with "calculate" or "print"
        Method[] methods = analyzerClass.getDeclaredMethods();

        System.out.println("\nGradeAnalyzer Methods:");
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.println("Method Name: " + method.getName());
                try {
                    Object result = method.invoke(gradeAnalyzer);
                    System.out.println("Result: " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}