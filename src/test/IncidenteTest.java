package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IncidenteTest {

    @Test
    public void testManejarIncidente() {
        // Precondiciones
        Incidente incidente = new Incidente("1", "Fuga de agua");
        EstadoIncidente estadoInicial = incidente.getEstado();  // Estado inicial es "Abierto"

        // Acción
        incidente.manejarIncidente();

        // Salida esperada
        assertNotEquals(estadoInicial, incidente.getEstado());
    }
}
