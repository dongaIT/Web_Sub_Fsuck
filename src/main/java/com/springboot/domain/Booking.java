package com.springboot.domain;

public class Booking {
    private String bookingId;
    private String customerName; 
    private String customerPhone; 
    private String seatNumber; 
    private int adultPerson;
    private int studentPerson;
    private int childPerson;
    
    public Booking() {
    }
    
    // getter/setter methods
    
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
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
}