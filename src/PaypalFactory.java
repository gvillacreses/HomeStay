public class PaypalFactory extends MetodoPagoFactory{
    @Override
    public MetodoPago crearMetodoPago(){
        return new PagoPaypal();
    }
}