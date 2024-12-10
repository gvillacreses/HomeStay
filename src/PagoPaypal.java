public class PagoPaypal implements MetodoPago {
    public String correoCuenta;
    public double monto;
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago realizado con PayPal: $" + monto);
    }
}