package banco;

public class Ejemplo {
    public static void main(String[] args) {
       
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Cuenta por defecto:");
        cuenta1.mostrarDetalles();

        System.out.println();

       
        CuentaBancaria cuenta2 = new CuentaBancaria("853352", "Corriente");
        System.out.println("Cuenta con 2 parametros:");
        cuenta2.mostrarDetalles();

        System.out.println();

      
        CuentaBancaria cuenta3 = new CuentaBancaria("129349", 1500.75, "Ahorros");
        System.out.println("Cuenta con 3 parametros:");
        cuenta3.mostrarDetalles();
    }
}