package practica01.dao;

import org.springframework.data.repository.CrudRepository;
import practica01.domain.Estado;

public interface EstadoDao extends CrudRepository<Estado,Long> {
    
}
