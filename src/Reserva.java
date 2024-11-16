public class Reserva {
    private Unidad unidad;
    private Huesped huesped;
    private String fechaInicio;
    private String fechaFin;

    public Reserva(Unidad unidad, Huesped huesped, String fechaInicio, String fechaFin) {
        this.unidad = unidad;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        unidad.setEstado("Reservada");
    }

    public void confirmarReserva(ServicioNotificacion servicioNotificacion) {
        // .. acá se envia la notificacion al usuario
    }
    
}

