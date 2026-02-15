package com.argu.playform.dto.order;

import com.argu.playform.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public record OrderItemResponse(
        Long id,
        String orderNo,
        BigDecimal totalAmount,
        OrderStatus status,
        Map<String, Object> processSnapshot,
        List<Map<String, Object>> items
) {
}
