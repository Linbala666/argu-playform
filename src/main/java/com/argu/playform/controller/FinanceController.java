package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.finance.ApplyLoanRequest;
import com.argu.playform.dto.finance.LoanAuditItemResponse;
import com.argu.playform.service.FinanceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FinanceController {

    private final FinanceService financeService;

    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @PostMapping("/finance/apply_loan")
    public ApiResponse<Map<String, Object>> applyLoan(@Valid @RequestBody ApplyLoanRequest request) {
        return ApiResponse.success(financeService.applyLoan(request));
    }

    @GetMapping("/gov/loan/audit_list")
    public ApiResponse<List<LoanAuditItemResponse>> auditList() {
        return ApiResponse.success(financeService.auditList());
    }
}
