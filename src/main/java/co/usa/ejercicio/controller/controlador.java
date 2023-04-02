package co.usa.ejercicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/juegos")//ruta dentro de la apppara aceeder al componente
public class controlador {
    
    @GetMapping
    public String hola(){
        return "<h1>Hola</h1>";
    }
}
