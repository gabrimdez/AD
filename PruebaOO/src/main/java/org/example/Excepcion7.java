package org.example;

public class Excepcion7 {

    public static void generaExcepcion(int i) {
        int t;
        int num[] = {2, 4, 6};
        System.out.println("Recibiendo " + i);
        try {
            switch (i) {
                case 0:
                    t = 10 / i; // división por cero
                    break;
                case 1:
                    num[4] = 4; // genera un error de fuera de rango
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Se ha producido una división por cero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha accedido a una posición fuera del vector.");
        }
        finally {
            System.out.println("Ejecutando código de limpieza");
        }
    }
}

