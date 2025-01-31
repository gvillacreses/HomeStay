
public class Moderador extends Usuario implements Handler{
    /* Temporary Field - Introduce Parameter Object
    private boolean disponible;
     */
    private Handler next;
    
    public Moderador(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public void setNext(Handler h){
        this.next=h;
    }
    @Override
    public void manejarIncidente(Incidente i){
        if (i.getEstado().equals("resuelto")) {
            System.out.println("El incidente " + i.getDescripcion() + " ya ha sido resuelto! ");
            return;
        }

        if (puedeResolverIncidente(i)) {
            i.resolverIncidente();
            System.out.println("El moderador " + getNombre() + " ha resuelto el incidente: " + i.getDescripcion());
            return;
        }

        if (next != null) {
            i.cambiarEstado("escalado");
            next.manejarIncidente(i);
        }
    }

    private boolean puedeResolverIncidente(Incidente i) {
        return i.getEstado().equals("escalado");
    }
}