import java.util.List;
import java.util.ArrayList;
public class Huesped extends Usuario {
    public Huesped(String nombre, String correo) {
        super(nombre, correo);
    }
    public void reservar(Propiedad propiedad, Unidad unidad, String fechaInicio, String fechaFin, ContextoNotificacion contexto, MetodoPago metodoPago, double monto){
        Reserva reserva = new Reserva(unidad, this, fechaInicio, fechaFin);
        reserva.confirmarReserva(contexto, metodoPago, monto);
    }

    public List<Propiedad> buscarPropiedad(String criterios){
        // puede fallar en la busqueda y devolver una lista de propiedades que coincidan.
        System.out.println("Buscando propiedades con criterios: " + criterios);
        return new ArrayList<>();
    }
    
    public void dejarCalificacion(Propiedad propiedad, int puntuacion, String comentario) {
        Calificacion calificacion = new Calificacion(puntuacion, comentario, this);
        propiedad.agregarCalificacion(calificacion);
        System.out.println("Calificación registrada para la propiedad: " + propiedad);
    }

    public void reportarIncidente(SoporteTecnico soporte, String descripcion){
        Incidente incidente = new Incidente("ID_" + System.currentTimeMillis(), descripcion);
        soporte.gestionarIncidente(incidente);
        System.out.println("Incidente reportado: " + incidente.getDescripcion());
    }
}