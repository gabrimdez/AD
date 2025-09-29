// Circulo.java
package org.example;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public Circulo(double radio, String color, int[] posicion) {
        super(color, posicion);
        this.radio = radio;
    }

    public void establecerRadio(double r) {
        this.radio = r;
    }

    public double dimeRadio() {
        return this.radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
