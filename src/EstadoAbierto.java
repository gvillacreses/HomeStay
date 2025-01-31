public class EstadoAbierto implements EstadoIncidente {
    @Override
    public void manejar(Incidente incidente) {
        incidente.cambiarEstado(new EstadoResuelto());
    }

    @Override
    public String getNombre() {
        return "abierto";
    }
}