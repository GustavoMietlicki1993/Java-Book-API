package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria , Integer>{

    Categoria findById(int id);
}
