package com.springboot.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.springboot.domain.Movie;
import com.springboot.domain.Booking;

@Repository
public class MovieRepositoryImpl implements MovieRepository {
	
	private List<Movie> listOfMovie = new ArrayList<>();
	private List<Booking> listOfBooking = new ArrayList<>();

	public MovieRepositoryImpl() {
		Movie movie1 = new Movie();
		movie1.setTitle("귀멸의 칼날 무한성");
		movie1.setDuration("155분");
		movie1.setMovieId("IXJ9304");
		movie1.setDirector("소토자키 하루오");
		
		Movie movie2 = new Movie();
		movie2.setTitle("F1 더 무비");
		movie2.setDirector("조셉 코센스키");
		movie2.setDuration("155분");
		movie2.setMovieId("IDA9305");
		
		Movie movie3 = new Movie();
		movie3.setTitle("대부 1");
		movie3.setDirector("프란시스 포드 코폴라");
		movie3.setDuration("175분");
		movie3.setMovieId("IDA9306");
		
		listOfMovie.add(movie1);
		listOfMovie.add(movie2);
		listOfMovie.add(movie3);

		// 디버깅용.. 출력메시지 
        System.out.println("영화 목록이 생성되었습니다. 총 " + listOfMovie.size() + "개");
	}
	
	@Override
	public List<Movie> getAllMovieList(){
        // 디버깅용.. 출력메시지 
        System.out.println("MovieService에서 영화 목록을 요청했습니다.");
		return listOfMovie;
	}
	
	@Override
	public void save(Booking booking) {
	    listOfBooking.add(booking);
	    System.out.println("================= 예약 저장 완료 =================");
	    System.out.println("예약 ID: " + booking.getBookingId());
	    System.out.println("예약자 이름: " + booking.getCustomerName());
	    System.out.println("선택 좌석: " + booking.getSeatNumber());
	    int totalPeople = booking.getAdultPerson() + booking.getStudentPerson() + booking.getChildPerson();
	    System.out.println("총 인원: " + totalPeople + "명"); 
	    System.out.println("=================================================");
	}
}