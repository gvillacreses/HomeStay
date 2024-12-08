public class NotificadorSMS implements Notificador {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Mensaje SMS enviado a " + usuario.getNombre());
        System.out.println("Contenido del mensaje: " + mensaje);
    }
}
