package Ejercicio2;


public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Nombre ", 00);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
