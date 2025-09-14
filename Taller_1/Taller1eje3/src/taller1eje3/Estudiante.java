package taller1eje3;

public class Estudiante {
   
    private String Nombre;
    private int Edad;
    private String Curso;

  
    public Estudiante() {
        this.Nombre = "Sin Nombre";
        this.Edad = 0;
        this.Curso = "sin valor";
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

    public void mostrarDetalles() {
        System.out.println("Nombre: " + Nombre);
        
        System.out.println("Edad: " + Edad);
        System.out.println("Curso: " + Curso);
    }
}