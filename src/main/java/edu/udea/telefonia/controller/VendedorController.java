package edu.udea.telefonia.controller;

import edu.udea.telefonia.model.Vendedor;
import edu.udea.telefonia.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/vendedores")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    // ruta para listar todos los vendedores
    @GetMapping
    public String listarVendedores(Model model) {
        model.addAttribute("vendedores", vendedorService.listarVendedores());
        return "vendedores/lista";
    }

    // ruta que muestra el formulario de registro
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("vendedor", new Vendedor());
        return "vendedores/formulario";
    }

    // esta es la ruta que procesa los datos enviados por el formulario y los guarda
    @PostMapping("/guardar")
    public String guardarVendedor(@ModelAttribute("vendedor") Vendedor vendedor) {
        vendedorService.guardarVendedor(vendedor);
        return "redirect:/vendedores";
    }
}