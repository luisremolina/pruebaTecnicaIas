package com.prueba.tecnica.demo.repository;

import com.prueba.tecnica.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
