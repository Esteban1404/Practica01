package practica01.Service;

import java.util.List;
import practica01.domain.Estado;


/**
 *
 * @author esteb
 */
public interface EstadoService {
    
    public List<Estado> getEstados(); //
    
    public Estado getEstado(Estado estado);//
    
    public void save(Estado estado);//
    
    public void delete (Estado estado); //
    
}
