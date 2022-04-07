package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;
import libreria.interfaces.LibreriaCRUD;

public class LibroDAO implements LibreriaCRUD<Libro, Integer> {

    
    @Override
    public void insertar(Libro libro) {
        try {
            EM.getTransaction().begin();
            EM.persist(libro);
            EM.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
    
    @Override
    public List<Libro> obtenerTodo(Libro entidad) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Libro obtenerPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void actualizar(Libro entidad) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
