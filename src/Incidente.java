
import java.util.ArrayList;
import java.util.List;


public class Incidente{
    private String id;
    private String descripcion;
    /* Stringly Typed Code - Type code with State/Strategy
    private String estado; // abierto, resuelto, escalado
     */
    private EstadoIncidente estado;
    private ManejadorSubscripciones manejadorSubscripciones;

    public Incidente(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = new EstadoAbierto();
        this.manejadorSubscripciones = new ManejadorSubscripciones();
    }
    /*Message Chain - Hide Delegate
    public void resolverIncidente() {
        this.estado = "resuelto";
        manejadorSubscripciones.notificarSubscriptor("El incidente " + descripcion + " ha sido resuelto.");
    }
    */

    public void manejarIncidente() {
        estado.manejar(this);
        manejadorSubscripciones.notificarSubscriptor("El incidente " + descripcion + " ha cambiado a estado: " + estado.getNombre());
    }

    public void resolverIncidente() {
        estado.manejar(this);
    }

    public void cambiarEstado(EstadoIncidente nuevoEstado) {
        this.estado = nuevoEstado;
        manejadorSubscripciones.notificarSubscriptor("El incidente " + descripcion + " ha cambiado a estado: " + estado.getNombre());
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getEstado() {
        return estado.getNombre();
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