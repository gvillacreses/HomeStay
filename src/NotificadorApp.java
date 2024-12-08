public class NotificadorApp implements Notificador {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Notificación App para " + usuario.getNombre() + ": " + mensaje);
    }
}
