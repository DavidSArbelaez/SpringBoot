package co.usa.ejercicio.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.usa.ejercicio.entity.Game;
import co.usa.ejercicio.service.GameService;



@RestController
@RequestMapping("/api/juegos")//ruta dentro de la apppara aceeder al componente
public class MyController {
    @Autowired
    private GameService gameService;

    //Gestionar peticiones,no sirve para enviar contenido html

    @GetMapping("/saludar")
    public String hola(){
        return "<h1>Hola mundo</h1>";
    }

    @GetMapping("/all")
    public List<Game> getAll(){
        return gameService.getAll();
    }

    @PostMapping("/save") //Este metodo se va a ejectuar en el momento en que se haga una peticion a la ruta
    /*
    Instalar postman o cualquier cliente rest
     * Esto son los datos que envia el usuario
     */
    public Game save(@RequestBody Game g){
        return gameService.save(g);
    }
}
