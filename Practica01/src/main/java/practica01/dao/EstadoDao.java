/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica01.dao;

import org.springframework.data.repository.CrudRepository;
import practica01.domain.Estado;

/**
 *
 * @author esteb
 */
public interface EstadoDao extends CrudRepository<Estado,Long> {
    
}
