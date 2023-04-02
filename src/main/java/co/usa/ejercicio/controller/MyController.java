package co.usa.ejercicio.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/juegos")//ruta dentro de la apppara aceeder al componente
public class MyController {
    
    @GetMapping("/saludar")
    public String hola(){
        return "<h1>Hola mundo</h1>";
    }
}
