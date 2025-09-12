package taller1eje3;

public class Ejemplo {
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante();
        System.out.println("Estudiante por defecto:");
        e1.mostrarDetalles();

        System.out.println();

      
        Estudiante e2 = new Estudiante("felix", 19);
        System.out.println("Estudiante con 2 parametros:");
        e2.mostrarDetalles();

        System.out.println();

        
        Estudiante e3 = new Estudiante("juan", 22, "quinto");
        System.out.println("Estudiante con 3 parametros:");
        e3.mostrarDetalles();
    }
}