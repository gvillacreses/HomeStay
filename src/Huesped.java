
import java.util.ArrayList;
import java.util.List;
public class Huesped extends Usuario {
    public Huesped(String nombre, String correo) {
        super(nombre, correo);
    }
    public void reservar(Propiedad propiedad, Unidad unidad, PeriodoReserva periodo, ContextoNotificacion contexto, MetodoPago metodoPago, double monto){
        Reserva reserva = new Reserva(unidad, this, periodo);
        reserva.confirmarReserva(contexto, metodoPago, monto);
    }

    public List<Propiedad> buscarPropiedad(String criterios){
        // puede fallar en la busqueda y devolver una lista de propiedades que coincidan.
        System.out.println("Buscando propiedades con criterios: " + criterios);
        return new ArrayList<>();
    }
    /* Inappropiate Intimacy - Move Method a Propiedad
    public void dejarCalificacion(Propiedad propiedad, int puntuacion, String comentario) {
        Calificacion calificacion = new Calificacion(puntuacion, comentario, this);
        propiedad.agregarCalificacion(calificacion);
        System.out.println("Calificación registrada para la propiedad: " + propiedad);
    }
    */
    public void reportarIncidente(Anfitrion a, Incidente i){
        a.manejarIncidente(i);
    }
    
    public void dejarCalificacion(Propiedad propiedad, int puntuacion, String comentario) {
        propiedad.agregarCalificacion(this, puntuacion, comentario);
    }
    public void recibirCalificacion(int puntuacion, String comentario) {
        Calificacion calificacion = new Calificacion(puntuacion, comentario, this);
        System.out.println("Nueva calificación recibida: " + calificacion.mostrarCalificacion());
    }
}