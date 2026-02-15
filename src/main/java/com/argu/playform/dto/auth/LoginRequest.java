package com.argu.playform.dto.auth;

import com.argu.playform.enums.RoleType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LoginRequest(
        @NotBlank(message = "username is required") String username,
        @NotBlank(message = "password is required") String password,
        @NotNull(message = "role is required") RoleType role
) {
}
