import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class StudentSystem {
    private ArrayList<Student> students = new ArrayList<>();
    public StudentSystem(String filePath) throws IOException{
        try{
            this.students = loadStudentData(filePath);
        } catch (IOException e){
            throw e;
        }
    }
    public ArrayList<Student> loadStudentData(String filePath) throws IOException{
        BufferedReader file = new BufferedReader(new FileReader(filePath));
        ArrayList<Student> students = new ArrayList<>();
        
        String tempLine;
        while((tempLine= file.readLine()) != null){
            String[] tempLineElements = tempLine.split(",");
            students.add(new Student(
                Integer.parseInt(tempLineElements[0]),
                tempLineElements[1],
                tempLineElements[2],
                tempLineElements[3],
                Double.parseDouble(tempLineElements[4])
                ));
        }
        file.close();
        return students;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public Optional<Student> getStudentById(int id){
        if(students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty.");
        }
        Optional<Student> studentOptional = Optional.empty();

        for(Student student : students){
            if(student.getId() == id){
                studentOptional = Optional.of(student);
                break;
            }
        }

        if(studentOptional.isPresent()){
            return studentOptional;
        } else{
            throw new StudentNotFoundException(null);
        }
    }

    public Student getHighestGPAStudent(){
        if(students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty.");
        }

        Student maxGPAstudent = students.get(0);
        for(Student student : students){
            if (student.getGpa() > maxGPAstudent.getGpa()){
                maxGPAstudent = student;
            }
        }
        return maxGPAstudent;
    }

    public Student getLongestNameStudent(){
        if(students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty.");
        }

        Student longestNameStudent = students.get(0);
        for(Student student : students){
            if (student.getName().length() > longestNameStudent.getName().length()){
                longestNameStudent = student;
            }
        }
        return longestNameStudent;
    }
}