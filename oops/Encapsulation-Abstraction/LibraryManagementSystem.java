abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println(itemId + " " + title + " " + author);
    }
}

class Book extends LibraryItem {
    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem book =
                new Book(1, "Java", "James");

        LibraryItem mag =
                new Magazine(2, "Tech World", "Editor");

        LibraryItem dvd =
                new DVD(3, "Avengers", "Marvel");

        book.displayItemDetails();
        System.out.println(book.getLoanDuration());

        mag.displayItemDetails();
        System.out.println(mag.getLoanDuration());

        dvd.displayItemDetails();
        System.out.println(dvd.getLoanDuration());
    }
}