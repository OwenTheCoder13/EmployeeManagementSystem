package employeeManagementSystem;

/**
 * Represents an employee with basic details such as ID, name, salary, and department.
 */
public class Employee {
    private int id;
    private String name;
    private int salary;
    private String department;

    /**
     * Constructs an Employee object with the specified details.
     *
     * @param id         the unique ID of the employee
     * @param name       the name of the employee
     * @param salary     the salary of the employee
     * @param department the department where the employee works
     */
    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter methods

    /**
     * Returns the ID of the employee.
     *
     * @return employee ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the employee.
     *
     * @return employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the salary of the employee.
     *
     * @return employee salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Returns the department of the employee.
     *
     * @return employee department
     */
    public String getDepartment() {
        return department;
    }

    // Setter methods

    /**
     * Updates the salary of the employee.
     *
     * @param salary the new salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Updates the name of the employee.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Updates the department of the employee.
     *
     * @param department the new department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Returns a string representation of the employee.
     *
     * @return formatted employee details
     */
    public String toString() {
        return "ID: " + id + " Name: " + name + " Salary: $" + salary + " Department: " + department;
    }
}
