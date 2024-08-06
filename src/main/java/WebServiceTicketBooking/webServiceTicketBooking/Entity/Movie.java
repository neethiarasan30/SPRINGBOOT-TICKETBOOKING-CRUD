package WebServiceTicketBooking.webServiceTicketBooking.Entity;

public class Movie {
	
	int movieId;
	String showTime;
	int numberOfTickets;
	
	public Movie() {
		super();
	}

	public Movie(int movieId, String showTime, int numberOfTickets) {
		super();
		this.movieId = movieId;
		this.showTime = showTime;
		this.numberOfTickets = numberOfTickets;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	
	
	
}
