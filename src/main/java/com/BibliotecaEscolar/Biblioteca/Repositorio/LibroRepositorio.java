package com.BibliotecaEscolar.Biblioteca.Repositorio;


import com.BibliotecaEscolar.Biblioteca.Modelo.LibroModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<LibroModelo, Long> {
}
