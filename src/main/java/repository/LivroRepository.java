package repository;

import models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LivroRepository extends JpaRepository<Livro, Integer>{

    Livro findById(int id);
}
