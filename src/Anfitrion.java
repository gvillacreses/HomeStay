import java.util.ArrayList;
import java.util.List;

public class Anfitrion extends Usuario {
    private List<Propiedad> propiedades;

    public Anfitrion(String nombre, String correo) {
        super(nombre, correo);
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public void establecerRestriccion(Propiedad propiedad, String descripcion, String checkIn, String checkOut) {
        Restriccion restriccion = new Restriccion(descripcion, checkIn, checkOut);
        propiedad.agregarRestriccion(restriccion);
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void resolverProblema(Incidente incidente){
        incidente.resolverIncidente();
        System.out.println("El anfitrión " + getNombre() + " ha resuelto el incidente: " + incidente.getDescripcion());
    }

    public void escalarProblema(Incidente incidente){
        incidente.escalarIncidente();
        System.out.println("El anfitrión " + getNombre() + " ha escalado el incidente: " + incidente.getDescripcion());
    }

    public void calificarHuesped(Huesped huesped, int puntuacion, String comentario){
        Calificacion calificacion = new Calificacion(puntuacion, comentario, huesped);
        System.out.println("Huésped calificado: " + calificacion.mostrarCalificacion());
    }

    public void rellenarFormulario(String formulario){
        System.out.println("El anfitrión " + getNombre() + " ha rellenado el formulario: " + formulario);

    }

}