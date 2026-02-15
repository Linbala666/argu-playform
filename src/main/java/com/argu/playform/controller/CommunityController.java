package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.community.PostDemandRequest;
import com.argu.playform.service.CommunityService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/community")
public class CommunityController {

    private final CommunityService communityService;

    public CommunityController(CommunityService communityService) {
        this.communityService = communityService;
    }

    @PostMapping("/demand/post")
    public ApiResponse<Map<String, Object>> postDemand(@Valid @RequestBody PostDemandRequest request) {
        return ApiResponse.success(communityService.postDemand(request));
    }
}
