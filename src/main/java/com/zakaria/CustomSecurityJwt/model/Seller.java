package com.zakaria.CustomSecurityJwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Seller {
    @Id
    @GeneratedValue
    private Long id;

    private String companyName;

    @OneToOne
    private User user;
}
