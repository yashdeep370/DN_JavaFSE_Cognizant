class TaskManagementSystem {

    private Task head;

    public TaskManagementSystem() {
        head = null;
    }

    // Add Task
    public void addTask(int id,
                        String name,
                        String status) {

        Task newTask =
                new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }

    // Display Tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println(
                    "No Tasks Found.");
            return;
        }

        Task temp = head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // Search Task
    public Task searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            System.out.println(
                    "List is Empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println(
                    "Task Deleted.");
            return;
        }

        Task temp = head;

        while (temp.next != null &&
               temp.next.taskId != id) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(
                    "Task Not Found.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println(
                "Task Deleted.");
    }
}