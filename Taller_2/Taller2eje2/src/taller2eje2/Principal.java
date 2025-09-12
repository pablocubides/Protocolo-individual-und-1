package taller2eje2;

public class Principal {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        System.out.println("Estudiante por defecto:");
        e1.mostrarDetalles();

        System.out.println();

        Estudiante E2 = new Estudiante("felix", 21);
        System.out.println("Estudiante con parámetros:");
        E2.mostrarDetalles();
    }
}