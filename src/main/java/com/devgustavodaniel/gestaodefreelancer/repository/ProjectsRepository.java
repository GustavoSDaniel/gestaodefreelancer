package com.devgustavodaniel.gestaodefreelancer.repository;

import com.devgustavodaniel.gestaodefreelancer.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Project, Long> {
}
