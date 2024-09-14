package com.example.demo.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private long paymentId;
    private int customerId;
    private int staffId;
    private int rentalId;
    private float amount;
    private LocalDateTime paymentDate;
    // TODO 集計結果（SQLで集計したcount）
    private long count;
}
