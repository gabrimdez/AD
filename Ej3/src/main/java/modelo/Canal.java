package modelo;

public class Canal {

    public static final int MAX_USUARIOS = 100;
    public static final int MAX_MENSAJES = 500;
    public static final String NOMBRE = "General";

    private Canal() {
        // Evita la instanciación
    }

    public static String prefijo() {
        return "[" + NOMBRE + "]";
    }
}









