package com.java.beans;

import javax.validation.constraints.Size;

public class Card {
	@Size(min=16,message="please enter correct card details")
private String creditCardNumber;	
private String validFrom;
private String validTo;
private String balance;
private String userId;
public String getCreditCardNumber() {
	return creditCardNumber;
}
public void setCreditCardNumber(String creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
}
public String getValidFrom() {
	return validFrom;
}
public void setValidFrom(String validFrom) {
	this.validFrom = validFrom;
}
public String getValidTo() {
	return validTo;
}
public void setValidTo(String validTo) {
	this.validTo = validTo;
}
public String getBalance() {
	return balance;
}
public void setBalance(String balance) {
	this.balance = balance;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}



}
