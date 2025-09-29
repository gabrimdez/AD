package org.example;

public class NumberDivision {

    public static int division(String a, String b){
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            return num1 / num2;
        } catch (NumberFormatException e) {
            System.out.println("Has introducido un valor no numérico");
        } catch (ArithmeticException ae){
            System.out.println("No se puede dividir por cero");
        }
        return 0; // Valor de retorno en caso de excepción
    }
}


