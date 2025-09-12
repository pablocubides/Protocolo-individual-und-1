package taller1eje4;

public class Libro {
    private String Titulo;
    private String Autor;
    private int NumerodePaginas;

  
    public Libro() {
        this.Titulo = "Sin título";
        this.Autor = "Desconocido";
        this.NumerodePaginas = 0;
    }

   
    public Libro(String Titulo, String Autor, int NumerodePaginas) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumerodePaginas = NumerodePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Numero de paginas=" + NumerodePaginas +
                '}';
    }
}