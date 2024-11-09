public class Usuario {
    protected String nombre;
    protected String correo;
    protected String telefono;

    public Usuario(String nombre, String correo, String telefono){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public String getNombre(){return this.nombre;}
    public String getCorreo(){return this.correo;}
    public String getTelefono(){return this.telefono;}

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setCorreo(String correo){this.correo = correo;}
    public void setTelefono(String telefono){this.telefono = telefono;}
}
