package WebServiceTicketBooking.webServiceTicketBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import WebServiceTicketBooking.webServiceTicketBooking.Entity.Movie;
import WebServiceTicketBooking.webServiceTicketBooking.Entity.Ticket;
import WebServiceTicketBooking.webServiceTicketBooking.Service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/getmovies")
	public List<Movie> getMovies()
	{
		return movieService.getMovies();
	}
	
	@PostMapping("/bookticket")
	public Ticket bookTicket(@RequestBody Ticket ticket)
	{
		return movieService.bookTicket(ticket);
	}
}
