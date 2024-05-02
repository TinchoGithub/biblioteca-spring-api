package com.BibliotecaEscolar.Biblioteca.Modelo;

import jakarta.persistence.*;

@Embeddable
public class EditorialModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;

    public EditorialModelo() {
    }

    public EditorialModelo(Long id, String nombre) {
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
        return "EditorialModelo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
