package taller1eje1;

public class Libro {
    private String titulo;
    private String autor;
    private int NumeroPaginas;

    
    public Libro() {
        
        this.titulo = "Sin titulo";
        this.autor = "sin autor";
        this.NumeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.NumeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + NumeroPaginas);
    }
}