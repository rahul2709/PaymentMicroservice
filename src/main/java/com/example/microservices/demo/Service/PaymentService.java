package com.example.microservices.demo.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.microservices.demo.Entity.Payment;
import com.example.microservices.demo.Repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private  PaymentRepository repository;
	
	public Payment doPayment(@RequestBody Payment payment) {
		
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
		
	}
	
	

}
