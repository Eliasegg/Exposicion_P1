package exposicion_p1;

/**
 *
 * @author elias
 */
public class Biblioteca {
    private Libro[] coleccion;
    private int cantidadLibros;

    public Biblioteca(Libro[] libros) {
        this.coleccion = libros;
        this.cantidadLibros = libros.length;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (coleccion[i].getTitulo().equals(titulo)) {
                return coleccion[i];
            }
        }
        return null; // Retorna null si no se encuentra el libro
    }

    public Libro[] obtenerLibrosPorAño(String año) {
        int count = 0;        
        for (int i = 0; i < cantidadLibros; i++) {
            if (coleccion[i].getFecha_pub().equals(año)) {
                count++;
            }
        }
        Libro[] librosPorAño = new Libro[count];
        int index = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (coleccion[i].getFecha_pub().equals(año)) {
                librosPorAño[index++] = coleccion[i];
            }
        }
        return librosPorAño;
    }

    public Libro[] obtenerLibrosPorEditorial(String editorial) {
        int count = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (coleccion[i].getEditorial().equals(editorial)) {
                count++;
            }
        }
        Libro[] librosPorEditorial = new Libro[count];
        int index = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (coleccion[i].getEditorial().equals(editorial)) {
                librosPorEditorial[index++] = coleccion[i];
            }
        }
        return librosPorEditorial;
    }

    public Libro[] obtenerLibrosPorAutor(String autor) {
        int count = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (coleccion[i].getAutor().equals(autor)) {
                count++;
            }
        }
        Libro[] librosPorAutor = new Libro[count];
        int index = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (coleccion[i].getAutor().equals(autor)) {
                librosPorAutor[index++] = coleccion[i];
            }
        }
        return librosPorAutor;
    }

    public Libro[] getColeccion() {
        return coleccion;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void mostrarColeccion() {
        System.out.println("Coleccion de libros:");
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("- " + coleccion[i].getTitulo());
        }
    }
}
