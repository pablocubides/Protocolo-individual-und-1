package taller1eje4;

import java.util.Scanner;

public class Pripal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Ingrese los datos del Libro:");
        System.out.print("Titulo: ");
        String Titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Numero de páginas: ");
        int Paginas = sc.nextInt();
        sc.nextLine(); 

        Libro Libro = new Libro(Titulo, autor, Paginas);

   
        System.out.println("Ingrese los datos de la Cuenta bancaria:");
        System.out.print("Numero de Cuenta: ");
        String NumerodeCuenta = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de Cuenta: ");
        String tipoCuenta = sc.nextLine();

        CuentaBancaria Cuenta = new CuentaBancaria(NumerodeCuenta, saldo, tipoCuenta);


        System.out.println("Ingrese los datos del Estudiante:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Estudiante Estudiante = new Estudiante(nombre, edad, curso);

        
        System.out.println("Detalles de los objetos");
        System.out.println(Libro);
        System.out.println(Cuenta);
        System.out.println(Estudiante);

        sc.close();
    }
}