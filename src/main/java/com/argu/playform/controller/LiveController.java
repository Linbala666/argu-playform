package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.live.LiveFeedResponse;
import com.argu.playform.dto.live.StartLiveRequest;
import com.argu.playform.service.LiveService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/live")
public class LiveController {

    private final LiveService liveService;

    public LiveController(LiveService liveService) {
        this.liveService = liveService;
    }

    @PostMapping("/start")
    public ApiResponse<LiveFeedResponse> start(@Valid @RequestBody StartLiveRequest request) {
        return ApiResponse.success(liveService.start(request));
    }

    @GetMapping("/feed")
    public ApiResponse<LiveFeedResponse> feed() {
        return ApiResponse.success(liveService.feed());
    }
}
