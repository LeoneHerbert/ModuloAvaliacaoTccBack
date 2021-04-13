package br.com.xp.modulodeavaliacao.repository;

import br.com.xp.modulodeavaliacao.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
