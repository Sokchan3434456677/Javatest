import java.util.Scanner;

class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, String employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String name, String employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating instances of FullTimeEmployee and PartTimeEmployee
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Full-Time Employee details:");
        System.out.print("Name: ");
        String ftName = scanner.nextLine();
        System.out.print("Employee ID: ");
        String ftEmployeeId = scanner.nextLine();
        System.out.print("Salary: ");
        double ftSalary = scanner.nextDouble();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(ftName, ftEmployeeId, ftSalary);

        System.out.println("\nEnter Part-Time Employee details:");
        scanner.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        String ptName = scanner.nextLine();
        System.out.print("Employee ID: ");
        String ptEmployeeId = scanner.nextLine();
        System.out.print("Hourly Rate: ");
        double ptHourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        double ptHoursWorked = scanner.nextDouble();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(ptName, ptEmployeeId, ptHourlyRate, ptHoursWorked);

        scanner.close();

        // Displaying employee details
        System.out.println("\nFull-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println();

        System.out.println("Part-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println();

        // Calculating and printing salaries
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
}