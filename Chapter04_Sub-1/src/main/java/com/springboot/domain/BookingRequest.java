package com.springboot.domain;

public class BookingRequest {
	private int adultPerson;
	private int studentPerson;
	private int childPerson;
	private int discountedPerson;
	private boolean isCouponApplied;
	private String couponCode;
	private String seatNumber;
	
	public BookingRequest() {
		super();
		// TODO Auto-generated constructor stub
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
	public boolean isCouponApplied() {
		return isCouponApplied;
	}
	public void setCouponApplied(boolean isCouponApplied) {
		this.isCouponApplied = isCouponApplied;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
}   
