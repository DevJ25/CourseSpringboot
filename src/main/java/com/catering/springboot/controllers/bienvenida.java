package com.catering.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class bienvenida {

    @GetMapping("/bienvenida")
    public String bienvenid(Model model){
        System.out.println("Método /bienvenida fue llamado");  // Log simple
  model.addAttribute("Welcome", "Bienvenido a la aplicación de catering!");
  model.addAttribute("name", "Joel Sant");
  model.addAttribute("edad",26);
  model.addAttribute("mensaje","Hola este es mi primer curso con Spring boot");
        return "bienvenida";
    }
    
}
