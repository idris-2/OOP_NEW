package school;

import people.Person;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, String country, String address, int salary) {
        super(name, age, country, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary " + salary + " euros/month";
    }
}
