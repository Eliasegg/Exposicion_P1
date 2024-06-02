package exposicion_p1;

/**
 *
 * @author Yuli y Elias
 */
public class Exposicion_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro[] librosIniciales = new Libro[20];
        librosIniciales[0] = new Libro("Cien anos de soledad", "Realismo magico", "1967", "Gabriel Garcia Marquez", "Sudamericana", 417);
        librosIniciales[1] = new Libro("Don Quijote de la Mancha", "Novela", "1605", "Miguel de Cervantes", "Francisco de Robles", 863);
        librosIniciales[2] = new Libro("Cronica de una muerte anunciada", "Novela", "1981", "Gabriel Garcia Marquez", "Plaza & Janes", 122);
        librosIniciales[3] = new Libro("1984", "Distopia", "1949", "George Orwell", "Secker & Warburg", 328);
        librosIniciales[4] = new Libro("Brave New World", "Distopia", "1932", "Aldous Huxley", "Chatto & Windus", 311);
        librosIniciales[5] = new Libro("Matar a un ruisenor", "Ficcion", "1960", "Harper Lee", "J.B. Lippincott & Co.", 281);
        librosIniciales[6] = new Libro("El Gran Gatsby", "Tragedia", "1925", "F. Scott Fitzgerald", "Charles Scribner's Sons", 180);
        librosIniciales[7] = new Libro("En llamas", "Ciencia ficcion", "2009", "Suzanne Collins", "Scholastic Press", 391);
        librosIniciales[8] = new Libro("Harry Potter y la piedra filosofal", "Fantasia", "1997", "J.K. Rowling", "Bloomsbury", 223);
        librosIniciales[9] = new Libro("El Senor de los Anillos", "Fantasia", "1954", "J.R.R. Tolkien", "Allen & Unwin", 1216);
        librosIniciales[10] = new Libro("Orgullo y Prejuicio", "Romance", "1813", "Jane Austen", "T. Egerton", 432);
        librosIniciales[11] = new Libro("La Odisea", "Épica", "800 a.C.", "Homero", "Desconocido", 541);
        librosIniciales[12] = new Libro("Ulises", "Modernismo", "1922", "James Joyce", "Sylvia Beach", 730);
        librosIniciales[13] = new Libro("Hamlet", "Tragedia", "1603", "William Shakespeare", "Nicolas Ling", 500);
        librosIniciales[14] = new Libro("La Divina Comedia", "Épica", "1320", "Dante Alighieri", "Johann Numeister", 798);
        librosIniciales[15] = new Libro("El Codigo Da Vinci", "Thriller", "2003", "Dan Brown", "Doubleday", 489);
        librosIniciales[16] = new Libro("Los juegos del hambre", "Ciencia ficcion", "2008", "Suzanne Collins", "Scholastic Press", 374);
        librosIniciales[17] = new Libro("Cumbres Borrascosas", "Gotico", "1847", "Emily Brontë", "Thomas Cautley Newby", 416);
        librosIniciales[18] = new Libro("El Principito", "Fabula", "1943", "Antoine de Saint-Exupery", "Reynal & Hitchcock", 96);
        librosIniciales[19] = new Libro("Frankenstein", "Gotico", "1818", "Mary Shelley", "Lackington, Hughes, Harding, Mavor & Jones", 280);

        Biblioteca biblioteca = new Biblioteca(librosIniciales);
        biblioteca.mostrarColeccion();
        System.out.println("-----------------------------------------");

        Libro libroBuscado = biblioteca.buscarLibroPorTitulo("Cien anos de soledad");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado: " + libroBuscado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }
        System.out.println("-----------------------------------------");
        
        System.out.println("Libro publicados en 1981:");
        for (Libro libro : biblioteca.obtenerLibrosPorAño("1981")) {
            System.out.println("- " + libro.getTitulo());
        }
        System.out.println("-----------------------------------------");

        System.out.println("Libros de la editorial Sudamericana:");
        for (Libro libro : biblioteca.obtenerLibrosPorEditorial("Sudamericana")) {
            System.out.println("- " + libro.getTitulo());
        }        
        System.out.println("-----------------------------------------");

        System.out.println("Libros de Gabriel Garcia Marquez:");
        for (Libro libro : biblioteca.obtenerLibrosPorAutor("Gabriel Garcia Marquez")) {
            System.out.println("- " + libro.getTitulo());
        }
        System.out.println("-----------------------------------------");

    }
    
}
