public abstract class Usuario implements Subscriptor{
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
    
    public void update(String mensaje){
        System.out.println("Notificacion para " + nombre + ": " + mensaje);
    }
}