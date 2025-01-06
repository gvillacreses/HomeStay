public class Incidente {
    private String id;
    private String descripcion;
    private String estado; // abierto, resuelto, escalado

    public Incidente(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "abierto";
    }

    public void resolverIncidente() {
        this.estado = "resuelto";
        System.out.println("Incidente resuelto: " + descripcion);
    }


    public String getDescripcion(){
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
