package com.peluqueria.backend.controller;

import com.peluqueria.backend.model.Turno;
import com.peluqueria.backend.service.impl.TurnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private final TurnoService turnoService;

    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @GetMapping
    public List<Turno> obtenerTodos() {
        return turnoService.obtenerTodos();
    }

    @PostMapping
    public Turno crear(@RequestBody Turno turno) {
        return turnoService.guardar(turno);
    }

    @GetMapping("/{id}")
    public Turno obtenerPorId(@PathVariable Long id) {
        return turnoService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        turnoService.eliminar(id);
    }
}
