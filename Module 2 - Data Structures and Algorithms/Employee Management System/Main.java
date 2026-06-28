class Main {

    public static void main(String[] args) {

        EmployeeManagementSystem ems =
                new EmployeeManagementSystem(10);

        ems.addEmployee(
                new Employee(
                        101,
                        "Yash",
                        "Software Engineer",
                        60000));

        ems.addEmployee(
                new Employee(
                        102,
                        "Rahul",
                        "Tester",
                        45000));

        ems.addEmployee(
                new Employee(
                        103,
                        "Priya",
                        "Manager",
                        85000));

        System.out.println(
                "\nAll Employees:");

        ems.displayEmployees();

        System.out.println(
                "\nSearching Employee 102:");

        Employee employee =
                ems.searchEmployee(102);

        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Not Found");

        System.out.println(
                "\nDeleting Employee 102");

        ems.deleteEmployee(102);

        System.out.println(
                "\nEmployees After Deletion:");

        ems.displayEmployees();
    }
}