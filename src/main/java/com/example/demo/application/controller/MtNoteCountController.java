package com.example.demo.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.resource.Response;
import com.example.demo.domain.model.Payment;
import com.example.demo.domain.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api")
@Slf4j
public class MtNoteCountController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/mtnotecount")
    public ResponseEntity<Response<List<Payment>>> getMtNoteCount() {

        Response<List<Payment>> response = new Response<>();
        List<Payment> subInfo = paymentService.getCount();
        response.setData(subInfo);

        log.info("★response：" + response);

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/findall")
    public ResponseEntity<Response<List<Payment>>> findAllPayment() {

        Response<List<Payment>> response = new Response<>();
        List<Payment> subInfo = paymentService.findAll();
        response.setData(subInfo);

        log.info("★response：" + response);

        return ResponseEntity.ok(response);
    }

}
