package com.javamyweb.springwebcrud.controllers;

import java.util.List;

import com.javamyweb.springwebcrud.models.Admnistrador;
import com.javamyweb.springwebcrud.repositorio.AdmnistradoresRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdmController {

    @Autowired
    private AdmnistradoresRepo repo;

    @GetMapping("/admnistradores")
    public String index(Model model) {
        List<Admnistrador> admnistradores = (List<Admnistrador>) repo.findAll();
        model.addAttribute("admnistradores", admnistradores);
        return "admnistradores/index";
    }

    @GetMapping("/admnistradores/novo")
    public String novo() {
        return "admnistradores/novo";
    }

    @PostMapping("/admnistradores/criar")
    public String criar(Admnistrador admnistrador) {
        repo.save(admnistrador);
        return "redirect:/admnistradores";
    }

    @GetMapping("/admnistradores/{id}/excluir")
    public String excluir(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/admnistradores";
    }


   



}
