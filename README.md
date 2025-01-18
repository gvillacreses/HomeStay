------------------------------------------------------------------ SISTEMA HOMESTAY ------------------------------------------------------------------
El sistema HomeStay proporciona herramientas a usuarios que deseen reservar unidades de propiedades en diferentes partes del mundo, además de ayudar a usuarios que deseen ser anfitriones poniendo sus propiedades a disposición de huéspedes.
En este proyecto se utilizaron diferentes patrones de diseño de comportamiento, entre aquellos se encuentran:

- Strategy: Este patrón permite resolver un problema de diferentes maneras, en este caso decidimos utilizarlo para resolver el enigma que pueden tener los huéspedes. ¿De qué manera quiero ser notificado?. Los huéspedes podrán seleccionar entre ser notificados por SMS, correo electrónico o por mensajes directos, y demás medios que se pueden agregar en el futuro.
- Observer: En este patrón se sigue la lógica de Emisor-Receptor en el cual los emisores realizan cambios en diferentes temas, y los receptores son avisados de estos cambios. Respecto a HomeStay, consideramos que la resolución de los incidentes puede ser de alto interés para los huéspedes, por lo que ellos serán los suscriptores que tendrán una respuesta por parte del sistema cuando su incidente reportado haya sido solucionado.
- Chain Of Responsibility: Con este patrón se busca llegar a una solución mediante diferentes handlers en los cuales cada uno lo busca solucionar (que si lo puede hacer), y si no lo logra, pasa al siguiente. Bajo este sentido, el manejo de incidentes de HomeStay necesita ser llevado por este patrón. Los huéspedes al momento de reportar un incidente, encargarán al anfitrión para que lo resuelva, pero si no lo puede hacer, lo escalará al moderador que, dependiendo si está disponible, lo solucionará o pasará finalmente hacia el encargado de servicio técnico.

En este proyecto se desarrollaron diversos diagramas para la aplicación HomeStay, incluyendo sus casos de uso, su diagrama de clases y los diagramas individuales de secuencia.
A continuación los enlaces de los proyectos hechos en Visual Paradigm:

DIAGRAMA DE CASOS DE USO:
https://online.visual-paradigm.com/w/wqndnnqu/diagrams/#diagram:workspace=wqndnnqu&proj=0&id=1&type=UseCaseDiagram

DIAGRAMA DE CLASES:
https://lucid.app/lucidchart/1f312cfd-4315-447d-aacb-12f850e55c28/edit?viewport_loc=-297%2C19%2C2879%2C1371%2CHWEp-vi-RSFO&invitationId=inv_f75785f0-d6b8-4db7-910e-87222440246b

DIAGRAMA DE SECUENCIA 1:
https://online.visual-paradigm.com/w/wqndnnqu/diagrams/#diagram:workspace=wqndnnqu&proj=0&id=3&type=SequenceDiagram&width=11&height=8.5&unit=inch

DIAGRAMA DE SECUENCIA 2:
https://online.visual-paradigm.com/w/wqndnnqu/diagrams/#diagram:workspace=wqndnnqu&proj=0&id=4&type=SequenceDiagram

DIAGRAMA DE SECUENCIA 3:
https://online.visual-paradigm.com/w/wqndnnqu/diagrams/#diagram:workspace=wqndnnqu&proj=0&id=5&type=SequenceDiagram

DIAGRAMA DE SECUENCIA 4:
https://online.visual-paradigm.com/w/wqndnnqu/diagrams/#diagram:workspace=wqndnnqu&proj=0&id=6&type=SequenceDiagram
