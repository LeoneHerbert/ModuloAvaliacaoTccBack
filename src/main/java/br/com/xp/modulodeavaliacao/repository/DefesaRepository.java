package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Defesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefesaRepository extends JpaRepository<Defesa, Integer> {
}
