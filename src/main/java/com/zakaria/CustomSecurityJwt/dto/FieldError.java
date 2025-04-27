package com.zakaria.CustomSecurityJwt.dto;

public record FieldError(
        String field,
        String errorCode,
        String errorMessage
) {
}