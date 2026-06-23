package module2.Data_Structures;
// import java.util.*;
// class Product {
//     int productId;
//     String productName;
//     String category;

//     Product(int productId, String productName, String category) {
//         this.productId = productId;
//         this.productName = productName;
//         this.category = category;
//     }
// }

// public class EcommercePlatform {

//     static Product linearSearch(Product[] products, int target) {
//         for (int i = 0; i < products.length; i++) {
//             if (products[i].productId == target) {
//                 return products[i];
//             }
//         }
//         return null;
//     }

//     static Product binarySearch(Product[] products, int target) {
//         int low = 0;
//         int high = products.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (products[mid].productId == target) {
//                 return products[mid];
//             } else if (products[mid].productId < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }

//         return null;
//     }

//     public static void main(String[] args) {

//         Product[] products = {
//             new Product(101, "Laptop", "Electronics"),
//             new Product(102, "Mobile", "Electronics"),
//             new Product(103, "Shoes", "Fashion"),
//             new Product(104, "Watch", "Accessories"),
//             new Product(105, "Book", "Education")
//         };

//         int target = 104;

//         Product p1 = linearSearch(products, target);
//         System.out.println("Linear Search:");
//         if (p1 != null) {
//             System.out.println(p1.productName);
//         }

//         Product p2 = binarySearch(products, target);
//         System.out.println("Binary Search:");
//         if (p2 != null) {
//             System.out.println(p2.productName);
//         }
//     }
// }