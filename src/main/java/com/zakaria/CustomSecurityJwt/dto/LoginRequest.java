package com.zakaria.CustomSecurityJwt.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @NotBlank(message = "PhoneNumber cannot be blank")
        String phoneNumber,

        @NotBlank(message = "Password cannot be blank")
        String password
) {
}