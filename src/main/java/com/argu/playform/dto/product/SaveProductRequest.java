package com.argu.playform.dto.product;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

public record SaveProductRequest(
        Long id,
        @NotBlank(message = "name is required") String name,
        @NotNull(message = "categoryId is required") Long categoryId,
        @NotNull(message = "basePrice is required") @DecimalMin(value = "0.0", inclusive = false, message = "basePrice must > 0") BigDecimal basePrice,
        @NotNull(message = "stock is required") @Min(value = 0, message = "stock must >= 0") Integer stock,
        @NotNull(message = "freshDays is required") @Min(value = 0, message = "freshDays must >= 0") Integer freshDays,
        @NotBlank(message = "originAddress is required") String originAddress,
        @NotBlank(message = "gpsLocation is required") String gpsLocation,
        @NotEmpty(message = "images is required") List<String> images,
        @Valid List<ProcessingOption> processingOptions,
        @Valid List<TieredPricingRule> tieredPricing
) {
    public record ProcessingOption(
            @NotBlank(message = "processing option code is required") String code,
            @NotBlank(message = "processing option name is required") String name,
            @NotNull(message = "processing option extraCost is required") BigDecimal extraCost
    ) {
    }

    public record TieredPricingRule(
            @NotNull(message = "tier minQty is required") @Min(value = 1, message = "tier minQty must >= 1") Integer minQty,
            @NotNull(message = "tier discountRate is required") @DecimalMin(value = "0.0", inclusive = false, message = "tier discountRate must > 0") BigDecimal discountRate
    ) {
    }
}
