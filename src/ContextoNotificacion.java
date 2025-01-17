
public class ContextoNotificacion{
    private Notificador estrategia;

    public void setEstrategia(Notificador estrategia){
        this.estrategia = estrategia;
    }

    public void enviar(String mensaje, Usuario usuario){
        if(estrategia != null){
            estrategia.enviarNotificacion(mensaje, usuario);
        } else{
            System.out.println("Estrategia de notificacion no configurada");
        }
    }
}