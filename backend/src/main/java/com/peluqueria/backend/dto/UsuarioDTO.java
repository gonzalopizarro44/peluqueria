package com.peluqueria.backend.dto;

import lombok.Data;
import java.util.List;

@Data
public class UsuarioDTO {

    private Long id;
    private Integer dni;
    private String nombre;
    private String apellido;
    private String email;
    private Integer rol;

    private List<TurnoDTO> turnos;  // Lista de turnos del usuario
    //TODO seguramente en un futuro traiga problemas, quiero listado de turnos de cada barbero, no de cada cliente
}
