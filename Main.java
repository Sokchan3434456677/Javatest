import java.util.Scanner;

abstract class Employee {
    private int employeeId;
    private String employeeName;
    private String employeePhone;

    public Employee(int employeeId, String employeeName, String employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String employeeName, String employeePhone, double monthlySalary) {
        super(employeeId, employeeName, employeePhone);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String employeeName, String employeePhone, double hourlyWage, int hoursWorked) {
        super(employeeId, employeeName, employeePhone);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a FullTimeEmployee
        System.out.println("Creating a Full-Time Employee");
        System.out.print("Enter employee ID: ");
        int fullTimeEmpId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name: ");
        String fullTimeEmpName = scanner.nextLine();
        System.out.print("Enter employee phone: ");
        String fullTimeEmpPhone = scanner.nextLine();
        System.out.print("Enter monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        scanner.nextLine(); 
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(fullTimeEmpId, fullTimeEmpName, fullTimeEmpPhone, monthlySalary);
        System.out.println("\nFull-Time Employee created successfully!");

        // Create a PartTimeEmployee
        System.out.println("\nCreating a Part-Time Employee");
        System.out.print("Enter employee ID: ");
        int partTimeEmpId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee name: ");
        String partTimeEmpName = scanner.nextLine();
        System.out.print("Enter employee phone: ");
        String partTimeEmpPhone = scanner.nextLine();
        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();
        scanner.nextLine(); 

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(partTimeEmpId, partTimeEmpName, partTimeEmpPhone, hourlyWage, hoursWorked);
        System.out.println("\nPart-Time Employee created successfully!");

        // Display employee details
        System.out.println("\nFull-Time Employee:");
        System.out.println("ID: " + fullTimeEmp.getEmployeeId());
        System.out.println("Name: " + fullTimeEmp.getEmployeeName());
        System.out.println("Phone: " + fullTimeEmp.getEmployeePhone());
        System.out.println("Salary: $" + fullTimeEmp.calculateSalary());

        System.out.println("\nPart-Time Employee:");
        System.out.println("ID: " + partTimeEmp.getEmployeeId());
        System.out.println("Name: " + partTimeEmp.getEmployeeName());
        System.out.println("Phone: " + partTimeEmp.getEmployeePhone());
        System.out.println("Salary: $" + partTimeEmp.calculateSalary());

        // Close the scanner
        scanner.close();
    }
}