package com.peluqueria.backend.mapper;

import com.peluqueria.backend.dto.EstadoTurnoDTO;
import com.peluqueria.backend.model.EstadoTurno;

public class EstadoTurnoMapper {

    public static EstadoTurnoDTO toDTO(EstadoTurno estado) {
        if (estado == null) return null;

        EstadoTurnoDTO dto = new EstadoTurnoDTO();
        dto.setId(estado.getId());
        dto.setNombre_estado(estado.getNombre_estado());
        return dto;
    }

    public static EstadoTurno toEntity(EstadoTurnoDTO dto) {
        if (dto == null) return null;

        EstadoTurno estado = new EstadoTurno();
        estado.setId(dto.getId());
        estado.setNombre_estado(dto.getNombre_estado());
        return estado;
    }
}
