package Java.Eight.Features;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private int salary;
    private LocalDate joiningDate;

    public Employees(String name, int salary, LocalDate joiningDate) {
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", joiningDate=" + joiningDate + "}";
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        // Sample list of Employee objects
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", 30000, LocalDate.of(2024, 3, 15)),
                new Employees("Bob", 20000, LocalDate.of(2022, 5, 20)),
                new Employees("Charlie", 28000, LocalDate.of(2024, 8, 10))
                // Add more employees here
        );

        // Filter employees based on salary and joining date
        List<Employees> filteredEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 25000 && emp.getJoiningDate().isAfter(LocalDate.of(2023, 1, 1)))
                .collect(Collectors.toList());

        // Display the filtered employees
        filteredEmployees.forEach(System.out::println);
        
        for(Employees e: filteredEmployees) {
        	System.out.println(e);
        }
    }
}


