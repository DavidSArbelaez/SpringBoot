package co.usa.ejercicio.repository;

import co.usa.ejercicio.entity.Game;
import org.springframework.data.repository.CrudRepository;
public interface GameCrudRepository extends CrudRepository<Game,Long>{
}