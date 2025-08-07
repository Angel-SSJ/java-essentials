public class Reloj {
    // Atributos privados
    private int horas;
    private int minutos;
    private int segundos;
    // Constructor por defecto
    public Reloj() {
        this(0, 0, 0);
    }
    // Constructor con parámetros
    public Reloj(int horas, int minutos, int segundos) {
        if (!validarHora(horas, minutos, segundos)) {
            System.out.println("¡Hora inválida! Se establecerá a 00:00:00.");
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        } else {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }
    // Método privado para validar hora
    private boolean validarHora(int horas, int minutos, int segundos) {
        return (horas >= 0 && horas <= 23) &&
                (minutos >= 0 && minutos <= 59) &&
                (segundos >= 0 && segundos <= 59);
    }
    // Método para ajustar la hora
    public void ajustarHora(int horas, int minutos, int segundos) {
        if (validarHora(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("¡Hora inválida! No se realizaron cambios.");
        }
    }
    // Mostrar hora en formato 24 horas
    public void mostrarHora() {
        System.out.printf("Hora (24h): %02d:%02d:%02d\n", horas, minutos, segundos);
    }
    // Mostrar hora en formato 12 horas
    public void mostrarHora(boolean formato12h) {
        if (formato12h) {
            int h12 = (horas % 12 == 0) ? 12 : horas % 12;
            String ampm = (horas < 12) ? "AM" : "PM";
            System.out.printf("Hora (12h): %02d:%02d:%02d %s\n", h12, minutos, segundos, ampm);
        } else {
            mostrarHora(); // llama al método sin parámetros
        }
    }
    // Getters
    public int getHoras() { return horas; }
    public int getMinutos() { return minutos; }
    public int getSegundos() { return segundos; }
    // Setters
    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        } else {
            System.out.println("Error: Horas inválidas (0-23).");
        }
    }
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Error: Minutos inválidos (0-59).");
        }
    }
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Error: Segundos inválidos (0-59).");
        }
    }
    // Método main para probar la clase Reloj
    public static void main(String[] args) {
        System.out.println("Reloj 1 (constructor por defecto):");
        Reloj reloj1 = new Reloj();
        reloj1.mostrarHora();
        reloj1.mostrarHora(true);
        System.out.println("\nReloj 2 (constructor con valores válidos):");
        Reloj reloj2 = new Reloj(13, 30, 15);
        reloj2.mostrarHora();
        reloj2.mostrarHora(true);
        System.out.println("\nIntentando crear reloj con valores inválidos:");
        Reloj reloj3 = new Reloj(25, 61, -1);
        reloj3.mostrarHora();
        System.out.println("\nAjustando hora válida en reloj1:");
        reloj1.ajustarHora(22, 45, 59);
        reloj1.mostrarHora();
        reloj1.mostrarHora(true);
        System.out.println("\nIntentando ajustar hora inválida en reloj2:");
        reloj2.ajustarHora(99, -5, 70);
        reloj2.mostrarHora();
        System.out.println("\nProbando getters y setters:");
        reloj1.setHoras(10);
        reloj1.setMinutos(20);
        reloj1.setSegundos(30);
        System.out.println("Horas: " + reloj1.getHoras());
        System.out.println("Minutos: " + reloj1.getMinutos());
        System.out.println("Segundos: " + reloj1.getSegundos());
    }
}