package org.example;

public class ListaMultimedia {
    private Multimedia[] lista;
    private int contador;

    public ListaMultimedia(int max) {
        lista = new Multimedia[max];
        contador = 0;
    }

    private boolean listaLlena() {
        return contador == lista.length;
    }

    public int size() {
        return contador;
    }

    public boolean add(Multimedia m) {
        if (listaLlena()) {
            return false;
        }
        lista[contador] = m;
        contador++;
        return true;
    }

    public Multimedia get(int position) {
        if (position < 0 || position >= contador) {
            throw new IndexOutOfBoundsException();
        }
        return lista[position];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(lista[i].toString()).append("\n");
        }
        return sb.toString();
    }
}

