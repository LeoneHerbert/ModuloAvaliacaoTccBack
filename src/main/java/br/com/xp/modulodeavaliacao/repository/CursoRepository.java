package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
