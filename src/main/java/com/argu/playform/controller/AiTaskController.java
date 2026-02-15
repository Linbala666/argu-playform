package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.ai.AiTaskResponse;
import com.argu.playform.dto.ai.CreateAiTaskRequest;
import com.argu.playform.service.AiTaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai/task")
public class AiTaskController {

    private final AiTaskService aiTaskService;

    public AiTaskController(AiTaskService aiTaskService) {
        this.aiTaskService = aiTaskService;
    }

    @PostMapping("/create")
    public ApiResponse<AiTaskResponse> create(@Valid @RequestBody CreateAiTaskRequest request) {
        return ApiResponse.success(aiTaskService.createTask(request));
    }
}
