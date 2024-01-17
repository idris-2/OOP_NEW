import java.io.IOException;

public class Call {
    public static void main(String[] args) throws IOException{
        StudentSystem studentSystem = new StudentSystem("C:\\Users\\User\\Documents\\VSCode Java\\test\\students.csv");
        /*for(Student student : studentSystem.getStudents()){
            student.displayInfo();
        }*/

        System.out.println(studentSystem.getStudentById(10));
        studentSystem.getHighestGPAStudent().displayInfo();
        studentSystem.getLongestNameStudent().displayInfo();    
    }
}