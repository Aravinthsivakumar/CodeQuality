package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Deposit;

public interface DepositRepository extends JpaRepository<Deposit, Integer> {

}
