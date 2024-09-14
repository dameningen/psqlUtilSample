package com.example.demo.domain.service;

import java.util.List;

import com.example.demo.domain.model.Payment;

public interface PaymentService {

    List<Payment> getCount();

    List<Payment> findAll();

}
