package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicioNotificacionTest {

    @Test
    public void testEnviarNotificacion() {
        // Precondiciones
        ServicioNotificacion servicio = new ServicioNotificacion();
        Notificador notificador = new Notificador("Email");
        Usuario usuario = new Usuario("Carlos", "carlos@example.com");

        servicio.agregarNotificador(notificador);

        // Acción
        servicio.enviarNotificacion("Notificación de incidente resuelto", usuario);

        // Salida esperada
        // Aquí deberíamos verificar que el notificador ha enviado el mensaje.
    }
}

