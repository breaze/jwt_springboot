package breaze.intro_spring.model.dto;

import lombok.Data;

@Data
public class ResultadoDTO {
    private boolean isExitoso;
    private String mensajeError;
}
