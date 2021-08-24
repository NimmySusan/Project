package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.entity.Payment;
import com.payment.service.PaymentService;

@RestController
@RequestMapping("/")
public class PaymentController
{
 private PaymentService paymentService;

 @Autowired
 public PaymentController(PaymentService paymentService)
 {
  this.paymentService = paymentService;
 }

 @PostMapping("/payment")
 public ResponseEntity<Payment> save(@RequestBody Payment PaymentId)
 {
  Payment obj = paymentService.save(PaymentId);
  return new ResponseEntity<Payment>(obj,HttpStatus.CREATED);
 }
}
