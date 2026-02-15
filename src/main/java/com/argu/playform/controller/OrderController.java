package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.order.CreateOrderRequest;
import com.argu.playform.dto.order.OrderItemResponse;
import com.argu.playform.enums.OrderStatus;
import com.argu.playform.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public ApiResponse<OrderItemResponse> create(@Valid @RequestBody CreateOrderRequest request) {
        return ApiResponse.success(orderService.createOrder(request));
    }

    @GetMapping("/list")
    public ApiResponse<List<OrderItemResponse>> list(@RequestParam(required = false) OrderStatus status) {
        return ApiResponse.success(orderService.listOrders(status));
    }
}
