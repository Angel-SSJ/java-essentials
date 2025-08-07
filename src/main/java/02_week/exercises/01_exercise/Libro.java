public class Libro {
    //Atributos privados
    private String titulo;
    private String autor;
    private String isbn;
    private int numPaginas;
    //Constructor sin parametros
    public Libro(){}
    //Constructor con todos los atributos
    public Libro(String titulo, String autor, String isbn, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        setNumPaginas(numPaginas); //usa el setter para validar
    }
    //Constructor sin ISBN
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = "No disponible";
        setNumPaginas(numPaginas); //usa el setter para validar
    }
    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        if (numPaginas > 0) {
            this.numPaginas = numPaginas;
        } else {
            System.out.println("El número de páginas debe ser mayor a 0. Se asigna 1 por defecto.");
            this.numPaginas = 1;
        }
    }
    //Metodo mostrarInfo (formato completo)
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numPaginas + "\n");
    }
    //Sobrecarga de mostrarInfo (formato resumido)
    public void mostrarInfo(boolean resumido) {
        if (resumido) {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Número de páginas: " + numPaginas + "\n");
        } else {
            mostrarInfo();
        }
    }
    //Sobrecarga - mostrar con parametro el objeto libro
    private void mostrarInfo(Libro libro) {
        //Imprimir haciendo uso de getters
        if(libro != null) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Número de páginas: " + libro.getNumPaginas() + "\n");
        }else {
            mostrarInfo();
        }
    }
    //Haciendo uso de clases anidadas
    public static class Main {
        public static void main(String[] args) {
            Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "123456789", 417);
            Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
            //Haciendo uso de setters con constructor sin parametros
            Libro libro3 = new Libro();
            libro3.setTitulo("El nombre del viento");
            libro3.setAutor("Patrick Rothfuss");
            libro3.setIsbn("9788498386047");
            libro3.setNumPaginas(900);
            libro1.mostrarInfo(); //formato completo
            libro2.mostrarInfo(true); //formato resumido
            libro3.mostrarInfo(libro3); //formato usando parametro el objeto libro3
        }
    }
}