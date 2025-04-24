package com.catering.springboot.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.*;


@RestController
public class EjemploRestControllers {
  @GetMapping("/saludo")
    public Map<String, String> saludo() {
        return Map.of("mensaje", "Hola desde el backend");
    }
    
}
