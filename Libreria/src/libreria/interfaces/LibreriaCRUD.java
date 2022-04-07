package libreria.interfaces;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public interface LibreriaCRUD<T,ID> {
    
    EntityManager EM = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    
    void insertar(T entidad);
    
    List<T> obtenerTodo(T entidad);
    
    T obtenerPorId(ID id);
    
    void actualizar(T entidad);
    
    void eliminarPorId(ID id);
}
