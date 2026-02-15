package com.argu.playform.dto.gov;

import java.math.BigDecimal;
import java.util.List;

public record DashboardResponse(
        BigDecimal totalTradeVolume,
        BigDecimal loanTotal,
        Integer farmerCount,
        List<PieData> categoryPieData,
        TradeTrendLine tradeTrendLine
) {
    public record PieData(String name, Integer value) {
    }

    public record TradeTrendLine(List<String> dates, List<Integer> values) {
    }
}
