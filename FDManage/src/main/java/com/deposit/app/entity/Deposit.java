package com.deposit.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deposit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fid;
	private int amount;
	private int year;
	private int interest;
	
	
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	public Deposit() {
		super();
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Deposit(Integer fid, int amount, int year, int interest) {
		super();
		this.fid = fid;
		this.amount = amount;
		this.year = year;
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Deposit [fid=" + fid + ", amount=" + amount + ", year=" + year + ", interest=" + interest + "]";
	}
	
	
	

}
