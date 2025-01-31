public class ManejadorNotificadores {
    private List<Notificador> notificadores;

    public ManejadorNotificadores() {
        this.notificadores = new ArrayList<>();
    }

    public void agregarNotificador(Notificador notificador) {
        notificadores.add(notificador);
    }

    public List<Notificador> getNotificadores() {
        return notificadores;
    }
}