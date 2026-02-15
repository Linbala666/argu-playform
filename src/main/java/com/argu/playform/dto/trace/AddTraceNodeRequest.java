package com.argu.playform.dto.trace;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AddTraceNodeRequest(
        @NotNull(message = "productId is required") Long productId,
        @NotBlank(message = "batchNo is required") String batchNo,
        @NotBlank(message = "actionName is required") String actionName,
        @NotBlank(message = "operator is required") String operator,
        @NotBlank(message = "location is required") String location,
        String imageUrl,
        String description
) {
}
