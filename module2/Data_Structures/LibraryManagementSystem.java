package module2.Data_Structures;
class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {

    static Book linearSearch(Book[] books, String key) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(key)) {
                return books[i];
            }
        }
        return null;
    }

    static Book binarySearch(Book[] books, String key) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = books[mid].title.compareToIgnoreCase(key);

            if (result == 0) {
                return books[mid];
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Book[] books = {
            new Book(1, "C Programming", "Dennis"),
            new Book(2, "Data Structures", "Mark"),
            new Book(3, "Java", "James"),
            new Book(4, "Python", "Guido"),
            new Book(5, "Web Development", "John")
        };

        Book b1 = linearSearch(books, "Java");

        System.out.println("Linear Search");
        if (b1 != null) {
            System.out.println(b1.bookId + " " + b1.title);
        }

        Book b2 = binarySearch(books, "Java");

        System.out.println("Binary Search");
        if (b2 != null) {
            System.out.println(b2.bookId + " " + b2.title);
        }
    }
}