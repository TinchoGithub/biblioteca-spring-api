package com.BibliotecaEscolar.Biblioteca.Repositorio;

import com.BibliotecaEscolar.Biblioteca.Modelo.AutorModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<AutorModelo, Long> {
}
