package com.zakaria.CustomSecurityJwt.repository;

import com.zakaria.CustomSecurityJwt.constants.Role;
import com.zakaria.CustomSecurityJwt.constants.SellerStatus;
import com.zakaria.CustomSecurityJwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByPhoneNumber(String email);

    boolean existsByPhoneNumber(String email);

    List<User> findByRole(Role role);

    List<User> findByRoleAndSellerStatus(Role role, SellerStatus sellerStatus);
}