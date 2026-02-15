package com.argu.playform.dto.trace;

public record TraceNodeResponse(
        String batchNo,
        String actionName,
        String operator,
        String location,
        String imageUrl,
        String description,
        String actionTime
) {
}
