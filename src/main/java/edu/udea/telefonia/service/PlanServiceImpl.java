package edu.udea.telefonia.service;

import edu.udea.telefonia.model.Plan;
import edu.udea.telefonia.repository.PlanRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    private final PlanRepository planRepository;

    public PlanServiceImpl(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @Override
    public List<Plan> listarTodos() {
        return planRepository.findAll();
    }

    @Override
    public Plan guardar(Plan plan) {
        return planRepository.save(plan);
    }
}