package com.argu.playform.service;

import com.argu.playform.dto.finance.ApplyLoanRequest;
import com.argu.playform.dto.finance.LoanAuditItemResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class FinanceService {

    public Map<String, Object> applyLoan(ApplyLoanRequest request) {
        return Map.of("apply_id", 1, "status", "APPLYING", "amount", request.amount());
    }

    public List<LoanAuditItemResponse> auditList() {
        return List.of(new LoanAuditItemResponse(1L, "李大拿", 750, new BigDecimal("50000"), "RECOMMEND"));
    }
}
