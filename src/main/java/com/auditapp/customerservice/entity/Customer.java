package com.auditapp.customerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    
    private String fullName;
    private String status;
    private Integer couponsAlloted;
    private String membershipStartDate;
    private String membershipEndDate;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    private Integer paymentPercentage;
    private String salesExecutiveName;
}

enum PaymentStatus {
    DONE, PARTIALLY_DONE, PENDING;
}
