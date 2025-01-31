package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropiedadTest {

    @Test
    public void testAgregarCalificacion() {
        // Precondiciones
        Propiedad propiedad = new Propiedad("Casa en la playa", "Playa", 100);
        Huesped huesped = new Huesped("Juan", "juan@example.com");
        
        // Acción
        propiedad.agregarCalificacion(huesped, 5, "Excelente propiedad");

        // Salida esperada
        assertEquals(1, propiedad.getCalificaciones().size());
        assertEquals(5, propiedad.getCalificaciones().get(0).getPuntuacion());
    }
}
