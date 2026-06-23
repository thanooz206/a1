package module2.Data_Structures;
// import java.util.*;

// class Product {
//     int productId;
//     String productName;
//     int quantity;
//     double price;

//     Product(int productId, String productName, int quantity, double price) {
//         this.productId = productId;
//         this.productName = productName;
//         this.quantity = quantity;
//         this.price = price;
//     }
// }

// public class InventoryManagementSystem{

//     static HashMap<Integer, Product> inventory = new HashMap<>();

//     static void add(Product p) {
//         inventory.put(p.productId, p);
//     }

//     static void update(int id, int quantity) {
//         if (inventory.containsKey(id)) {
//             inventory.get(id).quantity = quantity;
//         }
//     }

//     static void delete(int id) {
//         inventory.remove(id);
//     }

//     static void display() {
//         for (Product p : inventory.values()) {
//             System.out.println(
//                 p.productId + " " +
//                 p.productName + " " +
//                 p.quantity + " " +
//                 p.price
//             );
//         }
//     }

//     public static void main(String[] args) {

//         add(new Product(101, "Laptop", 10, 50000));
//         add(new Product(102, "Mobile", 20, 25000));
//         add(new Product(103, "Mouse", 50, 500));

//         System.out.println("Products");
//         display();

//         update(102, 30);

//         System.out.println("\nAfter Update");
//         display();

//         delete(103);

//         System.out.println("\nAfter Delete");
//         display();
//     }
// }