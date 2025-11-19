package com.peluqueria.backend.controller;

import com.peluqueria.backend.model.EstadoTurno;
import com.peluqueria.backend.service.impl.EstadoTurnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados-turnos")
public class EstadoTurnoController {

    private final EstadoTurnoService estadoService;

    public EstadoTurnoController(EstadoTurnoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public List<EstadoTurno> obtenerTodos() {
        return estadoService.obtenerTodos();
    }

    @PostMapping
    public EstadoTurno crear(@RequestBody EstadoTurno estado) {
        return estadoService.guardar(estado);
    }

    @GetMapping("/{id}")
    public EstadoTurno obtenerPorId(@PathVariable Long id) {
        return estadoService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        estadoService.eliminar(id);
    }
}
