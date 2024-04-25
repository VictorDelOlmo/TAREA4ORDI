

package entidadFinanciera;

/**
 *
 * @author PC GAMING
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cantidadEsperada(objetoCuenta, 500); // Intentamos ingresar 500
            saldoActual = objetoCuenta.estado();
            System.out.println("Después de ingresar 500, el saldo actual es " + saldoActual);
        } catch (Exception e) {
            System.out.println("Error al ingresar: " + e.getMessage());
        }

        try {
            cantidadEsperada(objetoCuenta, 3000); // Intentamos retirar 3000
            saldoActual = objetoCuenta.estado();
            System.out.println("Después de retirar 3000, el saldo actual es " + saldoActual);
        } catch (Exception e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }
    }

    /**
     *
     * @param c
     * @param cantidad
     */
    public static void cantidadEsperada(CCuenta c, double cantidad) {
        try {
            c.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Error al ingresar: " + e.getMessage());
        }
    }

    /**
     *
     * @param c
     * @param cantidad
     */
    public static void cantidadesperada(CCuenta c, double cantidad) {
        try {
            c.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }
    }
}
