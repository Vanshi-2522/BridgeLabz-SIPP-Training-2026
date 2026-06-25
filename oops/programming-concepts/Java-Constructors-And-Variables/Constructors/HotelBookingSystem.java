class HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {

        this("Guest",
                "Standard",
                1);
    }

    public HotelBooking(
            String guestName,
            String roomType,
            int nights) {

        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(
            HotelBooking booking) {

        this(
                booking.guestName,
                booking.roomType,
                booking.nights);
    }

    public void display() {

        System.out.println(
                guestName + " "
                        + roomType + " "
                        + nights);
    }
}

public class HotelBookingSystem {

    public static void main(String[] args) {

        HotelBooking h1 =
                new HotelBooking();

        HotelBooking h2 =
                new HotelBooking(
                        "Rahul",
                        "Deluxe",
                        3);

        HotelBooking h3 =
                new HotelBooking(h2);

        h1.display();
        h2.display();
        h3.display();
    }
}