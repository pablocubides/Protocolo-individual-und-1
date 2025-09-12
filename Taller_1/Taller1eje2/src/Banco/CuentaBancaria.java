package banco;

public class CuentaBancaria {
    
    private String NumeroCuenta;
    private double Saldo;
    private String TipoCuenta;

   
    public CuentaBancaria() {
        this.NumeroCuenta = "000000";
        this.Saldo = 0.0;
        this.TipoCuenta = "Ahorros";
    }

 
    public CuentaBancaria(String NumeroCuenta, String TipoCuenta) {
        this.NumeroCuenta = NumeroCuenta;
        this.TipoCuenta = TipoCuenta;
        this.Saldo = 0.0; 
    }

 
    public CuentaBancaria(String NumeroCuenta, double Saldo, String TipoCuenta) {
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        this.TipoCuenta = TipoCuenta;
    }


    public void mostrarDetalles() {
        System.out.println("Numero de Cuenta: " + NumeroCuenta);
        System.out.println("Saldo: " + Saldo + " Pesos");
        System.out.println("Tipo de Cuenta: " + TipoCuenta);
    }
}