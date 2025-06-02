package com.zakaria.CustomSecurityJwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Long id;
    private long customer_id;
}
