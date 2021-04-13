package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.AvaliacaoEscrita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoEscritaRepository extends JpaRepository<AvaliacaoEscrita, Integer> {
}
