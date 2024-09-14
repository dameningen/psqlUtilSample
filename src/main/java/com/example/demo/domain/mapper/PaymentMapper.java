package com.example.demo.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.model.Payment;

@Mapper
public interface PaymentMapper {

    // TODO 集計用SQLを実行するメソッドを定義する
    List<Payment> getDailyPaymentCount();

    // 全件抽出
    List<Payment> findAll();

}
