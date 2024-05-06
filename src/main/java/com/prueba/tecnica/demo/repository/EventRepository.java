package com.prueba.tecnica.demo.repository;

import com.prueba.tecnica.demo.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}
