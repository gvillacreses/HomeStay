public class ManejadorSubscripciones implements Subscripcion {
    private List<Subscriptor> subscriptores;

    public ManejadorSubscripciones() {
        this.subscriptores = new ArrayList<>();
    }

    @Override
    public void addSubscriptor(Subscriptor subscriptor) {
        subscriptores.add(subscriptor);
    }

    @Override
    public void removeSubscriptor(Subscriptor subscriptor) {
        subscriptores.remove(subscriptor);
    }

    @Override
    public void notificarSubscriptor(String mensaje) {
        for (Subscriptor subscriptor : subscriptores) {
            subscriptor.update(mensaje);
        }
    }
}