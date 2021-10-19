package com.javamyweb.springwebcrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdmController {
    @GetMapping("/admnistradores")
   public String index(Model model){
       
       return "admnistradores/index";
   }
    
}
