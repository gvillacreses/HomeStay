package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {

    @Test
    public void testMostrarCalificacion() {
        // Precondiciones
        Huesped huesped = new Huesped("Carlos", "carlos@example.com");
        Calificacion calificacion = new Calificacion(4, "Buena experiencia", huesped);

        // Acción y salida esperada
        String resultado = calificacion.mostrarCalificacion();
        assertEquals("Puntuación: 4, Comentario: Buena experiencia", resultado);
    }
}

