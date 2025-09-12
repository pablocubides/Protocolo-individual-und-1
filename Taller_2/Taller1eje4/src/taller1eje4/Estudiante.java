package taller1eje4;

public class Estudiante {
    private String Nombre;
    private int Edad;
    private String Curso;

   
    public Estudiante() {
        this.Nombre = "Sin Nombre";
        this.Edad = 0;
        this.Curso = "Sin valor";
    }

 
    public Estudiante(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Curso = "Sin valor";
    }

   
    public Estudiante(String Nombre, int Edad, String Curso) {
        this(Nombre, Edad);
        this.Curso = Curso;
    }

    @Override
    public String toString() {
        String detalles = "Estudiante{" +
                "Nombre='" + Nombre + '\'';

        if (Edad > 0) {
            detalles += ", Edad=" + Edad;
        }

        if (!Curso.equals("Sin valor")) {
            detalles += ", Curso='" + Curso + '\'';
        }

        detalles += '}';
        return detalles;
    }
}