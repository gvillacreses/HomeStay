public class HomeStayServicio {
    public static void main(String[] args) {
    // 1. Crear usuarios: anfitrión y huésped
    Anfitrion anfitrion = new Anfitrion("Carlos Herrera", "carlos.herrera@egmail.com");
    Huesped huesped = new Huesped("Ana Gómez", "ana.gomez@outlook.es");
    
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


    /* 
    // 7. Reportar un incidente
    System.out.println("\nHuésped reporta un incidente:");
    SoporteTecnico soporte = SoporteTecnico.getInstancia();
    huesped.reportarIncidente(soporte, "Fuga de agua en la cocina.");
    
    // 8. Anfitrión resuelve el incidente
    System.out.println("\nAnfitrión resuelve un incidente:");
    Incidente incidente = new Incidente("001", "Fuga de agua en la cocina.");
    anfitrion.resolverProblema(incidente);
    */


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
    }
    }