public class EstadoResuelto implements EstadoIncidente {
    @Override
    public void manejar(Incidente incidente) {
        System.out.println("El incidente ya está resuelto.");
    }

    @Override
    public String getNombre() {
        return "resuelto";
    }
}