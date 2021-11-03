/*
* 
*/
package Proyecto.Ciclo3.repository;

import Proyecto.Ciclo3.model.Category;
import Proyecto.Ciclo3.repository.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class CategoryRepository {

    @Autowired
    CategoryCrudRepository categoryCrudRepository;
    
    public List<Category>getAll(){
        return (List<Category>)categoryCrudRepository.findAll();
    }

    public Optional<Category>getCategory(int id){
        return categoryCrudRepository.findById(id);
    }
    
    public Category save (Category catd){
        return categoryCrudRepository.save(catd);
    }

    
    public void delete(Category catd){
        categoryCrudRepository.delete(catd);
    }

}
