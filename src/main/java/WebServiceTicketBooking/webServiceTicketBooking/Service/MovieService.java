package WebServiceTicketBooking.webServiceTicketBooking.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import WebServiceTicketBooking.webServiceTicketBooking.Entity.Movie;
import WebServiceTicketBooking.webServiceTicketBooking.Entity.Ticket;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();

    public MovieService() {
        movies.add(new Movie(1, "2024-08-05T18:00:00", 20));
        movies.add(new Movie(2, "2024-08-05T14:00:00", 50));
        movies.add(new Movie(3, "2024-08-05T10:00:00", 10));
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Ticket bookTicket(Ticket ticket) {
        for (Movie movie : movies) {
            if (movie.getMovieId() == ticket.getMovieId() && movie.getShowTime().equals(ticket.getShowTime())) {
                if (movie.getNumberOfTickets() >= ticket.getNumberOfTickets()) {
                    movie.setNumberOfTickets(movie.getNumberOfTickets() - ticket.getNumberOfTickets());
                    tickets.add(ticket);
                    return ticket;
                }
            }
        }
        return null; 
    }
}
