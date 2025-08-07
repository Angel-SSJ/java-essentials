// clase EmailNotificacion
class EmailNotificacion extends Notificacion implements Priorizable{
    EmailNotificacion(String remitente, String mensaje) {
        super(remitente, mensaje);
    }
    @Override
    void Enviar() {
        System.out.println("Email de: " + remitente);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Prioridad " + Priorizable.Alta);
    }
}