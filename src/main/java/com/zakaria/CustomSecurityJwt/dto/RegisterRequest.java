package com.zakaria.CustomSecurityJwt.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import com.zakaria.CustomSecurityJwt.annotation.ValidRole;
import com.zakaria.CustomSecurityJwt.constants.Role;

public record RegisterRequest(
        @NotBlank(message = "Email cannot be blank")
        @Email(message = "Email should be valid")
        String email,

        @NotBlank(message = "Password cannot be blank")
        @Size(min = 5, message = "Password must be at least 5 characters")
        String password,

        @ValidRole(message = "Role must be valid")
        Role role,

        String firstName,
        String lastName,
        String phoneNumber
) {
}