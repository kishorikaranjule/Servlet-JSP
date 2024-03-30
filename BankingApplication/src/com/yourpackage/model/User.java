package com.yourpackage.model;

public class User {
	
	 private String userId;
	    private double balance;

	    public User(String userId, double balance) {
	        this.userId = userId;
	        this.balance = balance;
	    }

	    public String getUserId() {
	        return userId;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

}
