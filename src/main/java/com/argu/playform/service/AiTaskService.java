package com.argu.playform.service;

import com.argu.playform.dto.ai.AiTaskResponse;
import com.argu.playform.dto.ai.CreateAiTaskRequest;
import com.argu.playform.enums.AiTaskStatus;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AiTaskService {

    public AiTaskResponse createTask(CreateAiTaskRequest request) {
        return new AiTaskResponse(
                9001L,
                request.taskType(),
                request.inputData(),
                Map.of("result", "mock-output", "url", "http://example.com/result.mp4"),
                AiTaskStatus.SUCCESS
        );
    }
}
