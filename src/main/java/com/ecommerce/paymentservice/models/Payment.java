package com.ecommerce.paymentservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Payment extends BaseModel{
    private String orderId;
    private Long amount;
    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;
    private PaymentStatus status;
}
