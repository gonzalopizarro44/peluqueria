package com.peluqueria.backend.service.impl;

import com.peluqueria.backend.model.EstadoTurno;
import com.peluqueria.backend.repository.EstadoTurnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoTurnoService {

    private final EstadoTurnoRepository estadosRepo;

    public EstadoTurnoService(EstadoTurnoRepository estadosRepo) {
        this.estadosRepo = estadosRepo;
    }

    public List<EstadoTurno> obtenerTodos() {
        return estadosRepo.findAll();
    }

    public EstadoTurno guardar(EstadoTurno estado) {
        return estadosRepo.save(estado);
    }

    public EstadoTurno obtenerPorId(Long id) {
        return estadosRepo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        estadosRepo.deleteById(id);
    }
}
