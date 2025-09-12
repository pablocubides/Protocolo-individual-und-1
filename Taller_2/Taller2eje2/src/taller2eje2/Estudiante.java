package taller2eje2;

public class Estudiante {
    private String Nombre;
    private int Edad;

    public Estudiante() {
        this("Sin Nombre", 0);
    }

    public Estudiante(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }
}