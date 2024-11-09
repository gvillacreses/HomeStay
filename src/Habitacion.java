public class Habitacion extends Alojamiento{
    public Habitacion(String id, double precioPorNoche) {
        this.id = id;
        this.tipo = "Habitación";
        this.precioPorNoche = precioPorNoche;
        this.estado = "Disponible";
    }

    @Override
    public void reservar() {
        this.estado = "Reservado"; // Cambia el estado al reservar
    }
}