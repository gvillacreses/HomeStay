import java.util.*;

public class Huesped extends Usuario {
    protected String idHuesped;
    protected List<Reserva> reservas = new ArrayList<>();

    public Huesped(String nombre, String correo, String telefono, String idHuesped){
        super(nombre, correo, telefono);
        this.idHuesped = idHuesped;
    }
    
    public void buscar_propiedades(){
    }

    public void reservar_propiedad(){
    }
}
