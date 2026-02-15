package com.argu.playform.dto.auth;

public record LoginResponse(String token, UserInfo userInfo) {
    public record UserInfo(Long id, String name, String avatar, Integer creditScore) {
    }
}
