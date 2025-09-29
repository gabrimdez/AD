package utils;

public final class Validacion {

    private Validacion() {
        // Evita la instanciación
    }

    public static boolean esEmailValido(String email) {
        return email != null && email.contains("@");
    }

    public static boolean noVacio(String s) {
        return s != null && !s.isEmpty();
    }
}
