package com.argu.playform.service;

import com.argu.playform.dto.live.LiveFeedResponse;
import com.argu.playform.dto.live.StartLiveRequest;
import org.springframework.stereotype.Service;

@Service
public class LiveService {

    public LiveFeedResponse start(StartLiveRequest request) {
        return new LiveFeedResponse(888L, "rtmp://live.nongliantong.com/live888", "LIVE");
    }

    public LiveFeedResponse feed() {
        return new LiveFeedResponse(888L, "rtmp://live.nongliantong.com/live888", "LIVE");
    }
}
