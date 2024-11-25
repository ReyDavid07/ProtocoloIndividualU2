package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        System.out.println();

        Estudiante estudiante2 = new Estudiante("Rey David", 18);
        estudiante2.mostrarDetalles();

        System.out.println();

        Estudiante estudiante3 = new Estudiante("Valeria Gamez", 22, "Matemáticas");
        estudiante3.mostrarDetalles();
    }
}

