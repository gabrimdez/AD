// Rectangulo.java
package org.example;

public class Rectangulo extends Figura {

    private double[] lado = new double[2];

    public Rectangulo(double[] lado, String color, int[] posicion) {
        super(color, posicion);
        this.lado = lado.clone();
    }

    public void estableceLados(double[] lado) {
        this.lado = lado.clone();
    }

    public double[] dimeLados() {
        return this.lado.clone();
    }

    @Override
    public double perimetro() {
        return 2 * (lado[0] + lado[1]);
    }
}
