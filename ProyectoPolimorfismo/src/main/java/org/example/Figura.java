// Figura.java
package org.example;

public abstract class Figura {

    private String colorFigura;
    private int[] posicion = new int[2];

    public Figura() {
        this.colorFigura = "black";
        this.posicion[0] = 0;
        this.posicion[1] = 0;
    }

    public Figura(String color) {
        this.colorFigura = color;
        this.posicion[0] = 0;
        this.posicion[1] = 0;
    }

    public Figura(String color, int[] pos) {
        this.colorFigura = color;
        this.posicion = pos.clone();
    }

    public void estableceColor(String color) {
        this.colorFigura = color;
    }

    public void estableceCentro(int[] posicion) {
        this.posicion = posicion.clone();
    }

    public int[] dameCentro() {
        return this.posicion.clone();
    }

    public String dimeColor() {
        return this.colorFigura;
    }

    public abstract double perimetro();
}
