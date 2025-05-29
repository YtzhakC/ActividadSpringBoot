package com.Ytzhak.SpringBoot.repository;

import com.Ytzhak.SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
