package com.argu.playform.dto.order;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CreateOrderRequest(
        @NotNull(message = "buyerId is required") Long buyerId,
        @NotEmpty(message = "items is required") List<@Valid OrderItem> items,
        List<String> processingCodes
) {
    public record OrderItem(
            @NotNull(message = "productId is required") Long productId,
            @NotNull(message = "qty is required") @Min(value = 1, message = "qty must >= 1") Integer qty
    ) {
    }
}
