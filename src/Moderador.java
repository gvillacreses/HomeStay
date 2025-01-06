
public class Moderador extends Usuario implements Handler{
    private Handler next;
    public Moderador(String nombre, String correo, boolean estado) {
        super(nombre, correo);  
    }

    @Override
    public void setNext(Handler h){
        this.next=h;
    }

    @Override
    public void manejarIncidente(Incidente i){
        if(i.getEstado().equals("resuelto")){
            System.out.println("El incidente " + i.getDescripcion() + "ya ha sido resuelto! ");
        }

    }




}
