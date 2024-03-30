// Transaction.java
package com.yourpackage.model;

public class Transaction {
    private String mobileNo;
    private double amount;
    private double rechargeAmount;
	public Transaction(String mobileNo, double amount, double rechargeAmount) {
		super();
		this.mobileNo = mobileNo;
		this.amount = amount;
		this.rechargeAmount = rechargeAmount;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRechargeAmount() {
		return rechargeAmount;
	}
	public void setRechargeAmount(double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
     
    
}
