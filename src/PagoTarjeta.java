public class PagoTarjeta implements MetodoPago {
    String titular;
    double monto;
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago realizado con tarjeta: $" + monto);
    }
}