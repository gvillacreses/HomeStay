package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


public class HuespedTest {

    @Test
    public void testReservar() {
        // Precondiciones
        Huesped huesped = new Huesped("Juan Perez", "juan@example.com");
        Propiedad propiedad = new Propiedad("Casa en la playa", "Playa", 100);
        Unidad unidad = new Unidad("Habitación 1", "Descripción", propiedad);
        PeriodoReserva periodo = new PeriodoReserva("2025-02-01", "2025-02-07");
        ContextoNotificacion contexto = new ContextoNotificacion();
        MetodoPago metodoPago = new MetodoPago("Tarjeta", "123456789");
        double monto = 500.0;

        // Acción
        huesped.reservar(propiedad, unidad, periodo, contexto, metodoPago, monto);

        // Salida esperada
        assertTrue(unidad.getEstado().equals("Reservada"));
    }
}

