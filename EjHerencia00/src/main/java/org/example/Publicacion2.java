package org.example;

public class Publicacion2 extends Publicacion {

    public int DimeNumeroDePaginas(){
        return NumeroDePaginas;
    }
    public void PonNumeroDePaginas(int NumeroDePaginas){
        this.NumeroDePaginas = NumeroDePaginas;
    }
    public float DimePrecio(){
        return Precio;
    }
    public void PonPrecio(float Precio){
        this.Precio = Precio;
    }
}
