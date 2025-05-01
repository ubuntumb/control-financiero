package com.example.demo.controllers;

import com.example.demo.models.Paises;
import com.example.demo.services.PaisesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/paises")
public class PaisesController {

    @Autowired
    private PaisesService paisesService;

    @GetMapping
    public String listarPaises(Model model) {
        model.addAttribute("listadoPaises", paisesService.getAllPaises());
        return "paises/listar";
    }

    @GetMapping("/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pais", new Paises());
        return "paises/formulario";
    }

    @PostMapping("/guardar")
    public String guardarPais(@Valid @ModelAttribute("pais") Paises pais, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "paises/formulario";
        }
        paisesService.savePais(pais);
        return "redirect:/paises";
    }

    @GetMapping("/editar/{id}")
    public String editarPais(@PathVariable("id") Integer id, Model model) {
        Optional<Paises> pais = paisesService.getPaisById(id);
        if (pais.isPresent()) {
            model.addAttribute("pais", pais.get());
            return "paises/formulario";
        }
        return "redirect:/paises";
    }

    @PostMapping("/eliminar")
    public String eliminarPais(@RequestParam("id") Integer id) {
        paisesService.deletePais(id);
        return "redirect:/paises";
    }
}