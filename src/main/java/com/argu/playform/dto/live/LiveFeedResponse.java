package com.argu.playform.dto.live;

public record LiveFeedResponse(
        Long roomId,
        String streamUrl,
        String status
) {
}
