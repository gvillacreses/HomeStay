public class Moderador extends Usuario implements Handler{
    private boolean disponible;
    private Handler next;
    
    public Moderador(String nombre, String correo) {
        super(nombre, correo);
        disponible = true;
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

        else if(i.getEstado().equals("escalado") && this.disponible){
            i.resolverIncidente();
            this.disponible=false;
            System.out.println("El moderador " + getNombre() + " ha resuelto el incidente: " + i.getDescripcion());
            return;
        }
        if(next!=null && this.disponible == false){
            i.setEstado("escalado");
            next.manejarIncidente(i);
        }
    }
}