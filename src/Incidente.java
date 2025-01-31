
import java.util.ArrayList;
import java.util.List;


public class Incidente{
    private String id;
    private String descripcion;
    private String estado; // abierto, resuelto, escalado
    private ManejadorSubscripciones manejadorSubscripciones;

    public Incidente(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.manejadorSubscripciones = new ManejadorSubscripciones();
    }
    /*Message Chain - Hide Delegate
    public void resolverIncidente() {
        this.estado = "resuelto";
        manejadorSubscripciones.notificarSubscriptor("El incidente " + descripcion + " ha sido resuelto.");
    }
    */
    public void resolverIncidente() {
        cambiarEstado("resuelto");
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        manejadorSubscripciones.notificarSubscriptor("El incidente " + descripcion + " ha cambiado a estado: " + estado);
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
        manejadorSubscripciones.notificarSubscriptor("El incidente " + descripcion + " ha cambiado a estado: " + estado);
    }
    /* Divergent Change - Extract Class
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
    */

    public void addSubscriptor(Subscriptor subscriptor) {
        manejadorSubscripciones.addSubscriptor(subscriptor);
    }

    public void removeSubscriptor(Subscriptor subscriptor) {
        manejadorSubscripciones.removeSubscriptor(subscriptor);
    }
}