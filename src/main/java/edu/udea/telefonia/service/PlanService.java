package edu.udea.telefonia.service;

import edu.udea.telefonia.model.Plan;
import java.util.List;

public interface PlanService {
    List<Plan> listarTodos();
    Plan guardar(Plan plan);
}