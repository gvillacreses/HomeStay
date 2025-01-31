package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaTest {

    @Test
    public void testConfirmarReserva() {
        // Precondiciones
        Unidad unidad = new Unidad("Habitación 1", "Vista al mar", new Propiedad("Casa", "Playa", 100));
        Huesped huesped = new Huesped("Juan", "juan@example.com");
        PeriodoReserva periodo = new PeriodoReserva("2025-02-01", "2025-02-07");
        ContextoNotificacion contexto = new ContextoNotificacion();
        MetodoPago metodoPago = new MetodoPago("Tarjeta", "123456789");
        Reserva reserva = new Reserva(unidad, huesped, periodo);

        // Acción
        reserva.confirmarReserva(contexto, metodoPago, 500.0);

        // Salida esperada
        assertTrue(reserva.isConfirmada());
    }
}
