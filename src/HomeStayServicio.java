public class HomeStayServicio {
    public static void main(String[] args) {

    // 1. Crear usuarios: anfitrión y huésped
    Anfitrion anfitrion = new Anfitrion("Carlos Herrera", "carlos.herrera@egmail.com");
    Huesped huesped = new Huesped("Ana Gómez", "ana.gomez@outlook.es");
    Moderador moderador = new Moderador("James McGill", "james_mc@outlook.com");
    SoporteTecnico soporte = new SoporteTecnico("Luis Perez", "Luis.perez@homestay.ec");

    // 1.1 Crear incidentes
    Incidente i1 = new Incidente("001", "Fuga de agua en la cocina");
    Incidente i2 = new Incidente("002", "Corte de energía");
    Incidente i3 = new Incidente("003", "Goteras en el techo");

    // 1.2 Chain of Responsibility
    anfitrion.setNext(moderador);
    moderador.setNext(soporte);

    // 2. Crear propiedad y unidades
    Propiedad propiedad = new Propiedad("Departamento Central", "Quito");
    Unidad unidad1 = new Unidad("Habitación Doble", "Disponible");
    Unidad unidad2 = new Unidad("Suite Familiar", "Disponible");
    propiedad.agregarUnidad(unidad1);
    propiedad.agregarUnidad(unidad2);
    
    // Anfitrión agrega propiedad
    anfitrion.agregarPropiedad(propiedad);
    
    // 3. Establecer restricciones en la propiedad
    anfitrion.establecerRestriccion(propiedad, "No se permiten mascotas", "14:00", "10:00");
    
    // 4. Huesped busca una propiedad
    System.out.println("Huésped busca propiedades:");
    huesped.buscarPropiedad("Quito");
    
    // 5. Realizar una reserva
    System.out.println("\nHuésped realiza una reserva:");
    ContextoNotificacion contexto = new ContextoNotificacion();
    contexto.setEstrategia(new NotificadorApp()); // Elegimos notificar por la app
    
    MetodoPago metodoPago = new PaypalFactory().crearMetodoPago(); // Pago con PayPal
    huesped.reservar(propiedad, unidad1, "2024-12-20", "2024-12-25", contexto, metodoPago, 250.0);
    
    // 6. Dejar una calificación para la propiedad
    System.out.println("\nHuésped deja una calificación:");
    huesped.dejarCalificacion(propiedad, 5, "Excelente lugar, muy limpio y bien ubicado.");


    
    // 7. Reportar un incidente
    System.out.println("\nHuésped reporta un incidente:");
    huesped.reportarIncidente(anfitrion, i1);
    
    
    // 8.1 Huesped reporta un incidente que el anfitrion no puede resolver, por lo tanto, se escala.
    System.out.println("\nHuesped reporta otro incidente: ");
    huesped.reportarIncidente(anfitrion, i2);

    // 8.2 Huesped reporta otro incidente que no puede resolver ni el anfitrion ni el moderador, por lo tanto se escala finalmente al soporte técnico.
    System.out.println("\nHuesped reporta el último incidente: ");
    huesped.reportarIncidente(anfitrion, i3);


    // 9. Notificaciones adicionales
    System.out.println("\nEnviar notificaciones adicionales:");
    contexto.setEstrategia(new NotificadorEmail());
    contexto.enviar("Gracias por su reseña, esperamos recibirlo pronto.", huesped);
    
    contexto.setEstrategia(new NotificadorSMS());
    contexto.enviar("Recuerde su salida programada para el 25 de diciembre.", huesped);
    
    // 10. Mostrar detalles finales
    System.out.println("\nPropiedad después de las operaciones:");
    for (Calificacion calificacion : propiedad.getCalificaciones()) {
        System.out.println(calificacion.mostrarCalificacion());
    }
    for (Restriccion restriccion : propiedad.getRestricciones()) {
        System.out.println("Restricción: " + restriccion.getDescripcion() +
        ", Check-In: " + restriccion.getHorarioCheckIn() +
        ", Check-Out: " + restriccion.getHorarioCheckOut());
    }

    Incidente incidente = new Incidente("001", "Fuga de agua");
    Anfitrion anfitrion2 = new Anfitrion("Carlos", "carlos@mail.com");
    Moderador moderador2 = new Moderador("Ana", "ana@mail.com");

    incidente.addSubscriptor(anfitrion2);
    incidente.addSubscriptor(moderador2);

    incidente.setEstado("escalado");  // Notificará a todos los observadores.

    }
}