package com.catering.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
public class restControllers {
//nos va a retornar un json
    @GetMapping("/rest")
    public Map<String,Object> rest(){

 Map<String, Object> respuesta= new HashMap<>();
 respuesta.put("nombre", "Joel Sant");
 respuesta.put("edad", 26);
 respuesta.put("mensaje", "Hola este es mi primer curso con Spring boot");
    respuesta.put("curso", "Spring boot con Java");
    respuesta.put("universidad", "Universidad Tecnologica de Peru");
        return respuesta;
    }
    

    
}
