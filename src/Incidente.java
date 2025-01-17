import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Incidente implements Subscripcion{
    private String id;
    private String descripcion;
    private String estado; // abierto, resuelto, escalado
    private List<Subscriptor> subscriptores;

    public Incidente(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.subscriptores = new ArrayList<>();
    }
    
    public void resolverIncidente() {
        this.estado = "resuelto";
        notificarSubscriptor("El incidente " + descripcion + " ha sido resuelto.");
    }


    public String getDescripcion(){
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
        notificarSubscriptor("El incidente " + descripcion + " ha cambiado a estado: " + estado);
    }

    @Override
    public void addSubscriptor(Subscriptor subscriptor) {
        subscriptores.add(subscriptor);
    }

    @Override
    public void removeSubscriptor(Subscriptor subscriptor) {
        subscriptores.remove(subscriptor);
    }

    @Override
    public void notificarSubscriptor(String mensaje) {
        for (Subscriptor subscriptor : subscriptores) {
            subscriptor.update(mensaje);
        }
    }
}