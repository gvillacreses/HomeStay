package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnfitrionTest {

    @Test
    public void testManejarIncidente() {
        // Precondiciones
        Anfitrion anfitrion = new Anfitrion("Carlos", "carlos@example.com");
        Incidente incidente = new Incidente("2", "Problema de calefacción");
        anfitrion.setNext(new Moderador("Luis", "luis@example.com"));  // Se asigna el siguiente Handler

        // Acción
        anfitrion.manejarIncidente(incidente);

        // Salida esperada
        assertEquals("escalado", incidente.getEstado());  // El incidente debería haber sido escalado
    }
}
