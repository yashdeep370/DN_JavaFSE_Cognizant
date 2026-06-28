class EmployeeManagementSystem {

    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count == employees.length) {
            System.out.println("Array is Full.");
            return;
        }

        employees[count] = employee;
        count++;

        System.out.println("Employee Added.");
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }

        return null;
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found.");
            return;
        }

        for (int i = index;
             i < count - 1;
             i++) {

            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted.");
    }

    // Traverse
    public void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employees Found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}