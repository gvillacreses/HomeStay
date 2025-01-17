
public interface Subscripcion{
    void addSubscriptor(Subscriptor subscriptor);
    void removeSubscriptor(Subscriptor subscriptor);
    void notificarSubscriptor(String mensaje);
}