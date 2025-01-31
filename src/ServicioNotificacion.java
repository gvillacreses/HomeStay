public class ServicioNotificacion {
    /* Shotgun Surgery - Extract Class
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
    */
    private ManejadorNotificadores manejador;

    public ServicioNotificacion() {
        this.manejador = new ManejadorNotificadores();
    }

    public void agregarNotificador(Notificador notificador) {
        manejador.agregarNotificador(notificador);
    }

    public void enviarNotificacion(String mensaje, Usuario usuario) {
        for (Notificador notificador : manejador.getNotificadores()) {
            notificador.enviarNotificacion(mensaje, usuario);
        }
    }
}