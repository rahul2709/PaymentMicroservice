package com.example.microservices.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentId;
	public int getPaymentId() {
		return paymentId;
	}

	/*
	 * public void setPaymentId(int paymentId) { this.paymentId = paymentId; }
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	private String paymentStatus;
	private String transactionId;
	public void setTransactionId(String string) {
		// TODO Auto-generated method stub
		
	}

}
