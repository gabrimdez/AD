package org.example;

public class Main {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28, 1200);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Jua Mota", 55333222, 30, 1200, "noche");

        System.out.println("Empleado 1: " + empleado1.getNombre() + " | Sueldo: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.getNombre() + " | Sueldo: " + empleado2.getSalario());

        Asalariado empleadoX;
        empleadoX = empleado1;
        empleado1 = empleado2;

        System.out.println("* * * * * * * * ");
        System.out.println("Empleado 1: " + empleado1.getNombre() + " | Sueldo: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.getNombre() + " | Sueldo: " + empleado2.getSalario());

        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Gil", 55333666, 35, 1200, "Cáceres");
        empleado1 = empleadoX;

        System.out.println("* * * * * * * * ");
        System.out.println("Empleado 1: " + empleado1.getNombre() + " | Sueldo: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.getNombre() + " | Sueldo: " + empleado2.getSalario());
        System.out.println("Empleado 3: " + empleado3.getNombre() + " | Sueldo: " + empleado3.getSalario());

        // Ahora sin acceder directamente a métodos específicos, usamos instanceof
        Asalariado[] array_asal = new Asalariado[3];
        array_asal[0] = empleado1;
        array_asal[1] = empleado2;
        array_asal[2] = empleado3;

        System.out.println("* * * * * * * * ");
        for (int i = 0; i < array_asal.length; i++) {
            Asalariado asal = array_asal[i];
            System.out.println("Empleado " + (i + 1) + ": " + asal.getNombre());
            System.out.println("Sueldo: " + asal.getSalario());

            if (asal instanceof EmpleadoProduccion) {
                EmpleadoProduccion prod = (EmpleadoProduccion) asal;
                System.out.println("Turno: " + prod.getTurno());
            } else if (asal instanceof EmpleadoDistribucion) {
                EmpleadoDistribucion dist = (EmpleadoDistribucion) asal;
                System.out.println("Región: " + dist.getRegion());
            }

            System.out.println("---");
        }
    }
}
