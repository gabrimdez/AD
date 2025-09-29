package org.example;

public class Libro extends Publicacion {
    public String Titulo;
    public String TipoPortada;
    public String ISBN;
    public String NombreAutor;
    public String Editorial;

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + Titulo + '\'' +
                ", TipoPortada='" + TipoPortada + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", NombreAutor='" + NombreAutor + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", NumeroDePaginas=" + NumeroDePaginas +
                ", Precio=" + Precio +
                '}';
    }
}