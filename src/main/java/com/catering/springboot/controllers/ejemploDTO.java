package com.catering.springboot.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.catering.springboot.model.TDO.classDTO;


@RestController
@RequestMapping("/ejemplodto")
public class ejemploDTO {

    @GetMapping("/edto")
    public classDTO getMethodName() {
        classDTO dto = new classDTO();

        dto.setTitle("Welcome to Spring Boot");
        dto.setUser("SystemDeveloper");
        return dto;
    }
    
    
}
