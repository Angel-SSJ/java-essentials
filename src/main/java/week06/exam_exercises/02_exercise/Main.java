import java.util.ArrayList;

public class Main {

    public static class Libro {
        public String titulo;
        public String autor;
        public double precio;

        public Libro(String titulo, String autor, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.precio = precio;
        }

        public String getTitulo(){return titulo;}
        public String getAutor(){return autor;}
        public double getPrecio(){return precio;}

        public void setTitulo(String titulo){this.titulo = titulo;}
        public void setAutor(String autor){this.autor = autor;}
        public void setPrecio(double precio){this.precio = precio;};

        @Override
        public String toString(){
            return "Libro: Titulo = "+ titulo + ", Autor = " + autor + ", Precio = " + precio;


        }
    }
    public static class LibroDigital extends Libro{
        private double tamanoMB;

        public LibroDigital(String titulo, String autor, double precio, double tamanoMB){
            super(titulo, autor, precio);
            this.tamanoMB = tamanoMB;
        }

        public double getTamanoMB(){return tamanoMB;}
        public void setTamanoMB(double tamanoMB){this.tamanoMB = tamanoMB;}

        @Override
        public String toString(){
            return "Libro Digital: Titulo = "+ titulo + ", Autor = " + autor + ", Precio = " + precio +", TamañoMB = " + tamanoMB;
        }
    }


    public static class Biblioteca {
        private ArrayList<Libro> libros;

        public Biblioteca() {
            libros = new ArrayList<>();
        }

        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        public void mostrarLibros() {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca  = new Biblioteca();

        biblioteca.agregarLibro(new Libro("Cien años de soledad","García Márquez",20.5));
        biblioteca.agregarLibro(new Libro("El Principito","Saint-Exupéry",15.0));
        biblioteca.agregarLibro(new LibroDigital("Java for Dummies","Barry Burd",30.0, 5.5));
        biblioteca.mostrarLibros();
    }


}