package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.DetalheDaBanca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalheDaBancaRepository extends JpaRepository<DetalheDaBanca, Integer> {
}
