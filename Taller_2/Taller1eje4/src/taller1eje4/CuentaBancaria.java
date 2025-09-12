package taller1eje4;

public class CuentaBancaria {
    private String NumerodeCuenta;
    private double Saldo;
    private String TipodeCuenta;


    public CuentaBancaria() {
        this.NumerodeCuenta = "000000";
        this.Saldo = 0.0;
        this.TipodeCuenta = "Ahorros";
    }

   
    public CuentaBancaria(String NumerodeCuenta, String TipodeCuenta) {
        this.NumerodeCuenta = NumerodeCuenta;
        this.TipodeCuenta = TipodeCuenta;
        this.Saldo = 0.0;
    }

   
    public CuentaBancaria(String NumerodeCuenta, double Saldo, String TipodeCuenta) {
        this.NumerodeCuenta = NumerodeCuenta;
        this.Saldo = Saldo;
        this.TipodeCuenta = TipodeCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "Numero de cuenta='" + NumerodeCuenta + '\'' +
                ", Saldo=" + Saldo + " Pesos" +
                ", Tipo de cuenta='" + TipodeCuenta + '\'' +
                '}';
    }
}