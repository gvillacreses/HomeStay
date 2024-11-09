import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico extends Usuario {
    private List<Incidente> incidentesPendientes;

    // Constructor
    public SoporteTecnico(String nombre, String email, String tele) {
        super(nombre, email,tele);
        this.incidentesPendientes = new ArrayList<>();
    }

    // Método para recibir un incidente escalado al soporte técnico
    public void addIncidente(Incidente incident) {
        incidentesPendientes.add(incident);
        // ..
    }

    // Método para manejar un incidente
    public void handleIncident(Incidente incident) {
        // ..
    }

    // Ver incidentes pendientes
    public List<Incidente> getIncidentesPendientes() {
        return incidentesPendientes;
    }
}
