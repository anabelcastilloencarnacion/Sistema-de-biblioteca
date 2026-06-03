public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestarLibro() {
        disponible = false;
    }

    public void devolverLibro() {
        disponible = true;
    }

    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro está disponible");
        } else {
            System.out.println("El libro está prestado");
        }
    }
}