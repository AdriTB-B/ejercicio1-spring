package com.adri.ejercicio1spring.restservice;

import com.adri.ejercicio1spring.Persona;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    @GetMapping("/user/{nombre}")
    public String saludo(@PathVariable("nombre") String nombre){
        return "Hola " + nombre;
    }

    @PostMapping("/useradd")
    public Persona userAdd(@RequestBody Persona persona){
        int edad = persona.getEdad();
        persona.setEdad(edad +1);
        return persona;
    }

}
