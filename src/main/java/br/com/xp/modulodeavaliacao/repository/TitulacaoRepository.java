package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Titulacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitulacaoRepository extends JpaRepository<Titulacao, Integer> {
}
