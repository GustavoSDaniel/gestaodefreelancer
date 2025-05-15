package com.devgustavodaniel.gestaodefreelancer.repository;

import com.devgustavodaniel.gestaodefreelancer.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
