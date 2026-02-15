package com.argu.playform.dto.live;

import com.argu.playform.enums.RoleType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record StartLiveRequest(
        @NotBlank(message = "title is required") String title,
        @NotBlank(message = "coverImg is required") String coverImg,
        @NotNull(message = "anchorType is required") RoleType anchorType,
        @NotEmpty(message = "linkedProducts is required") List<Long> linkedProducts
) {
}
