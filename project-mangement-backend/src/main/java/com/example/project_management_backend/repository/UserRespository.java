package com.example.project_management_backend.repository;

import com.example.project_management_backend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<UserEntity, Long> {
}
