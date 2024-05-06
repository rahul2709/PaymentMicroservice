package com.example.microservices.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservices.demo.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	

}
