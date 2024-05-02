package com.BibliotecaEscolar.Biblioteca.Modelo;

import jakarta.persistence.*;

@Embeddable
public class AutorModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;

    public AutorModelo() {
    }

    public AutorModelo(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "AutorModelo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
