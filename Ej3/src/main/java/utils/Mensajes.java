package utils;

public class Mensajes {

    public static final String saludo = "Bienvenido al sistema de mensajería!";

    public static String mostrarSaludo(String nombre) {
        return saludo + " Hola, " + nombre + "!";
    }

    public static final String formatearMensaje(String mensaje) {
        return "[" + mensaje + "]";
    }
    

}
