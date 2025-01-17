

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String nombre;
    private String ubicacion;
    private List<Unidad> unidades;
    private List<Restriccion> restricciones;
    private List<Calificacion> calificaciones;

    public Propiedad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.unidades = new ArrayList<>();
        this.restricciones = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    public void agregarUnidad(Unidad unidad) {
        unidades.add(unidad);
    }

    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    public void agregarRestriccion(Restriccion restriccion) {
        restricciones.add(restriccion);
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public List<Restriccion> getRestricciones() {
        return restricciones;
    }

    @Override
    public String toString() {
        return "Propiedad: " + nombre + " en " + ubicacion;
    }
}