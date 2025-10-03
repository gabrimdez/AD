package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

// Definición de la excepción personalizada
class ExcepcionIntervalo extends Exception {
    public ExcepcionIntervalo(String mensaje) {
        super(mensaje);
    }
}

public class DivisionControlada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador = 0, denominador = 0;
        boolean entradaCorrecta = false;

        while (!entradaCorrecta) {
            try {
                System.out.print("Introduce el numerador: ");
                numerador = sc.nextInt();
                System.out.print("Introduce el denominador: ");
                denominador = sc.nextInt();

                // Comprobación del intervalo
                if (numerador >= 100 || denominador <= -5) {
                    throw new ExcepcionIntervalo(
                            "Numerador debe ser menor que 100 y denominador mayor de -5."
                    );
                }

                // Intentar la división
                int cociente = numerador / denominador;
                System.out.println("El cociente es: " + cociente);
                entradaCorrecta = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir números enteros.");
                sc.next(); // Limpiar el buffer del scanner
            } catch (ExcepcionIntervalo e) {
                System.out.println("Error de intervalo: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero no permitida.");
            }
        }

        sc.close();
    }
}
