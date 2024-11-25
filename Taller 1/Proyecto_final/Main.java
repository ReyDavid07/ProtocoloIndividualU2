package Proyecto_final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el título del libro: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        int paginasLibro = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Libro libro = new Libro(tituloLibro, autorLibro, paginasLibro);

       
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoCuenta = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldoCuenta, tipoCuenta);

       
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el curso del estudiante: ");
        String cursoEstudiante = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);

        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(libro);
        System.out.println(cuentaBancaria);
        System.out.println(estudiante);

        scanner.close();
    }
}
