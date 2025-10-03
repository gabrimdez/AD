package org.example;

public class PiscinaCliente {

    public static void operacionesPiscina(Piscina p) {
        // Llenar la piscina, mostrando el nivel y capturando excepciones
        for (int i = 1; i <= 3; i++) {
            int cantidad = (int)(Math.random() * 100);
            try {
                p.llenar(cantidad);
                System.out.println("Llenando con " + cantidad + ". Nivel actual: " + p.getNivel());
            } catch (Exception e) {
                System.out.println("Error al llenar: " + e.getMessage() + ". Nivel actual: " + p.getNivel());
            }
        }

        // Vaciar la piscina, mostrando el nivel y capturando excepciones
        for (int i = 1; i <= 3; i++) {
            int cantidad = (int)(Math.random() * 100);
            try {
                p.vaciar(cantidad);
                System.out.println("Vaciando " + cantidad + ". Nivel actual: " + p.getNivel());
            } catch (Exception e) {
                System.out.println("Error al vaciar: " + e.getMessage() + ". Nivel actual: " + p.getNivel());
            }
        }
    }
}

