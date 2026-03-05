package com.deposit.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deposit.app.entity.Deposit;

public interface DepositRepository extends JpaRepository<Deposit, Integer> {

}
