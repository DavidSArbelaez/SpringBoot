package co.usa.ejercicio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity 
@Data //Se creeen imaginariamente los getters y setters
/* Para decorar una clase como entidad se usa entity
 * Lo cual significa que esta clase representa una tabla de la base de datos
 */
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //LLave primaria
    private String name;
    private Integer price;
    private Integer launchYear;
    private String linkImage;

}
