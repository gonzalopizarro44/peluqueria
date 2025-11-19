package com.peluqueria.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.peluqueria.backend.model.estados_turnos;

@Repository
public interface EstadoTurnoRepository extends JpaRepository<estados_turnos, Long> {

}
