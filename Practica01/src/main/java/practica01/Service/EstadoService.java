/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica01.Service;

import java.util.List;
import practica01.domain.Estado;


/**
 *
 * @author esteb
 */
public interface EstadoService {
    
    public List<Estado> getEstados(); //TRAER LISTA DE CLIENTES
    
    public Estado getEstado(Estado estado);//UN UNICO CLIENTE
    
    public void save(Estado estado);// Para insertar o modificar (Si viene el idCliente o no)
    
    public void delete (Estado estado); //ELIMINAR CLIENTE
    
}
