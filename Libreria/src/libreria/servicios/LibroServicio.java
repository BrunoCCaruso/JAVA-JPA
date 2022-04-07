
package libreria.servicios;

import java.util.Locale;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;


public class LibroServicio {
    
    private LibroDAO libroDao = new LibroDAO(); 
    
    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public void crearLibro(){        
        Libro libro = new Libro(); 
        System.out.println("Ingrese el título del libro: ");
        String tituloLibro = entrada.next();
        libro.setTitulo(tituloLibro);
        System.out.println("Ingrese el ISBN del libro: ");
        Long isbn = entrada.nextLong();
        libro.setIsbn(isbn);
       // System.out.println("Ingrese el autor del libro: "); //////////// setear cuando relaciono las entidades
       // String autor = entrada.next();
        System.out.println("Ingrese el año de salida del libro: ");
        Integer anio = entrada.nextInt();
        libro.setAnio(anio);
                
        System.out.println("Cantidad de libros a crear: ");
        Integer cantLibros = entrada.nextInt();
        libro.setEjemplares(cantLibros);
        
        libro.setEjemplaresPrestados(0);
        libro.setEjemplaresRestantes(libro.getEjemplares()-libro.getEjemplaresPrestados());
    
        libro.setAlta(Boolean.TRUE);
        
        libroDao.insertar(libro);
        
    }
    
    
}
