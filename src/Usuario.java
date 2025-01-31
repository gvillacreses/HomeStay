
public abstract class Usuario{
    private String nombre;
    private String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
    /* Incomplete Library Class - Introduce Local Extension
    public void update(String mensaje){
        System.out.println("Notificacion para " + nombre + ": " + mensaje);
    }
    */
}