package moviebooking;

public class Transaction extends Thread {
    public static enum TransactionType {
        BOOK_TICKETS(1), CANCEL_TICKETS(2);

        private TransactionType(int value) {
        }
    };

    private TransactionType transactionType;
    private Movie movie;
    private int seats;

    public Transaction(Movie movie, TransactionType transactionType, int seats) {
        this.transactionType = transactionType;
        this.movie = movie;
        this.seats = seats;
    }

    public void run() {
        switch (this.transactionType) {
            case BOOK_TICKETS:
                bookTicket();
                printTickets();
                break;
            case CANCEL_TICKETS:
                cancelTicket();
                printTickets();
                break;
            default:
                System.out.println("NOT A VALID TRANSACTION");
        }
    }

    public  void bookTicket() {
        this.movie.bookTicket(this.seats);
    }

    public  void cancelTicket() {
        this.movie.cancelTickets(this.seats);
    }

    public  void printTickets() {
        System.out.println(Thread.currentThread().getName() + " : bookingType: " + this.transactionType + ", Seats: " + this.seats);
    }



}
