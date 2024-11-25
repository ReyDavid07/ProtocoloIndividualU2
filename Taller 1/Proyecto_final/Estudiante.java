package Proyecto_final;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this("Nombre Genérico", 18, "Curso Genérico");
    }

    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Curso Genérico");
    }

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "nombre:" + nombre  +
                ", edad:" + edad +
                ", curso:" + curso 
                ;
    }
}

