package com.zakaria.CustomSecurityJwt.dto;

import com.zakaria.CustomSecurityJwt.constants.Role;

public record UserUpdateRequest(
        String name,
        Role role,
        String password,
        String phoneNumber
) {
}