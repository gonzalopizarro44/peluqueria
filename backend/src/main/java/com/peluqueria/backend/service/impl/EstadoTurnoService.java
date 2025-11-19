package com.peluqueria.backend.service.impl;

import com.peluqueria.backend.model.estados_turnos;
import com.peluqueria.backend.repository.EstadoTurnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoTurnoService {

    private final EstadoTurnoRepository estadosRepo;

    public EstadoTurnoService(EstadoTurnoRepository estadosRepo) {
        this.estadosRepo = estadosRepo;
    }

    public List<estados_turnos> obtenerTodos() {
        return estadosRepo.findAll();
    }

    public estados_turnos guardar(estados_turnos estado) {
        return estadosRepo.save(estado);
    }

    public estados_turnos obtenerPorId(Long id) {
        return estadosRepo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        estadosRepo.deleteById(id);
    }
}
