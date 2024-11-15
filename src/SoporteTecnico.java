import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico {
    private List<Incidente> incidentes;

    public SoporteTecnico() {
        this.incidentes = new ArrayList<>();
    }

    public void gestionarIncidente(Incidente incidente) {
        incidentes.add(incidente);
        // .. 
    }
}
