package com.argu.playform.dto.ai;

import com.argu.playform.enums.AiTaskType;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

public record CreateAiTaskRequest(
        @NotNull(message = "taskType is required") AiTaskType taskType,
        @NotNull(message = "inputData is required") Map<String, Object> inputData
) {
}
