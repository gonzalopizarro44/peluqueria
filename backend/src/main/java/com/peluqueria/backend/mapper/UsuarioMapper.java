package com.peluqueria.backend.mapper;

import com.peluqueria.backend.dto.UsuarioDTO;
import com.peluqueria.backend.model.Usuario;

import java.util.stream.Collectors;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        if (usuario == null) return null;

        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setDni(usuario.getDni());
        dto.setNombre(usuario.getNombre());
        dto.setApellido(usuario.getApellido());
        dto.setEmail(usuario.getEmail());
        dto.setRol(usuario.getRol());

        if (usuario.getTurnos() != null) {
            dto.setTurnos(
                usuario.getTurnos().stream()
                        .map(TurnoMapper::toDTO)
                        .collect(Collectors.toList())
            );
        }

        return dto;
    }

    public static Usuario toEntity(UsuarioDTO dto) {
        if (dto == null) return null;

        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());
        usuario.setDni(dto.getDni());
        usuario.setNombre(dto.getNombre());
        usuario.setApellido(dto.getApellido());
        usuario.setEmail(dto.getEmail());
        usuario.setRol(dto.getRol());
        // La contraseña NO se maneja aquí

        return usuario;
    }
}
