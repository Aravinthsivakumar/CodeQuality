package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Deposit;
import com.example.demo.repository.DepositRepository;

@Service
public class DepositService {
	
	@Autowired
	DepositRepository repo;
	
	public String addAmount(Deposit d){
		repo.save(d);
		return "ok";
	}

	public List<Deposit> viewAmount() {
		return repo.findAll();
	}
}
