package module2.Data_Structures;
class Employee {
    int employeeId;
    String name;
    String position;
    int salary;

    Employee(int employeeId, String name, String position, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

public class EmployeeManagement {

    static Employee[] emp = new Employee[10];
    static int n = 0;

    static void add(Employee e) {
        emp[n++] = e;
    }

    static void search(int id) {
        for (int i = 0; i < n; i++) {
            if (emp[i].employeeId == id) {
                System.out.println(emp[i].employeeId + " " + emp[i].name);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    static void display() {
        for (int i = 0; i < n; i++) {
            System.out.println(
                emp[i].employeeId + " " +
                emp[i].name + " " +
                emp[i].position + " " +
                emp[i].salary
            );
        }
    }

    static void delete(int id) {
        for (int i = 0; i < n; i++) {
            if (emp[i].employeeId == id) {

                for (int j = i; j < n - 1; j++) {
                    emp[j] = emp[j + 1];
                }

                n--;
                break;
            }
        }
    }

    public static void main(String[] args) {

        add(new Employee(101, "Ravi", "Manager", 50000));
        add(new Employee(102, "Priya", "Developer", 40000));
        add(new Employee(103, "Rahul", "Tester", 35000));

        System.out.println("Employees");
        display();

        System.out.println("\nSearch");
        search(102);

        System.out.println("\nDelete Employee 102");
        delete(102);

        System.out.println("\nAfter Delete");
        display();
    }
}