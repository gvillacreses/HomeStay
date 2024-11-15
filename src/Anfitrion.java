import java.util.ArrayList;
import java.util.List;

public class Anfitrion extends Usuario {
    private List<Propiedad> propiedades;

    public Anfitrion(String nombre, String correo) {
        super(nombre, correo);
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public void establecerRestriccion(Propiedad propiedad, String descripcion, String checkIn, String checkOut) {
        Restriccion restriccion = new Restriccion(descripcion, checkIn, checkOut);
        propiedad.agregarRestriccion(restriccion);
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }
}