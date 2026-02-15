package com.argu.playform.dto.product;

public record RecommendPlantingResponse(
        String cropName,
        String reason,
        String estimatedProfit
) {
}
