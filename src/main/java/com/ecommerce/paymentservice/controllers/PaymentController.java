package com.ecommerce.paymentservice.controllers;


import com.ecommerce.paymentservice.dtos.InitiatePaymentRequestDto;
import com.ecommerce.paymentservice.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@AllArgsConstructor
public class PaymentController {

    private PaymentService paymentService;

    @PostMapping()
    public String initiatePayment(InitiatePaymentRequestDto dto) {
        return paymentService.initiatePayment(dto.getOrderId(), dto.getAmount());
    }
}
