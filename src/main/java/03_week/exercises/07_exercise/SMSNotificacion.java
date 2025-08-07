// clase SMSNotificacion
class SMSNotificacion extends Notificacion implements Priorizable{
    SMSNotificacion(String remitente, String mensaje) {
        super(remitente, mensaje);
    }
    @Override
    void Enviar() {
        System.out.println("SMS de: " + remitente);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Prioridad " + Priorizable.Media);
    }
}