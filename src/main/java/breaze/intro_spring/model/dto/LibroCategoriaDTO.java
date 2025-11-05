package breaze.intro_spring.model.dto;

import lombok.Data;

@Data
public class LibroCategoriaDTO {
    private Long categoria;
    private Integer prioridad;
    private String comentario;
}
