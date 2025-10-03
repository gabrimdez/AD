package org.example;

public class Cuenta {

    private double Saldo;

    public Cuenta(double saldo){
        Saldo = saldo;
    }

    public void ingresar (double saldo){
        Saldo += saldo;
    }

    public void retirar (double cantidad) throws SaldoInsuficienteException{
        if (cantidad <= Saldo){
            Saldo -= cantidad;
        }
    }
}
