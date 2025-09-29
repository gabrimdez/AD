package org.example;

public class AplicacionPeliculas {
    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10);

        Pelicula p1 = new Pelicula("Pelicula1", "Autor1", Multimedia.Formato.MPG, 120.0, "Actor1", null);
        Pelicula p2 = new Pelicula("Pelicula2", "Autor2", Multimedia.Formato.AVI, 95.5, null, "Actriz2");
        Pelicula p3 = new Pelicula("Pelicula3", "Autor3", Multimedia.Formato.MOV, 110.0, "Actor3", "Actriz3");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println(lista.toString());
    }
}
