package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.entity.Payment;
import com.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService
{
 private PaymentRepository paymentRepository;

 @Autowired
 public PaymentServiceImpl(PaymentRepository paymentRepository)
 {
  this.paymentRepository = paymentRepository;
 }

 @Override
 public Payment save(Payment PaymentId)
 {
  Payment obj = paymentRepository.save(PaymentId);
  return obj;
 }
}
