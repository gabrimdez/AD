package org.example;

public class Piscina {
    private int nivel; // litros actuales
    private final int MAX_NIVEL; // capacidad maxima en litros

    public Piscina(int capacidadLitros) {
        this.MAX_NIVEL = capacidadLitros;
        this.nivel = 0;
    }

    public int getNivel() {
        return nivel;
    }

    public int getMAX_NIVEL() {
        return MAX_NIVEL;
    }

    // Llenar x litros; lanzar excepción si sobrepasa capacidad
    public void llenar(int litros) throws PiscinaLlenaException {
        if (litros < 0) throw new IllegalArgumentException("Litros a llenar no puede ser negativo");
        if (nivel + litros > MAX_NIVEL) {
            throw new PiscinaLlenaException("Llenado excede la capacidad máxima.");
        }
        nivel += litros;
    }

    // Vaciar x litros; lanzar excepción si queda por debajo de 0
    public void vaciar(int litros) throws PiscinaVaciaException {
        if (litros < 0) throw new IllegalArgumentException("Litros a vaciar no puede ser negativo");
        if (nivel - litros < 0) {
            throw new PiscinaVaciaException("Vaciado dejaría nivel por debajo de cero.");
        }
        nivel -= litros;
    }

    // ---- Excepciones internas ----
    public static class PiscinaLlenaException extends Exception {
        public PiscinaLlenaException(String message) {
            super(message);
        }
    }

    public static class PiscinaVaciaException extends Exception {
        public PiscinaVaciaException(String message) {
            super(message);
        }
    }
}
