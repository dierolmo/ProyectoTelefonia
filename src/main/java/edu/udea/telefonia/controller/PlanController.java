package edu.udea.telefonia.controller;

import edu.udea.telefonia.model.Plan;
import edu.udea.telefonia.service.PlanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/planes")
public class PlanController {

    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    // Listar todos los planes
    @GetMapping
    public String listarPlanes(Model model) {
        model.addAttribute("listaPlanes", planService.listarTodos());
        return "planes/lista";
    }

    // Mostrar el formulario para crear un plan nuevo
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("plan", new Plan());
        return "planes/formulario";
    }

    // Guardar el plan en la base de datos
    @PostMapping("/guardar")
    public String guardarPlan(@ModelAttribute("plan") Plan plan) {
        planService.guardar(plan);
        return "redirect:/planes";
    }
}