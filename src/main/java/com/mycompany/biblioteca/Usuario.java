public class Usuario {

    private String nombre;
    private int id;
    private Libro libroPrestado;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void prestarLibro(Libro libro) {
        libroPrestado = libro;
    }

    public void devolverLibro() {
        libroPrestado = null;
    }
}