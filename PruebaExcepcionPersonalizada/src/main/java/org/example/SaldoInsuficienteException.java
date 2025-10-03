package org.example;

public class SaldoInsuficienteException extends Throwable {

    public SaldoInsuficienteException(String message) {
        super("No tienes dinero suficiente para retirar:");
    }

}
