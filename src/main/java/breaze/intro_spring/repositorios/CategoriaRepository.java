package breaze.intro_spring.repositorios;

import breaze.intro_spring.model.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
