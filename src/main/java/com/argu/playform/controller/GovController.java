package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.gov.DashboardResponse;
import com.argu.playform.service.GovService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gov/stats")
public class GovController {

    private final GovService govService;

    public GovController(GovService govService) {
        this.govService = govService;
    }

    @GetMapping("/dashboard")
    public ApiResponse<DashboardResponse> dashboard() {
        return ApiResponse.success(govService.dashboard());
    }
}
