package employeeManagementSystem;

import java.util.*;

/**
 * The EmployeeManager class provides a simple console-based system
 * to manage employees in an organization or company. It allows adding, viewing,
 * searching, updating, and deleting employee records.
 */
public class EmployeeManager {

    /** List that stores all employee records */
    private static ArrayList<Employee> employees = new ArrayList<>();

    /**
     * Entry point of the program. Displays a menu for the user to manage employees.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("===== Menu: choose your option: =====");
            System.out.println("1. Add employee");
            System.out.println("2. View all employees");
            System.out.println("3. Search employee by ID");
            System.out.println("4. Update employee details");
            System.out.println("5. Delete employee");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    searchEmployeeById();
                    break;
                case 4:
                    updateEmployeeById();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid input, please try again");
            }
        }
    }

    /**
     * Adds a new employee to the system by prompting the user for input.
     */
    public static void addEmployee() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("===== Add Employee =====");

        System.out.print("ID: ");
        int id = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Name: ");
        String name = keyboard.nextLine();

        System.out.print("Salary: ");
        int salary = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Department: ");
        String department = keyboard.nextLine();

        Employee newEmployee = new Employee(id, name, salary, department);
        employees.add(newEmployee);

        System.out.println("Employee added successfully.");
    }

    /**
     * Displays all employees currently stored in the system.
     */
    public static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees to display.");
        } else {
            System.out.println("===== Employee List =====");
            for (Employee emp : employees) {
                System.out.println(emp.toString());
            }
        }
    }

    /**
     * Searches for an employee by ID and displays their information if found.
     */
    public static void searchEmployeeById() {
        Scanner keyboard = new Scanner(System.in);
        boolean found = false;

        System.out.println("ID: ");
        int employeeId = keyboard.nextInt();

        for (Employee emp : employees) {
            if (emp.getId() == employeeId) {
                System.out.println("===== Employee Found =====");
                System.out.println(emp.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    /**
     * Updates the details of an employee by ID.
     * Allows updating name, department, or salary.
     */
    public static void updateEmployeeById() {
        Scanner keyboard = new Scanner(System.in);
        boolean found = false;

        System.out.println("ID: ");
        int employeeId = keyboard.nextInt();

        for (Employee emp : employees) {
            if (emp.getId() == employeeId) {
                found = true;

                System.out.println("===== Employee found =====");
                System.out.println(emp.toString());
                System.out.println("===== Update =====");
                System.out.println("1. Name");
                System.out.println("2. Department");
                System.out.println("3. Salary");
                System.out.print("Choice: ");
                int choice = keyboard.nextInt();
                keyboard.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String newName = keyboard.nextLine();
                        emp.setName(newName);
                        break;
                    case 2:
                        System.out.print("Enter new department: ");
                        String newDept = keyboard.nextLine();
                        emp.setDepartment(newDept);
                        break;
                    case 3:
                        System.out.print("Enter new salary: ");
                        int newSalary = keyboard.nextInt();
                        emp.setSalary(newSalary);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }

                System.out.println("Employee details updated.");
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    /**
     * Deletes an employee from the system based on the provided ID.
     */
    public static void deleteEmployee() {
        Scanner keyboard = new Scanner(System.in);
        boolean found = false;

        System.out.println("ID: ");
        int employeeId = keyboard.nextInt();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employeeId) {
                employees.remove(i);
                System.out.println("Employee deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
