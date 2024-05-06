package com.prueba.tecnica.demo.repository;

import com.prueba.tecnica.demo.models.EventRegister;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRegisterRepository extends JpaRepository<EventRegister, String> {


    List<EventRegister> findAllByUserId(String userId);

}
