package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManejadorSubscripcionesTest {

    @Test
    public void testNotificarSubscriptor() {
        // Precondiciones
        ManejadorSubscripciones manejador = new ManejadorSubscripciones();
        Subscriptor subscriptor = new Subscriptor("Juan", "juan@example.com");
        manejador.addSubscriptor(subscriptor);

        // Acción
        manejador.notificarSubscriptor("Incidente resuelto");

        // Salida esperada
        // Debería verificar si el subscriptor recibió la notificación.
        // En este caso, se simula que el subscriptor imprime el mensaje.
    }
}
