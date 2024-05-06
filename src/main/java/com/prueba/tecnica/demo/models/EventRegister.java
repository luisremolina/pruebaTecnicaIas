package com.prueba.tecnica.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@Entity(name = "eventregistry")
@NoArgsConstructor
public class EventRegister {
    @Id
    private String id;
    @Column(name = "id_event")
    private String event_id;
    @Column(name = "id_user")
    private String user_id;
}
