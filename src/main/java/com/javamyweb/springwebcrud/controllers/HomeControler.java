package com.javamyweb.springwebcrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {
    @GetMapping("/")
   public String index(Model model){

       model.addAttribute("nome", "Diego");

       return "home/index";
   }
    
}
