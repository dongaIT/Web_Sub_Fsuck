package com.springboot.domain;

import java.math.BigDecimal;

public class Booking {
	private String bookingId;
	private String status;
	private String movieId;
	private int showtimeId;
	private int adultPerson;
	private int studentPerson;
	private int childPerson;
	private int discountedPerson;
	private int seatNumber;
	private BigDecimal totalPrice;
	private boolean isCouponApplied;
	
	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getShowtimeId() {
		return showtimeId;
	}

	public void setShowtimeId(int showtimeId) {
		this.showtimeId = showtimeId;
	}

	public int getAdultPerson() {
		return adultPerson;
	}

	public void setAdultPerson(int adultPerson) {
		this.adultPerson = adultPerson;
	}

	public int getStudentPerson() {
		return studentPerson;
	}

	public void setStudentPerson(int studentPerson) {
		this.studentPerson = studentPerson;
	}

	public int getChildPerson() {
		return childPerson;
	}

	public void setChildPerson(int childPerson) {
		this.childPerson = childPerson;
	}

	public int getDiscountedPerson() {
		return discountedPerson;
	}

	public void setDiscountedPerson(int discountedPerson) {
		this.discountedPerson = discountedPerson;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isCouponApplied() {
		return isCouponApplied;
	}

	public void setCouponApplied(boolean isCouponApplied) {
		this.isCouponApplied = isCouponApplied;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
}
