package com.argu.playform.service;

import com.argu.playform.dto.auth.LoginRequest;
import com.argu.playform.dto.auth.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public LoginResponse login(LoginRequest request) {
        return new LoginResponse(
                "eyJhbGciOiJIUzI1NiJ9.mock-token",
                new LoginResponse.UserInfo(1001L, "李大拿", "http://oss.aliyun.com/avatar.jpg", 750)
        );
    }
}
