package com.devgustavodaniel.gestaodefreelancer.repository;

import com.devgustavodaniel.gestaodefreelancer.model.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {
}
