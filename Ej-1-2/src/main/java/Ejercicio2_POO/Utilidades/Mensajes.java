package Ejercicio2_POO.Utilidades;

public class Mensajes {

    public static final String saludo = "Bienvenido al sistema de usuarios";

    public static String mostrarSaludo(String nombre) {
        return saludo + ", " + nombre + "!";
    }

    public static final String formatearMensaje(String mensaje) {
        return "[" + mensaje + "]";
    }



}
