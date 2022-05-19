package com.adri.ejercicio1spring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {
    private String nombre;
    private int edad;
    private String poblacion;
}
