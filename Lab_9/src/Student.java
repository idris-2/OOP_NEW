public class Student {
    private int id;
    private String name;
    private String universityName;
    private String departmentName;
    private double gpa;
    public Student(int id, String name, String universityName, String departmentName, double gpa) {
        this.id = id;
        this.name = name;
        this.universityName = universityName;
        this.departmentName = departmentName;
        this.gpa = gpa;
    }
    public String toString(){
        return "Name: " + (this.getName());
    }
    public void displayInfo(){
        System.out.println(getId() + " " + getName() + " " + getUniversityName() + " " + getDepartmentName() + " " + getGpa());
    }
    public int getId() {
        return this.id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}