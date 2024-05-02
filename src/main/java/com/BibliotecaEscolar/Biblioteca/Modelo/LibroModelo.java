package com.BibliotecaEscolar.Biblioteca.Modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "libros")
public class LibroModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    public AutorModelo autor;
    @Embedded
    private EditorialModelo editorial;
    @Column
    private String ISBN, genero, idioma, resumen, nombre;
    @Column
    private LocalDate fechaPublicacion;
    @Column
    private Integer numeroDePaginas;
    @Column
    private boolean enPrestamo;
    @Enumerated(EnumType.STRING)
    @Column
    private Estado estado;


    public LibroModelo() {
    }

    public LibroModelo(Long id, AutorModelo autor, EditorialModelo editorial, String nombre, String ISBN, String genero, String idioma, String resumen, LocalDate fechaPublicacion, Integer numeroDePaginas, boolean enPrestamo, Estado estado) {
        this.id = id;
        this.autor = autor;
        this.editorial = editorial;
        this.nombre = nombre;
        this.ISBN = ISBN;
        this.genero = genero;
        this.idioma = idioma;
        this.resumen = resumen;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroDePaginas = numeroDePaginas;
        this.enPrestamo = enPrestamo;
        this.estado = estado;
    }

    private enum Estado{
        BUENO,
        REGULAR,
        MALO
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AutorModelo getAutor() {
        return autor;
    }

    public void setAutor(AutorModelo autor) {
        this.autor = autor;
    }

    public EditorialModelo getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialModelo editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isEnPrestamo() {
        return enPrestamo;
    }

    public void setEnPrestamo(boolean enPrestamo) {
        this.enPrestamo = enPrestamo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "LibroModelo{" +
                "id=" + id +
                ", autor=" + autor +
                ", editorial=" + editorial +
                ", nombre='" + nombre + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genero='" + genero + '\'' +
                ", idioma='" + idioma + '\'' +
                ", resumen='" + resumen + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", numeroDePaginas=" + numeroDePaginas +
                ", enPrestamo=" + enPrestamo +
                ", estado=" + estado +
                '}';
    }
}
