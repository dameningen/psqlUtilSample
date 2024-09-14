package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.mapper.PaymentMapper;
import com.example.demo.domain.model.Payment;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PaymentRepository {

    private final PaymentMapper paymentMapper;

    public List<Payment> getDailyPaymentCount() {
        return paymentMapper.getDailyPaymentCount();
    }

    public List<Payment> findAll() {
        return paymentMapper.findAll();
    }

}
