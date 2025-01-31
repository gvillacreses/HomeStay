public interface Handler {
    public void setNext(Handler h);
    public void manejarIncidente(Incidente i);
}
