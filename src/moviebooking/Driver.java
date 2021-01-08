package moviebooking;

public class Driver {
    public static void main(String[] args) {
        Movie movie = new Movie("KGF2",5000);
        // Total Expected Booking: 50 (10 x 5)
        for (int i = 0; i < 100; i++) {
            Transaction t = new Transaction(movie, Transaction.TransactionType.BOOK_TICKETS, 20);
            t.start();
        }
        // Total Expected Cancellation: 50 (10 x 5)
        for (int i = 0; i < 100; i++) {
            Transaction t = new Transaction(movie, Transaction.TransactionType.CANCEL_TICKETS, 10);
            t.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt(); // restore the interrupted state
        }

        // Expected account balance is 5000
        System.out.println("Final Remaining Seats: " + movie.getNumofSeats());
    }


    }

