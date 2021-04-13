package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    Professor findByNome(String nome);
}
