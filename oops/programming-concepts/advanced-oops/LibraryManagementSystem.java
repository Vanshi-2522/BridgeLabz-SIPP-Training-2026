class Book {

    static String libraryName = "City Library";

    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {

        if (this instanceof Book) {
            System.out.println(isbn + " " + title + " " + author);
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book b1 = new Book("B101", "Java", "James");

        Book.displayLibraryName();
        b1.display();
    }
}