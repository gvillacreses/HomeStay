import java.util.List;
import java.util.ArrayList;
public class Huesped extends Usuario {
    public Huesped(String nombre, String correo) {
        super(nombre, correo);
    }
    public void reservar(){
        // ..
    }

    public List<Propiedad> buscarPropiedad(String criterios){
        // puede fallar en la busqueda y devolver una lista de propiedades que coincidan.
        return new ArrayList<Propiedad>();
    }
    
    public void dejarCalificacion(Propiedad propiedad, int puntuacion, String comentario) {
        Calificacion calificacion = new Calificacion(puntuacion, comentario, this);
        propiedad.agregarCalificacion(calificacion);
    }

    public void reportarIncidente(){
        // ..
    }
}