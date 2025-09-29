package org.example;

public class Multimedia {

    public enum Formato {
        WAV, MP3, MIDI, AVI, MOV, MPG, CDAUDIO, DVD
    }

    private String titulo;
    private String autor;
    private Formato formato;
    private double duracion;

    public Multimedia(String titulo, String autor, Formato formato, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Formato getFormato() { return formato; }
    public double getDuracion() { return duracion; }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Formato: " + formato + ", Duracion: " + duracion;
    }

    public boolean equals(Multimedia other) {
        if (other == null) return false;
        return this.titulo.equals(other.getTitulo()) && this.autor.equals(other.getAutor());
    }
}
