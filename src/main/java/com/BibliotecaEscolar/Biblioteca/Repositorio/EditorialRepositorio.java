package com.BibliotecaEscolar.Biblioteca.Repositorio;

import com.BibliotecaEscolar.Biblioteca.Modelo.EditorialModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<EditorialModelo, Long> {
}
