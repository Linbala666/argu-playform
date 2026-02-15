package com.argu.playform.dto.product;

import java.math.BigDecimal;
import java.util.List;

public record ProductItemResponse(
        Long id,
        String name,
        BigDecimal price,
        String farmerName,
        Integer matchScore,
        List<String> tags
) {
}
