package com.zakaria.CustomSecurityJwt.dto;


import com.zakaria.CustomSecurityJwt.annotation.ValidRole;
import com.zakaria.CustomSecurityJwt.constants.Role;
import com.zakaria.CustomSecurityJwt.constants.SellerStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @NotBlank(message = "Password cannot be blank")
        @Size(min = 5, message = "Password must be at least 5 characters")
        String password,

        @ValidRole(message = "Role must be valid")
        Role role,

        String name,
        String phoneNumber,
        SellerStatus sellerStatus
) {
}