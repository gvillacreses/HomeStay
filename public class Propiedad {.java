public class Propiedad {
    private String nombre;
    private String ubicacion;
    private String tipo;
    private String estado; 
    private String reglas;

    public Propiedad(String nombre, String ubicacion, String tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.estado = "Disponible";
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRules(String reglas) {
        this.reglas = reglas;
    }

    public String getRules() {
        return reglas;
    }
}