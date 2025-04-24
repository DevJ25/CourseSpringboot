package com.catering.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/model1")
public class ejemploModel {

    @GetMapping("/model")
    public Map<String, Object> model(){
        
Map<String, Object> model = new HashMap<>();
model.put("nombre", "Joel Sant");
model.put("edad", 26);
model.put("mensaje", "Hola este es mi primer curso con Spring boot");
model.put("curso", "Spring boot con Java");
model.put("universidad", "Universidad Tecnologica de Peru");
return model;
    }
    
}
