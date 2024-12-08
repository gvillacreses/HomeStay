public class TarjetaFactory extends MetodoPagoFactory{
    @Override
    public MetodoPago crearMetodoPago(){
        return new PagoTarjeta();
    }
}