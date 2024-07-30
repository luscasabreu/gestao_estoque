package com.backend.gestaoestoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.gestaoestoque.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
