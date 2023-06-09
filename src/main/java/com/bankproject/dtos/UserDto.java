package com.bankproject.dtos;

import jakarta.persistence.Column;

public record UserDto(

        Integer age,
        Double salary,
        String ownership,
        Double employmentTime,
        String loanPurposes,
        Double creditAmount,
        String education,
        Double loanRate,
        Integer creditStatus,
        Double loanPercentage,
        Integer paymentHistory,
        Integer creditHistoryLength
) {
}
