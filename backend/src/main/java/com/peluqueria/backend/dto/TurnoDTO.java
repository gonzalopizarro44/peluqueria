package com.peluqueria.backend.dto;

import lombok.Data;

@Data
public class TurnoDTO {

    private Long id;
    private String fecha;
    private String hora;

    private Long usuarioId;        // ID del cliente del turno
    private Long barberoId;        // ID del barbero que atiende
    private EstadoTurnoDTO estado; // Estado (Pendiente, Confirmado, etc.)
}
