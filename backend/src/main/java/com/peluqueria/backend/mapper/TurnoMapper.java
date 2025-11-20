package com.peluqueria.backend.mapper;

import com.peluqueria.backend.dto.TurnoDTO;
import com.peluqueria.backend.model.Turno;

public class TurnoMapper {

    public static TurnoDTO toDTO(Turno turno) {
        if (turno == null) return null;

        TurnoDTO dto = new TurnoDTO();
        dto.setId(turno.getId());
        dto.setFecha(turno.getFecha());
        dto.setHora(turno.getHora());
        dto.setUsuarioId(turno.getUsuario().getId());
        dto.setEstado(EstadoTurnoMapper.toDTO(turno.getEstadoTurno()));

        return dto;
    }

    public static Turno toEntity(TurnoDTO dto) {
        if (dto == null) return null;

        Turno turno = new Turno();
        turno.setId(dto.getId());
        turno.setFecha(dto.getFecha());
        turno.setHora(dto.getHora());
        // usuario y barbero NO se asignan acá — se setean desde service
        return turno;
    }
}
