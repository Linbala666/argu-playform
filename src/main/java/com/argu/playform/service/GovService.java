package com.argu.playform.service;

import com.argu.playform.dto.gov.DashboardResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class GovService {

    public DashboardResponse dashboard() {
        return new DashboardResponse(
                new BigDecimal("12580000"),
                new BigDecimal("3000000"),
                500,
                List.of(
                        new DashboardResponse.PieData("水果", 40),
                        new DashboardResponse.PieData("蔬菜", 30),
                        new DashboardResponse.PieData("谷物", 30)
                ),
                new DashboardResponse.TradeTrendLine(List.of("1月", "2月", "3月"), List.of(100, 200, 350))
        );
    }
}
