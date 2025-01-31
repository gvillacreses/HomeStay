

public class Calificacion {
    private int puntuacion; // De 1 a 5
    private String comentario;
    private Huesped huesped;

    public Calificacion(int puntuacion, String comentario, Huesped huesped) {
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.huesped = huesped;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String mostrarCalificacion() {
        return "Puntuación: " + puntuacion + ", Comentario: " + comentario + ", Por: " + huesped.getNombre();
    }
}