public class UsuarioSubscriptor extends Usuario implements Subscriptor {
    public UsuarioSubscriptor(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public void update(String mensaje) {
        System.out.println("Notificación para " + getNombre() + ": " + mensaje);
    }
}