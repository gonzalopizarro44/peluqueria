package com.peluqueria.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "turnos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fecha;

    private String hora;

    // Relación con usuarios
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    // Relación con estados_turnos
    @ManyToOne
    @JoinColumn(name = "estado_turno_id", referencedColumnName = "id")
    private EstadoTurno estadoTurno;
}
