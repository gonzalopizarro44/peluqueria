package com.peluqueria.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estados_turnos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstadoTurno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_estado;
}
