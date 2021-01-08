package moviebooking;

public class Movie {
	private String movieName;
	private int numofSeats;


	public String getMovieName() {
		return movieName;
	}


	public int getNumofSeats() {
		return numofSeats;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Movie(String movieName, int numofSeats) {
		this.movieName = movieName;
		this.numofSeats = numofSeats;
	}

	public  synchronized boolean  bookTicket(int seats){
		if(seats > this.numofSeats || seats<=0){
			return false;
		}else{
			this.numofSeats-=seats;
			return true;
		}
	}

	public  synchronized boolean cancelTickets(int seats){
		if(seats > numofSeats){
			return false;
		}else{
			numofSeats+=seats;
			return true;
		}
	}
}
