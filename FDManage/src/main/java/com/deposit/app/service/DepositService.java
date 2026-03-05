package com.deposit.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deposit.app.entity.Deposit;
import com.deposit.app.repository.DepositRepository;

@Service
public class DepositService {
	
	@Autowired
	DepositRepository depositRepository;
	
	// Getting the value from Deposite repository and add to database
	public String addAmount(Deposit d){
		depositRepository.save(d);
		return "ok";
	}
	
	// get the data from database and send to deposite repository
	public List<Deposit> viewAmount() {
		return depositRepository.findAll();
	}
}
