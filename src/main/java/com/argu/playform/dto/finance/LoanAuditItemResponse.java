package com.argu.playform.dto.finance;

import java.math.BigDecimal;

public record LoanAuditItemResponse(
        Long applyId,
        String farmerName,
        Integer creditScore,
        BigDecimal applyAmount,
        String systemSuggest
) {
}
