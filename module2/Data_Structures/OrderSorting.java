package module2.Data_Structures;
import java.util.*;
class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
}

public class OrderSorting {

    static void bubbleSort(Order[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].totalPrice > arr[j + 1].totalPrice) {
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].totalPrice < pivot) {
                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void display(Order[] arr) {
        for (Order o : arr) {
            System.out.println(o.orderId + " " + o.customerName + " " + o.totalPrice);
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(1, "Ravi", 2500),
            new Order(2, "Priya", 1500),
            new Order(3, "Rahul", 4000),
            new Order(4, "Sneha", 3000)
        };

        bubbleSort(orders);
        System.out.println("After Bubble Sort");
        display(orders);

        Order[] orders2 = {
            new Order(1, "Ravi", 2500),
            new Order(2, "Priya", 1500),
            new Order(3, "Rahul", 4000),
            new Order(4, "Sneha", 3000)
        };

        quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort");
        display(orders2);
    }
}