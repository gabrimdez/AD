package org.example;

public class Piscina {
    private int nivel;
    public final int MAX_NIVEL;

    public Piscina(int max) {
        if (max < 0) max = 0;
        MAX_NIVEL = max;
    }

    public int getNivel() {
        return nivel;
    }

    public void vaciar(int cantidad) throws Exception {
        if (nivel - cantidad < 0) {
            throw new Exception("No se puede vaciar. El nivel quedaría por debajo de cero.");
        }
        nivel = nivel - cantidad;
    }

    public void llenar(int cantidad) throws Exception {
        if (nivel + cantidad > MAX_NIVEL) {
            throw new Exception("No se puede llenar. El nivel excedería el máximo permitido.");
        }
        nivel = nivel + cantidad;
    }
}
