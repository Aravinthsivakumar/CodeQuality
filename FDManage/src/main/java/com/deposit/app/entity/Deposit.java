package com.deposit.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deposit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static Integer fid;
	
	// principle amount
	private static int amount;
	
	// Number of year to be going to invest
	private static int year;
	
	// Rate of Intrest
	private static int  interest;
	
	// Getting the finance Id
	public Integer getFid() {
		return fid;
	}
	
	// Setting value to finance Id
	public void setFid(Integer fid) {
		Deposit.fid = fid;
	}
	
	// Getting the year
	public int getYear() {
		return year;
	}
	
	// Setting the year
	public void setYear(int year) {
		Deposit.year = year;
	}
	
	// Getting the Interest percentage
	public int getInterest() {
		return interest;
	}
	
	// Setting the Interest percentage
	public void setInterest(int interest) {
		Deposit.interest = interest;
	}
	
	// Getting the Amount value
	public int getAmount() {
		return amount;
	}
	
	// Setting the Amount value
	public void setAmount(int amount) {
		Deposit.amount = amount;
	}
	
	// used for declaring the Deposit class
	public Deposit() {
		super();
	}
	
	// object fo adding the data to database
	public Deposit(int amount, int year, int interest) {
		super();
		Deposit.amount = amount;
		Deposit.year = year;
		Deposit.interest = interest;
	}
	
	// Return the value from the database
	@Override
	public String toString() {
		return "Deposit [fid=" + fid + ", amount=" + amount + ", year=" + year + ", interest=" + interest + "]";
	}
	
	
	

}
