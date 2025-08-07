public class Electrodomestico {
    // Atributos
    private char consumoEnergetico; // A, B, C, D, E, F
    private double precio;
    private String color;
    private double peso;
    // Constructor por defecto
    public Electrodomestico() {
        this.consumoEnergetico = 'F';
        this.precio = 100.0;
        this.color = "Blanco";
        this.peso = 5.0;
    }
    // Constructor con parametros
    public Electrodomestico(char consumoEnergetico, double precio, String color, double peso) {
        setConsumoEnergetico(consumoEnergetico);
        setPrecio(precio);
        setColor(color);
        setPeso(peso);
    }
    // Getters
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPrecio() {
        return precio;
    }
    public String getColor() {
        return color;
    }
    public double getPeso() {
        return peso;
    }
    // Setters con validación
    public void setConsumoEnergetico(char consumoEnergetico) {
        //Valida que este entre el rango de A y F sino devuelve el ultimo
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }
    }
    public void setPrecio(double precio) {
        //Devuelve el valor maximo entre precio y 0
        this.precio = Math.max(precio, 0);
    }
    public void setColor(String color) {
        //Retorna un valor por defecto 'Blanco' si color es nulo o esta vacio
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "Blanco";
        }
    }
    public void setPeso(double peso) {
        //Retorna un valor minimo si peso no es mayor a 0
        this.peso = (peso > 0) ? peso : 1.0;
    }
    // Metodo para calcular precio final según consumo y peso
    public double precioFinal() {
        double aumento = 0;
        // Aumento por consumo energético
        switch (consumoEnergetico) {
            case 'A': aumento += 100; break;
            case 'B': aumento += 80; break;
            case 'C': aumento += 60; break;
            case 'D': aumento += 40; break;
            case 'E': aumento += 20; break;
            case 'F': aumento += 10; break;
        }
        // Aumento por peso
        if (peso >= 0 && peso < 20) {
            aumento += 10;
        } else if (peso < 50) {
            aumento += 50;
        } else if (peso < 80) {
            aumento += 80;
        } else {
            aumento += 100;
        }
        return precio + aumento;
    }
    // Sobrecarga para aplicar descuento adicional
    public double precioFinal(double descuentoPorcentaje) {
        double precioBase = precioFinal();
        double descuento = precioBase * (descuentoPorcentaje / 100);
        return precioBase - descuento;
    }
    public static class Main {
        public static void main(String[] args) {
            //Creacion de objetos
            Electrodomestico e1 = new Electrodomestico('B', 200, "Negro", 45);
            Electrodomestico e2 = new Electrodomestico();
            //Imprimir resultados en consola
            System.out.println("Precio final e1 de consumo energético: "+ e1.getConsumoEnergetico() +"es: "+
                    e1.precioFinal());
            System.out.println("Precio final e1 con 10% descuento: $" + e1.precioFinal(10));
            System.out.println("Precio final e2 (por defecto): $" + e2.precioFinal());
            //Haciendo uso de getters
            System.out.println("Consumo energetico de e2 (por defecto) " + e2.getConsumoEnergetico() + " con precio: " +
                    e2.getPrecio() + ", color: " + e2.getColor() + " y peso: " + e2.getPeso() + ", su precio final con 10% de descuento es $: " +
                    e2.precioFinal(10));
        }
    }
}