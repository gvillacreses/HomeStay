public class PagoPaypal implements MetodoPago {
    String correoCuenta;
    double monto;
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago realizado con PayPal: $" + monto);
    }
}