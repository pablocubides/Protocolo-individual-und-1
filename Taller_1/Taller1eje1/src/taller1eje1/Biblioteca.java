package taller1eje1;

public class Biblioteca {
    public static void main(String[] args) {
  
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.println();

        Libro libro2 = new Libro("El principito", " Antoine de Saint-Exupery", 96);
        libro2.mostrarDetalles();
    }
}