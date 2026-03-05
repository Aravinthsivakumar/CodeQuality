package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Deposit;

@SpringBootTest
class FdManageApplicationTests {
	
	@Test
	void testDoSomething() 
	{
		Deposit deposit = new Deposit();
		assertNull(deposit.getFid());
	}

}
