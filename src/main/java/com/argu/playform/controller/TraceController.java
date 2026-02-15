package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.trace.AddTraceNodeRequest;
import com.argu.playform.dto.trace.TraceNodeResponse;
import com.argu.playform.service.TraceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trace")
public class TraceController {

    private final TraceService traceService;

    public TraceController(TraceService traceService) {
        this.traceService = traceService;
    }

    @PostMapping("/add_node")
    public ApiResponse<TraceNodeResponse> addNode(@Valid @RequestBody AddTraceNodeRequest request) {
        return ApiResponse.success(traceService.addNode(request));
    }

    @GetMapping("/detail")
    public ApiResponse<List<TraceNodeResponse>> detail(@RequestParam(name = "batch_no") String batchNo) {
        return ApiResponse.success(traceService.detail(batchNo));
    }
}
