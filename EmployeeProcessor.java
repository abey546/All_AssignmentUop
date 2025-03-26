import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Employee class to represent each employee
class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class EmployeeProcessor {
    public static void main(String[] args) {
        // Step 1: Creating the dataset
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 28, "IT", 75000),
                new Employee("Bob", 35, "HR", 50000),
                new Employee("Charlie", 40, "Finance", 90000),
                new Employee("David", 30, "IT", 80000),
                new Employee("Eve", 32, "Marketing", 60000)
        );

        // Step 2: Function interface to concatenate name and department
        Function<Employee, String> nameAndDeptFunction = e -> e.getName() + " - " + e.getDepartment();

        // Step 3: Using streams to generate a new collection with concatenated strings
        List<String> nameAndDeptList = employees.stream()
                .map(nameAndDeptFunction)
                .collect(Collectors.toList());
        
        System.out.println("Employee Names and Departments:");
        nameAndDeptList.forEach(System.out::println);
        
        // Step 4: Calculating the average salary using stream's built-in functions
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        
        System.out.println("\nAverage Salary: " + averageSalary);
        
        // Step 5: Filtering employees older than a given threshold (e.g., 30 years)
        int ageThreshold = 30;
        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getAge() > ageThreshold)
                .collect(Collectors.toList());
        
        System.out.println("\nEmployees older than " + ageThreshold + ":");
        filteredEmployees.forEach(e -> System.out.println(e.getName() + " (" + e.getAge() + " years)"));
    }
}
