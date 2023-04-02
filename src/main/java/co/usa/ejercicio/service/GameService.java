package co.usa.ejercicio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.ejercicio.entity.Game;
import co.usa.ejercicio.repository.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> GetAll(){
        return gameRepository.findAll;
    }

    public Game save(Game g){
        return gameRepository.save(g);
    }

    public Optional<Game> get(Long id){
        Optional<Game> g = gameRepository.findById(id);
        if(g.isPresent()){
            return g.get();
        }else{
            Game rta = new Game();
            rta.setName("Paila");
            return rta;
        }
    }
}
