package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstadoIncidenteTest {

    @Test
    public void testCambioEstado() {
        // Precondiciones
        EstadoIncidente estado = new EstadoAbierto();
        Incidente incidente = new Incidente("4", "Fuga de gas");

        // Acción
        incidente.cambiarEstado(new EstadoResuelto());

        // Salida esperada
        assertEquals("Resuelto", incidente.getEstado());
    }
}

