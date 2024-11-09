package com.ecommerce.paymentservice.models;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Currency extends BaseModel {
    private String name;
    private String code;
}
