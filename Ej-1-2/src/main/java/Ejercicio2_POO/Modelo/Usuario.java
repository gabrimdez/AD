package Ejercicio2_POO.Modelo;

public class Usuario {

    private String nombre;
    private String email;

    static int contadorUsuarios = 0;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        contadorUsuarios++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public void mostrasrInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
