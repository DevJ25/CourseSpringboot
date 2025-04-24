package com.catering.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catering.springboot.model.Employes;





@RestController
//@ResquesteMapping("/") // Si quieres que todas las rutas tengan un prefijo, puedes usar @RequestMapping en la clase
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/index")
    public String home(Model model) {
        System.out.println("Método /index fue llamado");  // Log simple
        model.addAttribute("title", "servidor en linea");
        model.addAttribute("nombre", "servidor en lineasssss");
        model.addAttribute("ip", "127.0.0.1");
        model.addAttribute("active", "home");

        return "index"; // Esto busca un archivo index.html o index.ftlh (si usas Freemarker) en /templates
    }

    
    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // Se renderiza about.html desde templates
    }

    @GetMapping("/volv")
    public String volvPage() {
        return "volv"; // Se renderiza volv.html desde templates
    }



    @GetMapping("/contacto")  
    public Map<String, Object> hola() {
        Employes emp = new Employes("Joel", "Silva", "Lima", "System", 22, 21230, 1000);
      
        Map<String, Object> cont= new HashMap<>();
        cont.put("nombre", "Joel Sant");
        cont.put("apellido", emp.getLastName());
        cont.put("edad", 26);
        cont.put("mensaje", "Hola este es mi primer curso con Spring boot");
        cont.put("curso", "Spring boot con Java");
        cont.put("universidad", "Universidad Tecnologica de Peru");
        return cont;
    }

}
