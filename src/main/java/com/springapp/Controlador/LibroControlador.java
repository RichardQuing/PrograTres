package com.springapp.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibroControlador {
    @GetMapping("/richard")
    public String libros(){
        return "libro.html";
    }
}
