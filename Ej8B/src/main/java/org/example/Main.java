package org.example;

import static org.example.PiscinaCliente.operacionesPiscina;

public class Main {
    public static void main(String[] args) {
        Piscina p = new Piscina(150);
        operacionesPiscina(p);
    }
}