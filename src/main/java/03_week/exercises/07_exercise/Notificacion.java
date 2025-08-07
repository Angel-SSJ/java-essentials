// clase abstracta Notificacion
abstract class Notificacion {
    String remitente;
    String mensaje;
    Notificacion(String remitente, String mensaje) {
        this.remitente = remitente;
        this.mensaje = mensaje;
    }
    // metodo abstratcto enviar
    abstract void Enviar();
}
