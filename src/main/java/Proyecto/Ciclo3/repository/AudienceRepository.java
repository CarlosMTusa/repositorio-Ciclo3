/*
 * 
 */
package Proyecto.Ciclo3.repository;

import Proyecto.Ciclo3.model.Audience;
import Proyecto.Ciclo3.repository.crud.AudienceCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class AudienceRepository {

    @Autowired
    AudienceCrudRepository audienceCrudRepository;
    
    public List<Audience>getAll(){
        return (List<Audience>)audienceCrudRepository.findAll();
    }

    public Optional<Audience>getAudience(int id){
        return audienceCrudRepository.findById(id);
    }
    
    public Audience save (Audience audi){
        return audienceCrudRepository.save(audi);
    }

    public void delete(Audience audi){
        audienceCrudRepository.delete(audi);
    }

}


