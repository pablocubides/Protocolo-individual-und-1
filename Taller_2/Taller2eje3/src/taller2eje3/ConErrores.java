package taller2eje3;

public class ConErrores {
    private String Nombre;
    private int Edad;

    public ConErrores(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public static void MetodoEstatico() {
        System.out.println("Nombre: " + this.Nombre);
    }
}