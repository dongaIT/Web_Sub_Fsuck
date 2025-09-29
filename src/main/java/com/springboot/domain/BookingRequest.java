package com.springboot.domain;

import java.util.List;

public class BookingRequest {
	private int adultPerson;
	private int studentPerson;
	private int childPerson;
	private int discountedPerson;
	private boolean isCouponApplied;
	private String couponCode;
	private String seatNumbers;
	private String customerName;
	private String customerPhone;
	
	// 체크박스 데이터를 받기 위한 리스트 추가
	private List<String> selectedSeats;
	
	public BookingRequest() {}

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
	public int getDiscountedPerson() {//레포트에는 적용 안된 메소드입니다...
		return discountedPerson;
	}
	public void setDiscountedPerson(int discountedPerson) {//레포트에는 적용 안된 메소드입니다...
		this.discountedPerson = discountedPerson;
	}
	public boolean isCouponApplied() { //레포트에는 적용 안된 메소드입니다...
		return isCouponApplied;
	}
	public void setCouponApplied(boolean isCouponApplied) {//레포트에는 적용 안된 메소드입니다...
		this.isCouponApplied = isCouponApplied;
	}
	public String getCouponCode() {//레포트에는 적용 안된 메소드입니다...
		return couponCode;
	}
	public void setCouponCode(String couponCode) {//레포트에는 적용 안된 메소드입니다...
		this.couponCode = couponCode;
	}
	public String getSeatNumbers() {
		return seatNumbers;
	}
	public void setSeatNumbers(String seatNumbers) {
		this.seatNumbers = seatNumbers;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public List<String> getSelectedSeats() {
		return selectedSeats;
	}
	public void setSelectedSeats(List<String> selectedSeats) {
		this.selectedSeats = selectedSeats;
	}
}