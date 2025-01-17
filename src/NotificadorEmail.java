
public class NotificadorEmail implements Notificador {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Correo electrónico enviado a " + usuario.getCorreo());
        System.out.println("Asunto: Notificación del sistema");
        System.out.println("Cuerpo: " + mensaje);
    }
}