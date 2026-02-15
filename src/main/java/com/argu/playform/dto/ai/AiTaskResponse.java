package com.argu.playform.dto.ai;

import com.argu.playform.enums.AiTaskStatus;
import com.argu.playform.enums.AiTaskType;

import java.util.Map;

public record AiTaskResponse(
        Long id,
        AiTaskType taskType,
        Map<String, Object> inputData,
        Map<String, Object> outputData,
        AiTaskStatus status
) {
}
