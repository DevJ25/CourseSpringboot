package com.catering.springboot.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.catering.springboot.model.Employes;


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
    

    @GetMapping("/indEmpleado")
    public String indEmpleados(Model nod) {
        Employes news = new Employes("Joel", "Silva", "Lima", "System", 22, 21230, 1000);
        nod.addAttribute("title", "Información del empleado");
        nod.addAttribute("Empleados", news);

        return "indEmpleado";
    }
    
}
