package com.BibliotecaEscolar.Biblioteca.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlador {

    @GetMapping("/helloWord")
    public String HelloWord(){
        return "Hello Word!";
    }
}
