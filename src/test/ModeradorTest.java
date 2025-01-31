package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModeradorTest {

    @Test
    public void testManejarIncidente() {
        // Precondiciones
        Moderador moderador = new Moderador("Ana", "ana@example.com");
        Incidente incidente = new Incidente("3", "Problema de electricidad");

        // Acción
        moderador.manejarIncidente(incidente);

        // Salida esperada
        assertEquals("resuelto", incidente.getEstado());  // El incidente debería ser resuelto
    }
}
