package Task_3;
import java.util.List;
import java.util.stream.Collectors;

record Employee(int id, String name, double salary) {}

class EmployeeManagementSystem {
    // Filter employees by salary
    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        return employees.stream()
                .filter(employee -> employee.salary() >= minSalary)
                .collect(Collectors.toList());
    }

    // Calculate the total salary of all employees
    public double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .sum();
    }

    // Display employee details
    public void displayEmployeeDetails(List<Employee> employees) {
        employees.forEach(employee -> System.out.println("ID: " + employee.id() +
                ", Name: " + employee.name() +
                ", Salary: " + employee.salary()));
    }
}

public class Main3 {
    public static void main(String[] args) {
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        // List of employees
        List<Employee> employees = List.of(
                new Employee(1, "John Doe", 50000.0),
                new Employee(2, "Jane Doe", 60000.0),
                new Employee(3, "Bob Smith", 75000.0)
        );

        // Filter employees with a minimum salary
        List<Employee> filteredEmployees = employeeManagementSystem.filterEmployeesBySalary(employees, 60000.0);

        // Calculate the total salary of all employees
        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);


        // Print the details of each employee
        employeeManagementSystem.displayEmployeeDetails(employees);

        // Print the filtered employees
        System.out.println("\nFiltered Employees (Minimum Salary of 60000.0):");
        employeeManagementSystem.displayEmployeeDetails(filteredEmployees);

        // Print the total salary
        System.out.println("\nTotal Salary of All Employees: " + totalSalary);
    }
}