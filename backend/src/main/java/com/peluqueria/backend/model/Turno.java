package com.peluqueria.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

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

    // Barbero: referencia a usuarios.id (column barbero_id)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "barbero_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference   // evita recursión al serializar Usuario -> Turno -> Usuario...
    private Usuario barbero;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Column(name = "dni_cliente")
    private Integer dniCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado", referencedColumnName = "id", nullable = false)
    private EstadoTurno estado;

    @Column(name = "precio")
    private java.math.BigDecimal precio;

    @Column(name = "fecha_reserva")
    private java.time.LocalDateTime fechaReserva;

    @Column(name = "version")
    private Integer version;
}
