package com.argu.playform.service;

import com.argu.playform.dto.order.CreateOrderRequest;
import com.argu.playform.dto.order.OrderItemResponse;
import com.argu.playform.enums.OrderStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    public OrderItemResponse createOrder(CreateOrderRequest request) {
        return new OrderItemResponse(
                5001L,
                "2024101012000099",
                new BigDecimal("5600.00"),
                OrderStatus.PENDING,
                Map.of("processing_codes", request.processingCodes() == null ? List.of() : request.processingCodes()),
                List.of(Map.of("product_id", 101L, "qty", 200, "unit_price", "28.00"))
        );
    }

    public List<OrderItemResponse> listOrders(OrderStatus status) {
        return List.of(
                new OrderItemResponse(
                        5001L,
                        "2024101012000099",
                        new BigDecimal("5600.00"),
                        status == null ? OrderStatus.PENDING : status,
                        Map.of("snapshot", "mock"),
                        List.of(Map.of("product_id", 101L, "qty", 200, "unit_price", "28.00"))
                )
        );
    }
}
