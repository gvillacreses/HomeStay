public class EstadoEscalado implements EstadoIncidente {
    @Override
    public void manejar(Incidente incidente) {
        System.out.println("El incidente ha sido escalado.");
    }

    @Override
    public String getNombre() {
        return "escalado";
    }
}