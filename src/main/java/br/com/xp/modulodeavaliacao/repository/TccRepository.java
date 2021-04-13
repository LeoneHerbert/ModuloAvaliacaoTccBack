package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Tcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TccRepository extends JpaRepository<Tcc, Integer> {
}
