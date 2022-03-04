import java.util.ArrayList;

public class Department {
    private String name;
    private double budget;
    private ArrayList<Employee> employeeList;

    public Department(String name, double budget, ArrayList<Employee> employeeList) {
        this.name = name;
        this.budget = budget;
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee e) {
        this.employeeList.add(e);
    }

    public void deleteEmployee(Employee e) {
        this.employeeList.remove(e);
    }

    public void printEmployees() {
        for (Employee e: employeeList) {
            e.printEmployee();
        }
    }

    public Employee searchEmployees(String firstName, String lastName) {
        Employee match = null;
        for (Employee e:employeeList) {
            if (e.getLastName().equals(lastName) && e.getFirstName().equals(firstName)) {
                match = e;
                break;
            }
        }
        return match;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
}
