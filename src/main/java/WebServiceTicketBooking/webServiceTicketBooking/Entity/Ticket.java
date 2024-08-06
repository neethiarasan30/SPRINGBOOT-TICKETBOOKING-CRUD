package WebServiceTicketBooking.webServiceTicketBooking.Entity;

public class Ticket {
	int userId;
	int movieId;
	String showTime;
	int numberOfTickets;
	
	public Ticket(int userId, int movieId, String showTime, int numberOfTickets) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.showTime = showTime;
		this.numberOfTickets = numberOfTickets;
	}

	public Ticket() {
	
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
