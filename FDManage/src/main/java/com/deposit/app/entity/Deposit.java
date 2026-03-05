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
	
	private static int amount;
	
	private static int year;
	
	private static int  interest;
	
	public Integer getFid() {
		return fid;
	}
	
	public void setFid(Integer fid) {
		Deposit.fid = fid;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		Deposit.year = year;
	}
	
	public int getInterest() {
		return interest;
	}
	
	public void setInterest(int interest) {
		Deposit.interest = interest;
	}
	
	public Deposit() {
		super();
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		Deposit.amount = amount;
	}
	
	public Deposit(int amount, int year, int interest) {
		super();
		Deposit.amount = amount;
		Deposit.year = year;
		Deposit.interest = interest;
	}
	
	@Override
	public String toString() {
		return "Deposit [fid=" + fid + ", amount=" + amount + ", year=" + year + ", interest=" + interest + "]";
	}
	
	
	

}
