import java.time.LocalDate;

public class Reserva {
    private Unidad unidad;
    private Huesped huesped;
    /* Data Class - Encapsulate Data
    private String fechaInicio;
    private String fechaFin;

    public Reserva(Unidad unidad, Huesped huesped, String fechaInicio, String fechaFin) {
        this.unidad = unidad;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        unidad.setEstado("Reservada");
    }

    public void confirmarReserva(ContextoNotificacion contexto, MetodoPago metodoPago, double monto) {
        metodoPago.realizarPago(monto);
        contexto.enviar("Reserva confirmada para " + huesped.getNombre() + " en unidad: " + unidad.getTipo(), huesped);
    }
    */
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean confirmada;

    public boolean esValida() {
        return !fechaInicio.isAfter(fechaFin);
    }

    public void confirmarReserva(ContextoNotificacion contexto, MetodoPago metodoPago, double monto) {
        if (!esValida()) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha de fin.");
        }

        metodoPago.realizarPago(monto);
        this.confirmada = true;
        contexto.enviar("Reserva confirmada para " + huesped.getNombre() + " en unidad: " + unidad.getTipo(), huesped);
    }

    public boolean isConfirmada() {
        return confirmada;
    }
}