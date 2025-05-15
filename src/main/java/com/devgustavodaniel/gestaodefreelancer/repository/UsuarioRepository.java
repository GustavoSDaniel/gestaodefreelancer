package com.devgustavodaniel.gestaodefreelancer.repository;

import com.devgustavodaniel.gestaodefreelancer.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
