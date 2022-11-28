package com.java.beans;


public class Reservation {
private int reservationId;	
private int scheduleId;
private int userId;
private String bookingDate;
private String journeyDate;
private String noOfSeats;
private String totalFare;
private String bookingStatus;
public int getReservationId() {
	return reservationId;
}
public void setReservationId(int reservationId) {
	this.reservationId = reservationId;
}
public int getScheduleId() {
	return scheduleId;
}
public void setScheduleId(int scheduleId) {
	this.scheduleId = scheduleId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getBookingDate() {
	return bookingDate;
}
public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
}
public String getJourneyDate() {
	return journeyDate;
}
public void setJourneyDate(String journeyDate) {
	this.journeyDate = journeyDate;
}
public String getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(String noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getTotalFare() {
	return totalFare;
}
public void setTotalFare(String totalFare) {
	this.totalFare = totalFare;
}
public String getBookingStatus() {
	return bookingStatus;
}
public void setBookingStatus(String bookingStatus) {
	this.bookingStatus = bookingStatus;
}


}
