package com.argu.playform.dto.finance;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ApplyLoanRequest(
        @NotNull(message = "amount is required") @Min(value = "0.0", inclusive = false, message = "amount must > 0") BigDecimal amount,
        @NotBlank(message = "purpose is required") String purpose,
        @NotNull(message = "authData is required") Boolean authData
) {
}
