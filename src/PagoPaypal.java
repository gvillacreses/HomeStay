public class PagoPaypal implements MetodoPago {
    public String correoCuenta;
    public double monto;

    public PagoPaypal(String correoCuenta, double monto){
        this.correoCuenta=correoCuenta;
        this.monto=monto;
    }
    public double getMonto() {
        return monto;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago realizado con PayPal: $" + monto);
    }
}