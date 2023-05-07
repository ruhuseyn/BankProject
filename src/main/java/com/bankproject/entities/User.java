package com.bankproject.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "age")
    Integer age;
    @Column(name = "salary")
    Double salary;
    @Column
    String ownership;
    @Column(name = "employment_time")
    Double employmentTime;
    @Column(name = "loan_purpose")
    String loanPurposes;
    @Column(name = "credit_amount")
    Double creditAmount;

    @Column(name = "loan_rate")
    Double loanRate;
    @Column(name = "credit_status")
    Integer creditStatus;
    @Column(name = "loan_percentage")
    Double loanPercentage;
    @Column(name = "payment_history")
    Integer paymentHistory;
    @Column(name = "credit_history_length")
    Integer creditHistoryLength;

}
