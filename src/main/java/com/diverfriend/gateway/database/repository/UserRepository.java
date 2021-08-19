package com.diverfriend.gateway.database.repository;

import com.diverfriend.gateway.database.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
