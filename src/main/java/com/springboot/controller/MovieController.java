package com.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.springboot.domain.Movie;
import com.springboot.domain.Booking;
import com.springboot.domain.BookingRequest;
import com.springboot.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public String requestMovieList(Model model) {
		List<Movie> list = movieService.getAllMovieList();
		model.addAttribute("movieList", list);
	return "movie";
	}
	
	@GetMapping("/booking/{movieId}")
	public String requestBookingPage(@PathVariable("movieId") String movieId, Model model) {
		model.addAttribute("movieId", movieId); 
		model.addAttribute("bookingRequest", new BookingRequest());
		return "booking";
	}
	
	@PostMapping("/write-information")
	public String writeInformation(@ModelAttribute("bookingRequest") BookingRequest bookingRequest, Model model) {
	    model.addAttribute("bookingRequest", bookingRequest);
	    return "information";
	}
	
    @PostMapping("/select-seats") 
    public String selectSeats(@ModelAttribute("bookingRequest") BookingRequest bookingRequest, Model model) {
        model.addAttribute("bookingRequest", bookingRequest);
        return "select-seats";
    }

	@PostMapping("/process-payment")
    public String processPayment(@ModelAttribute("bookingRequest") BookingRequest bookingRequest, Model model) {
        model.addAttribute("bookingRequest", bookingRequest);
        return "payments";
    }

	@PostMapping("/confirm-booking")
	public String confirmBooking(@ModelAttribute("bookingRequest") BookingRequest bookingRequest) {
		Booking finalBooking = new Booking();
		finalBooking.setBookingId("BOOK" + System.currentTimeMillis()); 
		finalBooking.setAdultPerson(bookingRequest.getAdultPerson());
		finalBooking.setStudentPerson(bookingRequest.getStudentPerson());
		finalBooking.setChildPerson(bookingRequest.getChildPerson());
		finalBooking.setCustomerName(bookingRequest.getCustomerName());
		finalBooking.setCustomerPhone(bookingRequest.getCustomerPhone());
		finalBooking.setSeatNumber(String.join(",", bookingRequest.getSelectedSeats()));
		
		movieService.saveBooking(finalBooking);
		
		System.out.println("최종 예약이 메모리 DB에 저장되었습니다.");
		return "redirect:/movies"; 
	}
}