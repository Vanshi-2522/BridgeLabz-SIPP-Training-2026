class Book {

    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title,
                String author,
                double price) {

        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {

        if (available) {

            available = false;

            System.out.println(
                    "Book Borrowed");
        } else {

            System.out.println(
                    "Not Available");
        }
    }

    public void display() {

        System.out.println(
                title + " "
                        + available);
    }
}

public class LibraryBookSystem {

    public static void main(String[] args) {

        Book book =
                new Book(
                        "Java",
                        "James",
                        700);

        book.borrowBook();

        book.display();
    }
}