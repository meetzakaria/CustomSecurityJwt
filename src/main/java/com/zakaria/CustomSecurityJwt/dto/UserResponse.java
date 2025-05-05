package com.zakaria.CustomSecurityJwt.dto;

import lombok.Getter;
import lombok.Setter;
import com.zakaria.CustomSecurityJwt.constants.Role;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private String name;
    private Role role;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}