public class Incidente {
    private int incidentId;
    private String description;
    private EstadoDeIncidente status;
    private Anfitrion host;
    private Huesped guest;
    private SoporteTecnico supportTeam;
    
    public Incidente(int incidentId, String description, Anfitrion host, Huesped guest) {
        this.incidentId = incidentId;
        this.description = description;
        this.status = EstadoDeIncidente.REPORTADO;
        this.host = host;
        this.guest = guest;
    }

    public String getDescripcion() {
        return description;
    }

    public void setEstado(EstadoDeIncidente status) {
        this.status = status;
    }

    public EstadoDeIncidente getEstado() {
        return status;
    }

    public void escalar() {
    }

    // Resolver el incidente
    public void resolve() {
    }
}