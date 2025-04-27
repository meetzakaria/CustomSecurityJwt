package com.zakaria.CustomSecurityJwt.dto;

import jakarta.validation.constraints.Email;
import com.zakaria.CustomSecurityJwt.constants.Role;

public record UserUpdateRequest(
        @Email(message = "Email should be valid")
        String email,

        Role role,
        String firstName,
        String lastName,
        String phoneNumber
) {
}