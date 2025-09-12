package taller2eje1;

public class Principal {
    public static void main(String[] args) {
       
        Producto p1 = new Producto("pc", 9999.50);

        
        p1.mostrarProducto();

        System.out.println();


        Producto p2 = new Producto("telefono", 4900.29);
        p2.mostrarProducto();
    }
}