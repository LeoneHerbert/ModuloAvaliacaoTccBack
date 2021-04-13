package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Departamento;
import br.com.xp.modulodeavaliacao.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoService {
    private final DepartamentoRepository departamentoRepository;

    private final GenericService<Departamento> genericService;

    @Autowired
    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
        this.genericService = new GenericService<Departamento>(departamentoRepository);
    }

    @Transactional
    public Departamento salva(Departamento departamento) {
        return this.genericService.salva(departamento);
    }

    @Transactional(readOnly = true)
    public Departamento buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<Departamento> todos() {
        return genericService.todos();
    }

    @Transactional
    public Departamento atualiza(Departamento departamento, Integer id) {
        return this.genericService.atualiza(departamento, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
