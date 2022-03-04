import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListsTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee("Albert", "Martin", new Address("498 El Camino Real", "Santa Clara", new char[]{'C', 'A'}));
        Employee e2 = new Employee("Betty", "Gomez", new Address("505 Market Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e3 = new Employee("Charles", "Jessup", new Address("596 Alviso Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e4 = new Employee("Deborah", "Terry", new Address("384 Bellomy Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e5 = new Employee("Eleanor", "Rashburn", new Address("873 Lafayette Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e6 = new Employee("Fred", "Spain", new Address("761 Harrison Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e7 = new Employee("George", "Herbert", new Address("473 El Camino Real", "Santa Clara", new char[]{'C', 'A'}));
        Employee e8 = new Employee("Helena", "Kennedy", new Address("572 Market Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e9 = new Employee("Ingo", "Moore", new Address("613 Alviso Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e10 = new Employee("Jackson", "Cooper", new Address("453 Bellomy Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e11 = new Employee("Kathleen", "Dawson", new Address("910 Lafayette Street", "Santa Clara", new char[]{'C', 'A'}));
        Employee e12 = new Employee("Laura", "Khan", new Address("785 Harrison Street", "Santa Clara", new char[]{'C', 'A'}));

        Department d = new Department("Faculty", 1340000,new ArrayList<Employee>(Arrays.asList(e1, e2, e3, e4, e5, e6)));

        System.out.println("Welcome to the " + d.getName() + " department.");
        System.out.println();

        System.out.println("Here is the initial employee list:");
        d.printEmployees();
        System.out.println();

        System.out.println("Options:");
        System.out.println("(1) Add an employee to the department");
        System.out.println("(2) Delete an employee from the department");
        System.out.println("(3) Print the employees of the department");
        System.out.println("(4) Search for an employee in the department");
        System.out.println("Enter the number corresponding to the desired activity, or -1 to exit the program.");
        System.out.print("Choice: ");

        int input = sc.nextInt();
        System.out.println();

        switch (input) {
            case 1:
                d.addEmployee(e7);
                d.addEmployee(e8);
                System.out.println("Employees added!");
                break;
            case 2:
                d.deleteEmployee(e1);
                d.deleteEmployee(e2);
                System.out.println("Employees deleted.");
                break;
            case 3:
                System.out.println("Employees in department:");
                d.printEmployees();
                break;
            case 4:
                System.out.print("Enter the first name of the employee: ");
                String fName = sc.next();
                System.out.print("Enter the last name of the employee: ");
                String lName = sc.next();
                System.out.println();
                Employee match = d.searchEmployees(fName, lName);
                if (match != null) {
                    System.out.println("Here are the desired employee's details:");
                    match.printEmployee();
                }
                else
                    System.out.println("Employee not found.");
                break;
            default:
                System.out.println("Number chosen not a listed option. Please try again.");
                break;
        }

        System.out.println();
        System.out.println("Here's the final list of employees:");
        d.printEmployees();
        System.out.println();
        System.out.println("System closing...");

    }


}
