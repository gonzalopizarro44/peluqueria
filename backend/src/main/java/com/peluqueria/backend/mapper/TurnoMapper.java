package com.peluqueria.backend.mapper;

import com.peluqueria.backend.dto.TurnoDTO;
import com.peluqueria.backend.model.Turno;
import java.time.LocalDate;
import java.time.LocalTime;

public class TurnoMapper {

    public static TurnoDTO toDTO(Turno turno) {
        if (turno == null) return null;

        TurnoDTO dto = new TurnoDTO();
        dto.setId(turno.getId());
        dto.setFecha(turno.getFecha() != null ? turno.getFecha().toString() : null);
        dto.setHora(turno.getHora() != null ? turno.getHora().toString() : null);
        if (turno.getBarbero() != null) dto.setBarberoId(turno.getBarbero().getId());
        dto.setEstado(EstadoTurnoMapper.toDTO(turno.getEstado()));

        return dto;
    }

    public static Turno toEntity(TurnoDTO dto) {
        if (dto == null) return null;

        Turno turno = new Turno();
        turno.setId(dto.getId());
        if (dto.getFecha() != null) turno.setFecha(LocalDate.parse(dto.getFecha()));
        if (dto.getHora() != null) turno.setHora(LocalTime.parse(dto.getHora()));
        // usuario y barbero NO se asignan acá — se setean desde service
        return turno;
    }
}
