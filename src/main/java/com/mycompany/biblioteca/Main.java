public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "harry potter",
                "J. K. Rowling",
                "9788478886128");

        Usuario usuario1 = new Usuario(
                "Antonio",
                1);

        usuario1.prestarLibro(libro1);
        libro1.prestarLibro();

        System.out.println("Usuario: " + usuario1.getNombre());
        System.out.println("Libro prestado: "
                + usuario1.getLibroPrestado().getTitulo());

        libro1.consultarDisponibilidad();
    }
}