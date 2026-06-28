class Main {

    public static void main(String[] args) {

        TaskManagementSystem tms =
                new TaskManagementSystem();

        tms.addTask(
                1,
                "Design Homepage",
                "Pending");

        tms.addTask(
                2,
                "Develop Backend",
                "In Progress");

        tms.addTask(
                3,
                "Testing",
                "Pending");

        System.out.println(
                "All Tasks:");

        tms.displayTasks();

        System.out.println(
                "\nSearching Task 2:");

        Task task =
                tms.searchTask(2);

        if (task != null)
            System.out.println(task);
        else
            System.out.println(
                    "Task Not Found.");

        System.out.println(
                "\nDeleting Task 2");

        tms.deleteTask(2);

        System.out.println(
                "\nTasks After Deletion:");

        tms.displayTasks();
    }
}