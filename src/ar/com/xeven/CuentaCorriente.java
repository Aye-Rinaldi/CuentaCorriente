package ar.com.xeven;

public class CuentaCorriente {
    //atributos
    private String numeroCuenta = "";
    private Double saldo;

    //constructor
    public CuentaCorriente() {
        this.generaNumeroCuenta();
        this.saldo = 0.0;
    }

    public CuentaCorriente(Double saldo) {
        this.generaNumeroCuenta();
        this.saldo = saldo;
    }

    //metodo que genera el numero de cuenta de 10 digitos
    private void generaNumeroCuenta() {
        for (int i=0;i<10;i++)
            numeroCuenta += (int)(Math.random()*10);
    }

    //toString
    @Override
    public String toString() {
        return "Numero de cta: "+numeroCuenta+" Saldo: "+String.format("%.2f", saldo)+" $";
    }

    //depositar dinero
    public void depositar(int monto){
        saldo += monto;
    }

    //extraer dinero
    public void extraer(int monto){
        saldo -= monto;
    }

    //hacer una transferencia
    public void transferenciaOtraCuenta(CuentaCorriente cuentaDestino, int monto){
        this.saldo -= monto;
        cuentaDestino.saldo += monto;
    }
}
