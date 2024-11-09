package com.ecommerce.paymentservice.dtos;

import lombok.Getter;

@Getter
public class InitiatePaymentRequestDto {
    private long orderId;
    private long amount;
}
