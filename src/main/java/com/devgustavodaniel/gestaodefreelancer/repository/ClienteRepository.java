package com.devgustavodaniel.gestaodefreelancer.repository;

import com.devgustavodaniel.gestaodefreelancer.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
