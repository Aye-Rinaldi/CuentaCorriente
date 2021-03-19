package ar.com.xeven;
/*
Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número
de cuenta de 10 dígitos.
 */
public class Main {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente();
        System.out.println(cuenta1);
        CuentaCorriente cuenta2 = new CuentaCorriente(1500.00);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000.00);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        System.out.println();
        cuenta1.depositar(2000);
        cuenta2.extraer(600);
        cuenta3.depositar(75);
        cuenta1.depositar(55);
        cuenta2.transferenciaOtraCuenta(cuenta2,100);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);


    }
}
