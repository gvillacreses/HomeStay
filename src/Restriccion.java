public class Restriccion {
    private String descripcion;
    private String horarioCheckIn;
    private String horarioCheckOut;

    public Restriccion(String descripcion, String horarioCheckIn, String horarioCheckOut) {
        this.descripcion = descripcion;
        this.horarioCheckIn = horarioCheckIn;
        this.horarioCheckOut = horarioCheckOut;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getHorarioCheckIn() {
        return horarioCheckIn;
    }

    public String getHorarioCheckOut() {
        return horarioCheckOut;
    }
}

