package edu.udea.telefonia.repository;

import edu.udea.telefonia.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}