package com.argu.playform.dto.community;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record PostDemandRequest(
        @NotBlank(message = "communityName is required") String communityName,
        @NotBlank(message = "contactPerson is required") String contactPerson,
        @NotEmpty(message = "demandList is required") List<String> demandList
) {
}
