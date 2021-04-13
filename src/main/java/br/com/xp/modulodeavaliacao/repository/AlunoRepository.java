package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    Aluno findByNome(String nome);
}
