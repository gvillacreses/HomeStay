import java.util.ArrayList;
import java.util.List;

public class ServicioNotificacion {
    private List<Notificador> notificadores = new ArrayList<>();

    public ServicioNotificacion() {
        this.notificadores = new ArrayList<>();
    }

    public void agregarNotificador(Notificador notificador) {
        notificadores.add(notificador);
    }

    public void enviarNotificacion(String mensaje, Usuario usuario) {
        for (Notificador notificador : notificadores) {
            notificador.enviarNotificacion(mensaje, usuario);
        }
    }
}