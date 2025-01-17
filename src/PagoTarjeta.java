
public class PagoTarjeta implements MetodoPago {
    public String titular;
    public double monto;

    public PagoTarjeta(String titular, double monto){
        this.titular=titular;
        this.monto=monto;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago realizado con tarjeta: $" + monto);
    }
    public double getMonto() {
        return monto;
    }
}