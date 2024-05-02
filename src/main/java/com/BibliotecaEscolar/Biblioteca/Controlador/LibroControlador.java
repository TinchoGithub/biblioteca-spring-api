package com.BibliotecaEscolar.Biblioteca.Controlador;

import com.BibliotecaEscolar.Biblioteca.Modelo.LibroModelo;
import com.BibliotecaEscolar.Biblioteca.Repositorio.LibroRepositorio;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class LibroControlador {

    private LibroRepositorio libroRepositorio;

    public LibroControlador(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }
    @GetMapping("/api/libros")
    public ArrayList<LibroModelo> findAll(){
        return (ArrayList<LibroModelo>) libroRepositorio.findAll();
    }

    public LibroModelo findById(Long id){

        return null;
    }
}
