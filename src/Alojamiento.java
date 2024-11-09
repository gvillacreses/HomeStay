public abstract class Alojamiento {
    protected String id;
    protected String tipo; // Puede ser "Habitación", "Departamento", etc.
    protected String estado; // "Disponible", "Reservado", etc.
    protected double precioPorNoche;

    public abstract void reservar();

}
