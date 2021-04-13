package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.AvaliacaoDaApresentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoDaApresentacaoRepository extends JpaRepository<AvaliacaoDaApresentacao, Integer> {
}
