/*
 *
 */
package Proyecto.Ciclo3.repository.crud;

import Proyecto.Ciclo3.model.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageCrudRepository extends CrudRepository <Message, Integer> {
    
}
