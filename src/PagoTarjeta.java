public class PagoTarjeta implements MetodoPago {
    public String titular;
    public double monto;
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago realizado con tarjeta: $" + monto);
    }
}