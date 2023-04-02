package co.usa.ejercicio.repository;


import com.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public class GameRepository {
    @Autowired
    private GameCrudRepository gameCrudRepository;

    public List<Game> findAll() {
        return (List<Game>) gameCrudRepository.findAll();
    }

    public Optional<Game> findById(Long id) {
        return gameCrudRepository.findById(id);
    }

    public <S extends Game> S save(S game) {
        return gameCrudRepository.save(game);
    }

    public void deleteById(Long id) {
        gameCrudRepository.deleteById(id);
    }
}
