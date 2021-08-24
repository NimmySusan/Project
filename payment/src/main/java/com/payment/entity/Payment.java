package com.payment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long PaymentId;
	private String PaymentMode;
	private Long AccountNumber;
	private String BankName;
	
	public Payment() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Payment(Long paymentId, String paymentMode, Long accountNumber, String bankName) {
	super();
	PaymentId = paymentId;
	PaymentMode = paymentMode;
	AccountNumber = accountNumber;
	BankName = bankName;
	}
	public Long getPaymentId() {
	return PaymentId;
	}
	public void setPaymentId(Long paymentId) {
	PaymentId = paymentId;
	}
	public String getPaymentMode() {
	return PaymentMode;
	}
	public void setPaymentMode(String paymentMode) {
	PaymentMode = paymentMode;
	}
	public Long getAccountNumber() {
	return AccountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
	AccountNumber = accountNumber;
	}
	public String getBankName() {
	return BankName;
	}
	public void setBankName(String bankName) {
	BankName = bankName;
	}
	 
	 

	
}
