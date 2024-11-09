public class Incidente {
    private int incidentId;
    private String description;
    private EstadoDeIncidente status;
    private Anfitrion host;
    private Huesped guest;
    private SoporteTecnico supportTeam;
    
    // Constructor
    public Incidente(int incidentId, String description, Anfitrion host, Huesped guest) {
        this.incidentId = incidentId;
        this.description = description;
        this.status = EstadoDeIncidente.REPORTADO;
        this.host = host;
        this.guest = guest;
    }

    // Obtener descripción del incidente
    public String getDescripcion() {
        return description;
    }

    // Cambiar el estado del incidente
    public void setEstado(EstadoDeIncidente status) {
        this.status = status;
    }

    // Obtener el estado actual del incidente
    public EstadoDeIncidente getEstado() {
        return status;
    }

    // Escalar incidente
    public void escalar() {
        // como se escala el incidente a por cada usuario
    }

    // Resolver el incidente
    public void resolve() {
        //
    }
}