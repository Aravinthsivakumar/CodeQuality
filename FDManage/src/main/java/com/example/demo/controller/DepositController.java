package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Deposit;
import com.example.demo.service.DepositService;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/deposit")
public class DepositController {
	@Autowired
	DepositService ds;
	
	@PostMapping
	public String addAmount(@RequestBody Deposit d){
		ds.addAmount(d);
		return "ok";
	}
	
	@GetMapping
	public List<Deposit> viewAmount() {
		return ds.viewAmount();
	}
	
	

}
