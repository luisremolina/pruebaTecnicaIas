package com.prueba.tecnica.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@Entity(name = "users")
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String name;
    private String age;
}
