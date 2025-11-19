package com.peluqueria.backend.service.impl;

import com.peluqueria.backend.model.Usuario;
import com.peluqueria.backend.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuariosRepo;
    public UsuarioService(UsuarioRepository usuariosRepo) {
        this.usuariosRepo = usuariosRepo;
    }

    public List<Usuario> obtenerTodos() {
        return usuariosRepo.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return usuariosRepo.save(usuario);
    }

    public Usuario obtenerPorId(Long id) {
        return usuariosRepo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        usuariosRepo.deleteById(id);
    }
}
