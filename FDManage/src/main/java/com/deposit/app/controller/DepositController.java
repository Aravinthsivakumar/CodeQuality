package com.deposit.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deposit.app.entity.Deposit;
import com.deposit.app.service.DepositService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/deposit")
public class DepositController {
	
	@Autowired
	DepositService depositeService;
	
	// Add the data to database in a object format
	@PostMapping
	public String addAmount(@RequestBody Deposit d){
		depositeService.addAmount(d);
		return "ok";
	}
	
	// Getting the value from the backend and stored in List 
	@GetMapping
	public List<Deposit> viewAmount() {
		return depositeService.viewAmount();
	}
	
	

}
