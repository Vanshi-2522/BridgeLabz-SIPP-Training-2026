// MovieTicket class
class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // Book ticket
    public void bookTicket(
            String seatNumber,
            double price) {

        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Display ticket details
    public void displayTicket() {

        System.out.println("Movie Name : "
                + movieName);

        System.out.println("Seat Number : "
                + seatNumber);

        System.out.println("Price : "
                + price);
    }
}

// Main class
public class MovieTicketBooking {

    public static void main(String[] args) {

        MovieTicket ticket =
                new MovieTicket("Avengers Endgame");

        ticket.bookTicket("A12", 250);

        ticket.displayTicket();
    }
}