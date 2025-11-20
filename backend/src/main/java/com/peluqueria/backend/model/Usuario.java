package com.peluqueria.backend.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dni;

    private String nombre;

    private String apellido;

    private String email;

    private String password;

    // Ahora mappedBy apunta a "barbero" que existe en Turno
    @OneToMany(mappedBy = "barbero", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Turno> turnos;
    /*mappedBy debe coincidir con el nombre del atributo en la otra entidad.
     Como Turno tiene private Usuario barbero; el mappedBy correcto es "barbero". */

    private Integer rol;  // 1=cliente, 2=barbero, 3=admin
}
