int opcion = 3; // Puedes cambiar este valor (1, 2 o 3) para probar diferentes casos

switch(opcion) {
        case 1: // Ejemplo de if-else
        System.out.println("--- Ejecutando estructura if-else ---");
int temperatura = 25;
        if (temperatura > 30) {
        System.out.println("Hace calor");
        } else if (temperatura > 20) {
        System.out.println("Temperatura agradable");
        } else {
                System.out.println("Hace frío");
        }
                break;

                case 2: // Ejemplo de for
                System.out.println("--- Ejecutando estructura for ---");
        System.out.println("Cuenta regresiva:");
        for (int i = 5; i >= 0; i--) {
        System.out.println(i);
            if (i == 0) {
        System.out.println("¡Despegue!");
            }
                    }
                    break;

default: // Caso por defecto (incluye el while)
        System.out.println("--- Ejecutando caso default (while) ---");
int num = 1;
        while (num <= 10) {
        System.out.print(num + " ");
num++;
        }
        System.out.println(); // Salto de línea al final
}