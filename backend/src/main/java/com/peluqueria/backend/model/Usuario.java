package com.peluqueria.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dni;

    private String nombre;

    private String apellido;

    private String email;

    private String password;

    private Integer rol;  // 1=cliente, 2=barbero, 3=admin
}
