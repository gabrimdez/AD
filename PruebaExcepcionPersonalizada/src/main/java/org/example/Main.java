package org.example;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1000);

        try {
            cuenta.retirar(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

}
