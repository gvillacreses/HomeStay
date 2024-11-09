import java.util.List;
import java.util.ArrayList;

public class Anfitrion extends Usuario {
    private List<Propiedad> propiedades;

    public Anfitrion(String name, String email, String tel) {
        super(name, email, tel);
        this.propiedades = new ArrayList<>();
    }

    // Agregar una nueva propiedad
    public void addProperty(Propiedad pro) {
        propiedades.add(pro);
        System.out.println("Property added: " + pro.getNombre());
    }

    // Gestionar reglas y políticas de la propiedad
    public void setRules(Propiedad property, String rules) {
        property.setRules(rules);
        System.out.println("Rules set for property: " + property.getNombre());
    }

    // Verificar el estado de una reserva
    public void verificarEstadoDeReserva(Reserva reservation) {
        System.out.println("Estado de la Reserva: " + reservation.getEstado());
    }

    // Escalar un incidente
    public void escalarIncidente(Incidente incident) {
        incident.escalar();
    }

}