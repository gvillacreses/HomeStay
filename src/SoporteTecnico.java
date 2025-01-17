public class SoporteTecnico extends Usuario implements Handler{
    private Handler next;
    public SoporteTecnico(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public void setNext(Handler h){
        this.next=h;
    }

    @Override
    public void manejarIncidente(Incidente i){

        if(i.getEstado().equals("resuelto")){
            System.out.println("El incidente " + i.getDescripcion() + " ya ha sido resuelto! ");
            return;
        }
        else if(i.getEstado().equals("abierto"));
        i.resolverIncidente();
        System.out.println("El encargado de soporte técnico " + getNombre() + " ha resuelto el incidente: " + i.getDescripcion());
    }
}