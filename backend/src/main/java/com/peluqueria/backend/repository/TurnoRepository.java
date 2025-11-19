package com.peluqueria.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.peluqueria.backend.model.turnos;

@Repository
public interface TurnoRepository extends JpaRepository<turnos, Long> {

}
