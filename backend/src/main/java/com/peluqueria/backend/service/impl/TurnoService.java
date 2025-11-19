package com.peluqueria.backend.service.impl;

import com.peluqueria.backend.model.Turno;
import com.peluqueria.backend.repository.TurnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {

    private final TurnoRepository turnoRepo;

    public TurnoService(TurnoRepository turnoRepo) {
        this.turnoRepo = turnoRepo;
    }

    public List<Turno> obtenerTodos() {
        return turnoRepo.findAll();
    }

    public Turno guardar(Turno turno) {
        return turnoRepo.save(turno);
    }

    public Turno obtenerPorId(Long id) {
        return turnoRepo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        turnoRepo.deleteById(id);
    }
}
