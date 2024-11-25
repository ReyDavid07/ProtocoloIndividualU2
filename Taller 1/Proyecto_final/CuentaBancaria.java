package Proyecto_final;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this("0", 0.0, "Corriente");
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this(numeroCuenta, 0.0, tipoCuenta);
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria:" +
                "numeroCuenta: " + numeroCuenta +
                ", saldo: " + saldo +
                ", tipoCuenta:" + tipoCuenta  
                ;
    }
}
