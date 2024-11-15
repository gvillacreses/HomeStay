public class Huesped extends Usuario {
    public Huesped(String nombre, String correo) {
        super(nombre, correo);
    }
    public void reservar(){
        // ..
    }

    public void buscarPropiedad(){
        // puede fallar en la busqueda
    }
    
    public void dejarCalificacion(Propiedad propiedad, int puntuacion, String comentario) {
        Calificacion calificacion = new Calificacion(puntuacion, comentario, this);
        propiedad.agregarCalificacion(calificacion);
    }
}