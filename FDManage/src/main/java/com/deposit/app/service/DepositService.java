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
	
	public String addAmount(Deposit d){
		depositRepository.save(d);
		return "ok";
	}

	public List<Deposit> viewAmount() {
		return depositRepository.findAll();
	}
}
