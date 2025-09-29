package org.example;

public class PruebaExcepcion3 {
    public static void main(String[] args) {
        Excepcion6.realizarDivisiones();
    }

    static class Excepcion6 {
        public static void realizarDivisiones() {
            int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
            int den[] = {2, 0, 4, 4, 0, 8};

            try {
                for (int i = 0; i < num.length; i++) {
                    try {
                        System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
                    } catch (ArithmeticException e) {
                        System.out.println("División por cero en índice " + i);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Índice fuera de rango en denominador en índice " + i);
                    }
                }
            } catch (Throwable e) {
                System.out.println("Ocurrió una excepción fatal");
            }
            System.out.println("El programa continúa aquí");
        }
    }
}
