package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Banca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancaRepository extends JpaRepository<Banca, Integer> {
}
