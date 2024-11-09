
public class Reserva {
    private String id;
    private Usuario usuario;
    private Alojamiento alojamiento;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

    public Reserva(String id, Usuario usuario, Alojamiento alojamiento, String fechaInicio, String fechaFin) {
        this.id = id;
        this.usuario = usuario;
        this.alojamiento = alojamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = "Pendiente"; // Estado inicial antes de la reserva
    }

    public void cancelar() {
        this.estado = "Cancelada"; // Cambia el estado al cancelar
    }

    // Otros métodos relacionados ... 
}
