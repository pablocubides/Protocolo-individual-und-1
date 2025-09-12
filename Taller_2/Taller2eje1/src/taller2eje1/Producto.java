package taller2eje1;

public class Producto {
   
    private String Nombre;
    private double Precio;

   
    public Producto(String Nombre, double Precio) {
        this.Nombre = Nombre;   
        this.Precio = Precio;
    }

   
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + Nombre);
        System.out.println("Precio: " + Precio + " Pesos");
    }
}