package school;
import java.util.ArrayList;
import java.util.List;

import people.Person;

public class Student extends Person {
    private int credit;
    private String student_id;
    private List<Integer> grades;

    
    public Student(String name, int age, String country, String address, String id) {
        super(name, age, address, country);
        this.student_id = id;
        this.grades = new ArrayList<Integer>();
    }

    public String getId(){
        return student_id;
    }
    public void setId(String new_id){
        this.student_id = new_id;
    }
    public List<Integer> getGrades(){
        return grades;
    }
    public void addGrade(int new_grade){
        this.grades.add(new_grade);
    }

    public void study(){
        this.credit++;
    }
    public int credits(){
        return credit;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncredits " + credit;
    }
}
