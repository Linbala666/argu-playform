package com.argu.playform.service;

import com.argu.playform.dto.community.PostDemandRequest;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommunityService {

    public Map<String, Object> postDemand(PostDemandRequest request) {
        return Map.of("demand_id", 3001, "community_name", request.communityName(), "status", "PUBLISHED");
    }
}
