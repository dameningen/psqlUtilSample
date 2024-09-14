package com.example.demo.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Payment;
import com.example.demo.domain.repository.PaymentRepository;
import com.example.demo.domain.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getCount() {
        paymentRepository.getDailyPaymentCount();
        return paymentRepository.getDailyPaymentCount();
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

}
