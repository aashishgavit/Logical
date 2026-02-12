package DSA;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class SortEmployee {
    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee("Aashish", 50000),
                new Employee("Rahul", 70000),
                new Employee("Amit", 40000)
        );

        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
