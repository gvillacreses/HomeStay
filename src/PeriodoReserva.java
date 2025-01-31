import java.time.LocalDate;
public class PeriodoReserva {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public PeriodoReserva(String fechaInicio, String fechaFin) {
        this.fechaInicio = LocalDate.parse(fechaInicio);
        this.fechaFin = LocalDate.parse(fechaFin);
        if (this.fechaInicio.isAfter(this.fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha de fin.");
        }
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
}