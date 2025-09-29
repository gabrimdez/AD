// Main.java
package org.example;

public class Main {
    public static void main(String[] args) {

        int[] posicion = {5, 10};
        double[] lados = {4.0, 6.0};

        Circulo miCirculo = new Circulo(3.5, "red", posicion);
        Rectangulo miRectangulo = new Rectangulo(lados, "blue", posicion);

        Figura miFigura = new Circulo(3, "green", posicion);
        System.out.println(miFigura.perimetro());
        System.out.println(miCirculo.dimeRadio());

        int[] centro = miCirculo.dameCentro();

        System.out.println(centro[0]);
        System.out.println(centro[1]);
        System.out.println(miRectangulo.dimeColor());

    }
}
