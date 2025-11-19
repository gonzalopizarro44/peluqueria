package com.peluqueria.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.peluqueria.backend.model.EstadoTurno;

@Repository
public interface EstadoTurnoRepository extends JpaRepository<EstadoTurno, Long> {

}
