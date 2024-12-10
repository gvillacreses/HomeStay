import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico {
    private List<Incidente> incidentes;
    private static SoporteTecnico instancia;

    private SoporteTecnico() {
        this.incidentes = new ArrayList<>();
    }

    public static SoporteTecnico getInstancia(){
        if(instancia == null){
            instancia = new SoporteTecnico();
        }
        return instancia;
    }

    public void gestionarIncidente(Incidente incidente) {
        incidentes.add(incidente);
        System.out.println("Incidente gestionado: " + incidente.getDescripcion());
    }
}
