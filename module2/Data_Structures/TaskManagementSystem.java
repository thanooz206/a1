package module2.Data_Structures;
class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }
}

public class TaskManagementSystem {

    static Task head = null;

    static void add(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

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

    static void search(int id) {
        Task temp = head;

        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println(temp.taskId + " " + temp.taskName);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    static void display() {
        Task temp = head;

        while (temp != null) {
            System.out.println(
                temp.taskId + " " +
                temp.taskName + " " +
                temp.status
            );
            temp = temp.next;
        }
    }

    static void delete(int id) {
        if (head == null) {
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {

        add(1, "Design UI", "Pending");
        add(2, "Write Code", "In Progress");
        add(3, "Testing", "Pending");

        System.out.println("Tasks");
        display();

        System.out.println("\nSearch");
        search(2);

        System.out.println("\nDelete Task 2");
        delete(2);

        System.out.println("\nAfter Delete");
        display();
    }
}