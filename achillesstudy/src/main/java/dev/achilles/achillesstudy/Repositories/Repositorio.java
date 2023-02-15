package dev.achilles.achillesstudy.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import dev.achilles.achillesstudy.Model.Empregado;;;


public interface Repositorio extends CrudRepository<Empregado, Integer> {
    
    @Override
    List<Empregado> findAll();

}
