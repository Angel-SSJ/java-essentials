public class Main{
    public static void main(String[] args) {
        EmailNotificacion email = new EmailNotificacion("Ing. Christian", "Clase a las 6:00 PM");
        SMSNotificacion sms = new SMSNotificacion("Mamá", "Comida lista");
        email.Enviar();
        System.out.println();
        sms.Enviar();
    }
}
