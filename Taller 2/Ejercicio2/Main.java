package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Estudiante por defecto: ");
        estudiante1.mostrarDetalles();

        System.out.println();

        Estudiante estudiante2 = new Estudiante("Valeria Gamez", 21);
        System.out.println("Detalles de la estudiante:  ");
        estudiante2.mostrarDetalles();
    }
}
