package taller2eje3;

public class Corregido {
    private String Nombre;
    private int Edad;

    public Corregido(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public static void MetodoEstatico() {
        System.out.println("Metodo estatico llamado");
    }

    public void MostrarDetalles() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }
}